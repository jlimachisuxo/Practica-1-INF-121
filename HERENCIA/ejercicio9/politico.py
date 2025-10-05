# Clase Padre 1: Politico
class Politico:

    def __init__(self, profesion, añosExp):
        self.profesion = profesion
        self.añosExp = añosExp

    def mostrar_profesion(self):
        return self.profesion

    def mostrar_años_exp(self):
        return self.añosExp

# Clase Padre 2: Partido
class Partido:

    def __init__(self, nombreP, rol):
        self.nombreP = nombreP
        self.rol = rol

    def mostrar_partido(self):
        return self.nombreP

    def mostrar_rol(self):
        return self.rol

# Clase Hija: Presidente 
class Presidente(Politico, Partido):

    def __init__(self, nombre, apellido, profesion, añosExp, nombreP, rol):
        # Inicialización de la clase Politico
        Politico.__init__(self, profesion, añosExp)
        # Inicialización de la clase Partido
        Partido.__init__(self, nombreP, rol)
        
        # Atributos propios de Presidente
        self.nombre = nombre
        self.apellido = apellido

    def __str__(self):
        
        return (f"Presidente: {self.nombre} {self.apellido}\n"
                f"  Profesión: {self.profesion}, Años Exp: {self.añosExp}\n"
                f"  Partido: {self.nombreP}, Rol: {self.rol}")

    def mostrar_datos_completos(self):
   
        return (self.nombre, self.mostrar_partido(), self.mostrar_profesion())
    

# progrma principal
# a) Forma 1: Instancia Directa
presidente1 = Presidente(
    nombre="Juan",
    apellido="Perez",
    profesion="Abogado",
    añosExp=25,
    nombreP="Frente Unido",
    rol="Líder"
)

print("--- Instancia Forma 1 (Directa) ---")
print(presidente1)

# b) Forma 2: 
datos_presidente2 = {
    "nombre": "Maria",
    "apellido": "Gomez",
    "profesion": "Economista",
    "añosExp": 15,
    "nombreP": "Alianza Cívica",
    "rol": "Vocera"
}

presidente2 = Presidente(**datos_presidente2)

print("\n--- Instancia Forma 2 ---")
print(presidente2)