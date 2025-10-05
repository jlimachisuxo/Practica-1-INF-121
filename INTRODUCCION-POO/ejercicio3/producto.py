class Producto:
	def __init__(self, nombre: str, precio: float, stock: int):
		self.nombre = nombre
		self.precio = precio
		self.stock = stock

	def vender(self, cantidad: int):
		if cantidad > self.stock:
			print(f"No hay suficiente stock para vender {cantidad} unidades de {self.nombre}.")
		else:
			self.stock -= cantidad
			print(f"Se vendieron {cantidad} unidades de {self.nombre}. Stock restante: {self.stock}")

	def reabastecer(self, cantidad: int):
		self.stock += cantidad
		print(f"Se reabastecieron {cantidad} unidades de {self.nombre}. Stock actual: {self.stock}")

# programa principal

p1 = Producto("Galletas", 2.5, 10)
p1.vender(3)
p1.reabastecer(5)
p1.vender(15)
p1.vender(4)
