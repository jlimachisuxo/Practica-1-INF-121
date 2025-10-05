# Modelado de ordenadores y laboratorios Lasin

class Ordenador:
	def __init__(self, serial, numero, ram, procesador, estado):
		self.serial = serial
		self.numero = numero
		self.ram = ram
		self.procesador = procesador
		self.estado = estado  # 'activo' o 'inactivo'

	def __str__(self):
		return f"Serial: {self.serial}, Nro: {self.numero}, RAM: {self.ram}GB, CPU: {self.procesador}, Estado: {self.estado}"

class Laboratorio:
	def __init__(self, nombre, capacidad):
		self.nombre = nombre
		self.capacidad = capacidad
		self.ordenadores = []  # lista de objetos Ordenador

	def agregar_ordenador(self, ordenador):
		if len(self.ordenadores) < self.capacidad:
			self.ordenadores.append(ordenador)
		else:
			print(f"No hay espacio en {self.nombre} para agregar el ordenador {ordenador.serial}")

	# Sobrecarga de informacion
	def informacion(self, filtro=None):
		if filtro is None:
			print(f"\nOrdenadores en {self.nombre}:")
			for o in self.ordenadores:
				print(o)
		elif filtro == 'activo' or filtro == 'inactivo':
			print(f"\nOrdenadores en {self.nombre} con estado '{filtro}':")
			for o in self.ordenadores:
				if o.estado == filtro:
					print(o)
		elif filtro == 'mas8ram':
			print(f"\nOrdenadores en {self.nombre} con más de 8GB RAM:")
			for o in self.ordenadores:
				if o.ram > 8:
					print(o)
		else:
			print(f"Filtro no reconocido")

	def codigos_seriales(self):
		return [o.serial for o in self.ordenadores]

	def quitar_ordenador(self, serial):
		for i, o in enumerate(self.ordenadores):
			if o.serial == serial:
				return self.ordenadores.pop(i)
		return None

# Función para trasladar ordenadores
def trasladar_ordenadores(lab_origen, lab_destino, seriales):
	print("\nEstado antes del traslado:")
	lab_origen.informacion()
	lab_destino.informacion()
	for serial in seriales:
		ordenador = lab_origen.quitar_ordenador(serial)
		if ordenador:
			lab_destino.agregar_ordenador(ordenador)
	print("\nEstado después del traslado:")
	lab_origen.informacion()
	lab_destino.informacion()

# programa principal

# Crear laboratorios
lasin1 = Laboratorio("Lasin 1", 4)
lasin2 = Laboratorio("Lasin 2", 4)
# Crear ordenadores
o1 = Ordenador("A001", 1, 4, "i3", "activo")
o2 = Ordenador("A002", 2, 8, "i5", "activo")
o3 = Ordenador("A003", 3, 16, "i7", "inactivo")
o4 = Ordenador("A004", 4, 12, "i5", "activo")
o5 = Ordenador("A005", 5, 6, "i3", "inactivo")
o6 = Ordenador("A006", 6, 16, "i9", "activo")
# Asignar ordenadores a laboratorios
lasin1.agregar_ordenador(o1)
lasin1.agregar_ordenador(o2)
lasin1.agregar_ordenador(o3)
lasin1.agregar_ordenador(o4)
lasin2.agregar_ordenador(o5)
lasin2.agregar_ordenador(o6)
# Mostrar información por estado
lasin1.informacion('activo')
lasin2.informacion('inactivo')
# Mostrar ordenadores de un laboratorio
lasin1.informacion()
# Mostrar ordenadores con más de 8GB RAM
lasin1.informacion('mas8ram')
lasin2.informacion('mas8ram')
# Trasladar dos ordenadores de Lasin 1 a Lasin 2
trasladar_ordenadores(lasin1, lasin2, ["A002", "A004"])
