# Clase Padre
class Persona:
    # Constructor
    def __init__(self, nombre, apellido, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def presentarse(self):
        return f"Soy {self.nombre} {self.apellido} con CI: {self.ci}."

# Clase Hija: 
class Cliente(Persona):
    # El constructor 
    def __init__(self, nombre, apellido, ci, nro_compra, id_cliente):
        super().__init__(nombre, apellido, ci) # Hereda nombre, apellido, ci
        self.nroCompra = nro_compra
        self.idCliente = id_cliente

    def presentarse(self):
        return f"{super().presentarse()} Soy un Cliente con Nro. de Compra: {self.nroCompra}."

# Clase Hija: 
class Jefe(Persona):
    # El constructor
    def __init__(self, nombre, apellido, ci, sucursal, tipo):
        super().__init__(nombre, apellido, ci) # Hereda nombre, apellido, ci
        self.sucursal = sucursal
        self.tipo = tipo

    def presentarse(self):
        return f"{super().presentarse()} Soy el Jefe de tipo '{self.tipo}' en la sucursal: {self.sucursal}."

# --- programa principal ---

p1 = Persona("Ana", "García", "123456")
c1 = Cliente("Luis", "Pérez", "789012", "C-001A", "ID-45")
j1 = Jefe("Mario", "López", "345678", "Central", "Gerente")


print(p1.presentarse())
print(c1.presentarse())
print(j1.presentarse())

print(f"El CI del cliente es: {c1.ci}") 
print(f"El id de cliente es: {c1.idCliente}") 