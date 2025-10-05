class Celular:
	def __init__(self, nroTel, dueño, espacio, ram, nroApp):
		self.nroTel = nroTel
		self.dueño = dueño
		self.espacio = espacio  # en GB
		self.ram = ram
		self.nroApp = nroApp

	# Sobrecarga ++ (aumenta nroApp en 10)
	def __add__(self, otro):
		if otro == "++":
			self.nroApp += 10
		return self

	# Sobrecarga -- (disminuye espacio en 5GB)
	def __sub__(self, otro):
		if otro == "--":
			self.espacio -= 5
		return self

	def __str__(self):
		return (f"Celular(nroTel={self.nroTel}, dueño={self.dueño}, "
				f"espacio={self.espacio}GB, ram={self.ram}GB, nroApp={self.nroApp})")
	
# programa principal

cel = Celular("796522029", "Ana", 64, 4, 15)
print("Antes:")
print(cel)
cel += "++"  # aumenta nroApp en 10
cel -= "--"  # disminuye espacio en 5GB
print("Después:")
print(cel)
