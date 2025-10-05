package ejercicio5;

public class Persona {
    // atributos
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    // contructor
    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }

    // metodos
    public void mostrarDatos(){
        System.out.println("---Datos de la persona---");
        System.out.println("Nombre: " + this.nombre + " " + this.paterno + " " + this.materno);
        System.out.println("Edad: " + this.edad);
        System.out.println("CI: " + this.ci);
        System.out.println("");
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public void modificarEdad(int nueaEdad){
        this.edad = nueaEdad;
        System.out.println("La edad de " + this.nombre + " ha sido modificads a " + this.edad + " anos.");

    }

    // metodo para obtener el apellido paterno, para comparar los apellidos
    public String getPaterno(){
        return this.paterno;
    }
}
