class Vehiculo:
    # Constructor 
    def __init__(self, conductor: str, placa: str, id: int):
        
        self._conductor = conductor
        self._placa = placa
        self._id = id
    
    # Getters para la placa y el conductor (Requisito b)
    def get_placa(self):
        return self._placa

    def get_conductor(self):
        return self._conductor
    
    # c) Método para cambiar al conductor de un vehículo
    def cambiar_conductor(self, nuevo_conductor: str):
        self._conductor = nuevo_conductor
        print(f"Conductor de la placa {self._placa} cambiado a: {self._conductor}")

# Subclase Bus
class Bus(Vehiculo):
    def __init__(self, conductor: str, placa: str, id: int, capacidad: int, sindicato: str):
        # Llamar al constructor de la Superclase
        super().__init__(conductor, placa, id) 
        self._capacidad = capacidad
        self._sindicato = sindicato

# Subclase Auto
class Auto(Vehiculo):
    def __init__(self, conductor: str, placa: str, id: int, caballosFuerza: int, descapotable: bool):
        # Llamar al constructor de la Superclase
        super().__init__(conductor, placa, id) 
        self._caballosFuerza = caballosFuerza
        self._descapotable = descapotable

# Subclase Moto
class Moto(Vehiculo):
    def __init__(self, conductor: str, placa: str, id: int, cilindrada: int, casco: bool):
        # Llamar al constructor de la Superclase
        super().__init__(conductor, placa, id) 
        self._cilindrada = cilindrada
        self._casco = casco

# --- programa Principal ---

# a) Instanciar un vehículo de cada tipo
print("--- a) Instanciación de vehículos ---")
bus1 = Bus("Roberto Gómez", "AZ-1234", 101, 50, "Transporte Urbano")
auto1 = Auto("Laura Pérez", "CB-5678", 201, 150, True)
moto1 = Moto("Carlos Ruiz", "LP-9012", 301, 250, True)
print("3 Vehículos instanciados correctamente.")

print("\n--- b) Mostrar Placa y Conductor ---")
# b) Mostrar La placa y conductor cada vehículo.

print(f"BUS: Placa={bus1.get_placa()}, Conductor={bus1.get_conductor()}")
print(f"AUTO: Placa={auto1.get_placa()}, Conductor={auto1.get_conductor()}")
print(f"MOTO: Placa={moto1.get_placa()}, Conductor={moto1.get_conductor()}")

print("\n--- c) Cambiar Conductor (Método cambiar_conductor) ---")
# c) Crear un método para cambiar al conductor de un vehículo

# Cambiando el conductor del Bus
print(f"Conductor actual del Bus: {bus1.get_conductor()}")
bus1.cambiar_conductor("Juan Mamani")

# Cambiando el conductor del Auto
print(f"Conductor actual del Auto: {auto1.get_conductor()}")
auto1.cambiar_conductor("Sofía Morales")