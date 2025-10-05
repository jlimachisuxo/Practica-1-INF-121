# Clase Matriz 10x10
class Matriz:
	def __init__(self, datos=None):
		self.n = 10
		if datos is None:
			# Matriz identidad
			self.matriz = [[1.0 if i == j else 0.0 for j in range(self.n)] for i in range(self.n)]
		else:
			if len(datos) != self.n or any(len(fila) != self.n for fila in datos):
				raise ValueError("La matriz debe ser de 10x10")
			self.matriz = [[float(datos[i][j]) for j in range(self.n)] for i in range(self.n)]

	def sumar(self, otra):
		resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(self.n)] for i in range(self.n)]
		return Matriz(resultado)

	def restar(self, otra):
		resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(self.n)] for i in range(self.n)]
		return Matriz(resultado)

	def igual(self, otra):
		for i in range(self.n):
			for j in range(self.n):
				if self.matriz[i][j] != otra.matriz[i][j]:
					return False
		return True

	def __str__(self):
		return '\n'.join([' '.join([f"{self.matriz[i][j]:.1f}" for j in range(self.n)]) for i in range(self.n)])

# programa principal

m1 = Matriz()  # Matriz identidad
datos = [[float(i+j) for j in range(10)] for i in range(10)]
m2 = Matriz(datos)
suma = m1.sumar(m2)
resta = m2.restar(m1)
print("Matriz identidad:\n", m1)
print("\nMatriz datos:\n", m2)
print("\nSuma:\n", suma)
print("\nResta:\n", resta)
print("\n¿m1 == m2?", m1.igual(m2))
print("¿m1 == m1?", m1.igual(m1))
