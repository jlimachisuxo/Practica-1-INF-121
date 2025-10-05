# Clase Videojuego con sobrecarga de constructores y métodos
class Videojuego:
	def __init__(self, nombre=None, plataforma=None, cantidad_jugadores=1):
		if nombre is None and plataforma is None:
			self.nombre = "Desconocido"
			self.plataforma = "Desconocida"
			self.cantidad_jugadores = 1
		elif plataforma is None:
			self.nombre = nombre
			self.plataforma = "Desconocida"
			self.cantidad_jugadores = 1
		else:
			self.nombre = nombre
			self.plataforma = plataforma
			self.cantidad_jugadores = cantidad_jugadores

	# Sobrecarga de agregarJugadores
	def agregarJugadores(self, cantidad=None):
		if cantidad is None:
			self.cantidad_jugadores += 1
			print(f"Se agregó 1 jugador. Total: {self.cantidad_jugadores}")
		else:
			try:
				cantidad = int(cantidad)
				self.cantidad_jugadores += cantidad
				print(f"Se agregaron {cantidad} jugadores. Total: {self.cantidad_jugadores}")
			except ValueError:
				print("Cantidad inválida.")

	def __str__(self):
		return f"Videojuego: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidad_jugadores}"

# programa principal

v1 = Videojuego("FIFA 23", "PS5", 2)
v2 = Videojuego("Minecraft")
v3 = Videojuego()
print(v1)
print(v2)
print(v3)
v1.agregarJugadores()
v2.agregarJugadores(3)
# Para agregar por teclado
cantidad = input("¿Cuántos jugadores agregar a Minecraft?: ")
v2.agregarJugadores(cantidad)
print(v2)
