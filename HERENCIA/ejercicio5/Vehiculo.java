package ejercicio5;

public class Vehiculo {
    // Atributos 
    protected String conductor; 
    protected String placa;    
    protected int id;           

    // Constructor
    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    // Getters públicos para acceder a los atributos protegidos (Requisito b)
    public String getPlaca() {
        return placa;
    }

    public String getConductor() {
        return conductor;
    }

    // c) Método para cambiar al conductor de un vehículo
    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
        System.out.println("Conductor de la placa " + this.placa + " cambiado a: " + this.conductor);
    }
}





