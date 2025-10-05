class Empleado:
    def __init__(self, nombre: str, sueldomes: float):
        self.nombre = nombre
        self.sueldomes = sueldomes

    # Método base para calcular el sueldo (básico)
    def SueldoTotal(self):
        """Calcula el sueldo base. Será sobrecargado en las subclases."""
        return self.sueldomes

    def __str__(self):
        return f"Empleado: {self.nombre}, Sueldo Base: ${self.sueldomes:.2f}"
    
class Administrativo(Empleado):
    def __init__(self, nombre: str, sueldomes: float, cargo: str):
        super().__init__(nombre, sueldomes)
        self.cargo = cargo

    # El sueldo total es el sueldo base.
    def SueldoTotal(self):
        return self.sueldomes

    def __str__(self):
        return f"Administrativo: {self.nombre}, Cargo: {self.cargo}, Sueldo Base: ${self.sueldomes:.2f}"
    
class Chef(Empleado):
    def __init__(self, nombre: str, sueldomes: float, horaExtre: int, tipo: str, sueldoHora: float):
        super().__init__(nombre, sueldomes)
        self.horaExtre = horaExtre
        self.tipo = tipo
        self.sueldoHora = sueldoHora

    # Sobrecarga/Override del método SueldoTotal (Punto c)
    def SueldoTotal(self):
        pago_extra = self.horaExtre * self.sueldoHora
        return self.sueldomes + pago_extra

    def __str__(self):
        return f"Chef: {self.nombre}, Tipo: {self.tipo}, H. Extra: {self.horaExtre}, Sueldo Total: ${self.SueldoTotal():.2f}"

class Mesero(Empleado):
    def __init__(self, nombre: str, sueldomes: float, propina: float, horaExtra: int, sueldoHora: float):
        super().__init__(nombre, sueldomes)
        self.propina = propina
        self.horaExtra = horaExtra
        self.sueldoHora = sueldoHora

    # Sobrecarga/Override del método SueldoTotal (Punto c)
    def SueldoTotal(self):
        pago_extra = self.horaExtra * self.sueldoHora
        return self.sueldomes + self.propina + pago_extra

    def __str__(self):
        return f"Mesero: {self.nombre}, Propina Est.: ${self.propina:.2f}, H. Extra: {self.horaExtra}, Sueldo Total: ${self.SueldoTotal():.2f}"



#    programa principal
# Lista para almacenar a todos los empleados
personal_ratatouille = []

# a) Instanciar 1 Chef, 2 Meseros y 2 Administrativos.
# Chef
remy = Chef("Remy", 3000.00, 15, "Sous Chef", 40.00) 
personal_ratatouille.append(remy)

# Meseros
emile = Mesero("Emile", 1800.00, 450.50, 10, 25.00)
personal_ratatouille.append(emile)
alfredo = Mesero("Alfredo", 1800.00, 300.00, 5, 25.00)
personal_ratatouille.append(alfredo)

# Administrativos
linguini = Administrativo("Linguini", 2500.00, "Gerente de Sala")
personal_ratatouille.append(linguini)
skinner = Administrativo("Skinner", 3500.00, "Gerente General")
personal_ratatouille.append(skinner)

print("--- Personal Instanciado y Sueldos Totales ---")
for empleado in personal_ratatouille:
    print(empleado) 
print("----------------------------------------------------------\n")

# b) Mostrar a aquellos Empleados que tengan sueldomes igual a X.

X = 1800.00 # sueldo a buscar

print(f"--- Empleados con Sueldo igual a ${X:.2f} ---")
encontrados = 0
for empleado in personal_ratatouille:
    if empleado.sueldomes == X:
        print(f"{empleado.nombre} ({empleado.__class__.__name__})")
        encontrados += 1

if encontrados == 0:
    print(f"No se encontró ningún empleado con sueldo base de ${X:.2f}.")

print("----------------------------------------------------------")