package ejercicio7;

class Docente extends Persona {
    // Atributos 
    private double sueldo;
    private String regProfecional;

    // Constructor 
    public Docente(String nombre, String paterno, String materno, int edad, double sueldo, String regProfecional) {
        super(nombre, paterno, materno, edad); 
        this.sueldo = sueldo;
        this.regProfecional = regProfecional;
    }

    // b) Implementación del método mostrar() 
    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("--- DATOS DOCENTE ---");
        System.out.println("Sueldo: " + sueldo + " Bs.");
        System.out.println("Registro Profesional: " + regProfecional);
    }
}
