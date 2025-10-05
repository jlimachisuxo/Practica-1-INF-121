class Animal:
    # Constructor
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    # Método desplazarse() (versión base)
    def desplazarse(self):
        print(f"{self.nombre} se está moviendo.")

# Subclase Leon
class Leon(Animal):
    # Constructor (llama al constructor de la clase base con super())
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    # Redefinición del método desplazarse()
    def desplazarse(self):
        print(f"Leon {self.nombre} está caminando rápidamente.")

# Subclase Pinguino
class Pinguino(Animal):
    # Constructor
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    # Redefinición del método desplazarse()
    def desplazarse(self):
        print(f"Pinguino {self.nombre} está nadando o caminando torpemente.")

# Subclase Canguro
class Canguro(Animal):
    # Constructor
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)

    # Redefinición del método desplazarse()
    def desplazarse(self):
        print(f"Canguro {self.nombre} está saltando ágilmente.")

# programa principal
# c) Crea un arreglo (lista) de animales
zoologico = [
    Leon("Simba", 5),
    Pinguino("Skipper", 3),
    Canguro("Joey", 2)
]

print("--- El Zoológico en Movimiento ---")

# Hace que cada uno se desplace
for animal in zoologico:
    animal.desplazarse() # Llama a la versión específica de cada subclase