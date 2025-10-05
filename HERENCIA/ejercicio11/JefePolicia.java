package ejercicio11;

public class JefePolicia extends Persona implements IEmpleado, IPolicia {
    // Atributos 
    private int numSubordinados;
    private String areaMando;
    
    // Atributos de las interfaces
    private String idEmpleado;
    private double sueldo;
    private String grado;
    private String placa;

    public JefePolicia(String nombre, int edad, String idEmpleado, double sueldo, String grado, String placa, int numSubordinados, String areaMando) {
        super(nombre, edad); // Atributos de Persona
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.grado = grado;
        this.placa = placa;
        this.numSubordinados = numSubordinados; // Atributos de JefePolicia
        this.areaMando = areaMando;
    }

    // Implementación de IEmpleado
    @Override
    public String getIDEmpleado() {
        return idEmpleado;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    // Implementación de IPolicia
    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    // Método propio de JefePolicia
    public void mostrarDatosCompletos() {
        System.out.println("--- Datos de Jefe de Policía ---");
        mostrarDatosPersona();
        System.out.println("  ID Empleado: " + idEmpleado);
        System.out.println("  Sueldo: $" + String.format("%,.2f", sueldo));
        System.out.println("  Grado: " + grado);
        System.out.println("  Placa: " + placa);
        System.out.println("  Nro. Subordinados: " + numSubordinados);
        System.out.println("  Área de Mando: " + areaMando);
        realizarArresto(); // Método heredado 
    }
}