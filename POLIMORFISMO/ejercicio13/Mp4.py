class Mp4:
	def __init__(self, marca, capacidad_gb):
		self.marca = marca
		self.capacidad_gb = capacidad_gb
		self.nro_canciones = 0
		self.canciones = []  # cada canción: dict con nombre, artista, peso (Kb)
		self.nro_videos = 0
		self.videos = []     # cada video: dict con nombre, artista, peso (Mb)

	# a) Sobrecargar método para borrar canción
	def borrar_cancion(self, nombre=None, artista=None, peso=None):
		original = len(self.canciones)
		self.canciones = [c for c in self.canciones if not (
			(nombre is not None and c['nombre'] == nombre) or
			(artista is not None and c['artista'] == artista) or
			(peso is not None and c['peso'] == peso)
		)]
		self.nro_canciones = len(self.canciones)
		print(f"Se eliminaron {original - self.nro_canciones} canciones.")

	# b) Sobrecargar operador + para añadir canción
	def __add__(self, cancion):
		# cancion: dict con nombre, artista, peso
		if self.nro_canciones >= 100:
			print("No hay espacio para más canciones.")
			return self
		if any(c['nombre'] == cancion['nombre'] and c['artista'] == cancion['artista'] for c in self.canciones):
			print("La canción ya existe.")
			return self
		if self.capacidad_disponible_kb() < cancion['peso']:
			print("No hay suficiente espacio para la canción.")
			return self
		self.canciones.append(cancion)
		self.nro_canciones += 1
		print(f"Canción '{cancion['nombre']}' añadida.")
		return self

	# c) Sobrecargar operador - para añadir video
	def __sub__(self, video):
		# video: dict con nombre, artista, peso (Mb)
		if self.nro_videos >= 100:
			print("No hay espacio para más videos.")
			return self
		if any(v['nombre'] == video['nombre'] and v['artista'] == video['artista'] for v in self.videos):
			print("El video ya existe.")
			return self
		if self.capacidad_disponible_mb() < video['peso']:
			print("No hay suficiente espacio para el video.")
			return self
		self.videos.append(video)
		self.nro_videos += 1
		print(f"Video '{video['nombre']}' añadido.")
		return self

	# d) Mostrar capacidad disponible
	def capacidad_disponible_kb(self):
		total_kb = self.capacidad_gb * 1024 * 1024
		usado_kb = sum(c['peso'] for c in self.canciones) + sum(v['peso'] * 1024 for v in self.videos)
		return total_kb - usado_kb

	def capacidad_disponible_mb(self):
		return self.capacidad_disponible_kb() / 1024

	def mostrar_capacidad(self):
		print(f"Capacidad disponible: {self.capacidad_disponible_mb():.2f} MB")

	def mostrar_canciones(self):
		print("Canciones:")
		for c in self.canciones:
			print(f"  {c['nombre']} - {c['artista']} ({c['peso']} Kb)")

	def mostrar_videos(self):
		print("Videos:")
		for v in self.videos:
			print(f"  {v['nombre']} - {v['artista']} ({v['peso']} Mb)")

# programa prinicpal

mp4 = Mp4("Sony", 1)  # 1 GB
# Añadir canciones
mp4 = mp4 + {'nombre': 'Back To Black', 'artista': 'Amy Winehouse', 'peso': 100}
mp4 = mp4 + {'nombre': 'Lost On You', 'artista': 'LP', 'peso': 150}
mp4.mostrar_canciones()
# Añadir videos
mp4 = mp4 - {'nombre': 'Heathens', 'artista': 'twenty one pilots', 'peso': 50}
mp4 = mp4 - {'nombre': 'Harmonica Andromeda', 'artista': 'KSHMR', 'peso': 70}
mp4 = mp4 - {'nombre': 'Without Me', 'artista': 'Halsey', 'peso': 30}
mp4.mostrar_videos()
# Mostrar capacidad
mp4.mostrar_capacidad()
# Borrar canción por nombre
mp4.borrar_cancion(nombre='Lost On You')
mp4.mostrar_canciones()
