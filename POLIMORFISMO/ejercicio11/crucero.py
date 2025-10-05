# Clase Pasajero
class Pasajero:
	def __init__(self, nombre, edad, genero):
		self.nombre = nombre
		self.edad = edad
		self.genero = genero

	# ++ leer datos
	def __iadd__(self, other):
		if other == "++":
			self.nombre = input("Nombre: ")
			self.edad = int(input("Edad: "))
			self.genero = input("Género: ")
		return self

	# -- mostrar datos
	def __isub__(self, other):
		if other == "--":
			print(f"Pasajero: {self.nombre}, Edad: {self.edad}, Género: {self.genero}")
		return self

# Clase Crucero
class Crucero:
	def __init__(self, nombre, paisOrigen, paisDestino, nroPasajeros=0):
		self.nombre = nombre
		self.paisOrigen = paisOrigen
		self.paisDestino = paisDestino
		self.nroPasajeros = nroPasajeros
		self.pasajeros = [["" for _ in range(100)] for _ in range(3)] # [3][100] matriz de strings

	# ++ leer datos
	def __iadd__(self, other):
		if other == "++":
			self.nombre = input("Nombre crucero: ")
			self.paisOrigen = input("País origen: ")
			self.paisDestino = input("País destino: ")
			self.nroPasajeros = int(input("Número de pasajeros: "))
		return self

	# -- mostrar datos
	def __isub__(self, other):
		if other == "--":
			print(f"Crucero: {self.nombre}, Origen: {self.paisOrigen}, Destino: {self.paisDestino}, Pasajeros: {self.nroPasajeros}")
			for j in range(self.nroPasajeros):
				print(f"  - Nombre: {self.pasajeros[0][j]}, Edad: {self.pasajeros[1][j]}, Género: {self.pasajeros[2][j]}")
		return self

	# == suma total de pasajes (simulado: edad como costo)
	def __eq__(self, other):
		suma = 0
		for j in range(self.nroPasajeros):
			try:
				suma += float(self.pasajeros[1][j]) # Usamos edad como costo
			except:
				pass
		for j in range(other.nroPasajeros):
			try:
				suma += float(other.pasajeros[1][j])
			except:
				pass
		print(f"Suma total de pasajes (simulado): {suma}")
		return suma

	# + comparar cantidad de pasajeros
	def __add__(self, other):
		iguales = self.nroPasajeros == other.nroPasajeros
		print(f"¿Cantidad de pasajeros igual?: {iguales}")
		return iguales

	# - mostrar cuántos hombres y mujeres
	def __sub__(self, other):
		hombres = 0
		mujeres = 0
		for j in range(self.nroPasajeros):
			genero = self.pasajeros[2][j].lower()
			if genero == "masculino":
				hombres += 1
			elif genero == "femenino":
				mujeres += 1
		print(f"Crucero {self.nombre}: {hombres} hombre(s), {mujeres} mujer(es)")
		return (hombres, mujeres)

# Ejemplo de uso
if __name__ == "__main__":
	# Instanciar 2 cruceros
	c1 = Crucero("Caribeño", "Perú", "México", 3)
	c2 = Crucero("Pacífico", "Chile", "Ecuador", 2)

	# Instanciar 5 pasajeros
	p1 = Pasajero("Juan Vargas", 30, "masculino")
	p2 = Pasajero("Martina Vasques", 25, "femenino")
	p3 = Pasajero("Wilmer Montero", 40, "masculino")
	p4 = Pasajero("Ana López", 28, "femenino")
	p5 = Pasajero("Luis Pérez", 35, "masculino")

	# Asignar datos a la matriz pasajeros[3][100]
	# Crucero 1
	c1.pasajeros[0][0] = p1.nombre
	c1.pasajeros[1][0] = str(p1.edad)
	c1.pasajeros[2][0] = p1.genero

	c1.pasajeros[0][1] = p2.nombre
	c1.pasajeros[1][1] = str(p2.edad)
	c1.pasajeros[2][1] = p2.genero

	c1.pasajeros[0][2] = p3.nombre
	c1.pasajeros[1][2] = str(p3.edad)
	c1.pasajeros[2][2] = p3.genero

	# Crucero 2
	c2.pasajeros[0][0] = p4.nombre
	c2.pasajeros[1][0] = str(p4.edad)
	c2.pasajeros[2][0] = p4.genero

	c2.pasajeros[0][1] = p5.nombre
	c2.pasajeros[1][1] = str(p5.edad)
	c2.pasajeros[2][1] = p5.genero

	# Mostrar datos de los cruceros
	print("\n--- Mostrar datos con operador -- ---")
	c1 -= "--"
	c2 -= "--"

	print("\n--- Suma total de pasajes con operador == ---")
	c1 == c2

	print("\n--- Comparar cantidad de pasajeros con operador + ---")
	c1 + c2

	print("\n--- Mostrar cantidad de hombres y mujeres con operador - ---")
	c1 - None
	c2 - None
