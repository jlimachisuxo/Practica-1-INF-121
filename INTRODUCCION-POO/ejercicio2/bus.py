# Clase Bus que modela la abstracción de un bus
class Bus:
	def __init__(self, capacidad):
		self.capacidad = capacidad
		self.pasajeros = 0
		self.caja = 0.0

	def subir_pasajeros(self, cantidad):
		disponibles = self.capacidad - self.pasajeros
		if cantidad <= disponibles:
			self.pasajeros += cantidad
			print(f"Subieron {cantidad} pasajeros.")
		else:
			self.pasajeros = self.capacidad
			print(f"Solo subieron {disponibles} pasajeros, el bus está lleno.")

	def cobrar_pasaje(self):
		costo = 1.50
		total = self.pasajeros * costo
		self.caja += total
		print(f"Se cobraron Bs. {total:.2f} a {self.pasajeros} pasajeros.")
		self.pasajeros = 0  # Todos pagan y bajan

	def asientos_disponibles(self):
		disponibles = self.capacidad - self.pasajeros
		print(f"Asientos disponibles: {disponibles}")
		return disponibles

# programa principal

bus = Bus(capacidad=30)
bus.subir_pasajeros(25)
bus.asientos_disponibles()
bus.cobrar_pasaje()
bus.asientos_disponibles()
bus.subir_pasajeros(10)
bus.asientos_disponibles()
