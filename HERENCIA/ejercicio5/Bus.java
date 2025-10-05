package ejercicio5;

class Bus extends Vehiculo {
    // Atributos 
    private int capacidad;      
    private String sindicato;   

    // Constructor 
    public Bus(String conductor, String placa, int id, int capacidad, String sindicato) {
        super(conductor, placa, id);
        this.capacidad = capacidad;
        this.sindicato = sindicato;
    }
}