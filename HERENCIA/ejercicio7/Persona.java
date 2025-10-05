package ejercicio7;


public class Persona {
    // Atributos 
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected int edad;

    // Constructor 
    public Persona(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    // Getters 
    public int getEdad() {
        return edad;
    }
    
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad > 0 && nuevaEdad != this.edad) {
            this.edad = nuevaEdad;
            System.out.println("-> Edad de " + nombre + " actualizada a " + nuevaEdad + " años.");
        }
    }

    // b) Método mostrar() 
    public void mostrar() {
        System.out.println("--- DATOS PERSONALES ---");
        System.out.println("Nombre Completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad + " años");
    }
}


