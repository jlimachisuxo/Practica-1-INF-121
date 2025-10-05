class Nadador:
    def __init__(self, estiloNatacion):
        self.estiloNatacion = estiloNatacion

    def nadar(self):
        print(f"Nadando estilo {self.estiloNatacion}.")

class Ciclista:
    def __init__(self, tipoBicicleta):
        self.tipoBicicleta = tipoBicicleta

    def pedalear(self):
        print(f"Pedaleando en bicicleta tipo {self.tipoBicicleta}.")

class Corredor:
    """Clase para representar a un corredor."""
    def __init__(self, distanciaPreferida):
        self.distanciaPreferida = distanciaPreferida

    def correr(self):
        print(f"Corriendo una distancia de {self.distanciaPreferida} km.")

# 2. Clase Triatleta (Hereda de las tres)

class Triatleta(Nadador, Ciclista, Corredor):

    def __init__(self, nombre, estilo, bicicleta, distancia):
        # Inicializa la parte de Nadador
        Nadador.__init__(self, estilo)
        # Inicializa la parte de Ciclista
        Ciclista.__init__(self, bicicleta)
        # Inicializa la parte de Corredor
        Corredor.__init__(self, distancia)
        # Atributo propio del triatleta 
        self.nombre = nombre
        print(f"\n¡{self.nombre} es un Triatleta, listo para la acción!")



#   programa principal

# b) Instanciar un objeto Triatleta con valores para los atributos heredados.
triatleta1 = Triatleta(
    nombre="Javier Gómez Noya", 
    estilo="Crol (Freestyle)", 
    bicicleta="Ruta/Aero", 
    distancia=10  # 10 km
)

# c) métodos heredados para mostrar las acciones del triatleta.
print("\n--- Acciones del Triatleta ---")

triatleta1.nadar()

triatleta1.pedalear()

triatleta1.correr()

print("-----------------------------")