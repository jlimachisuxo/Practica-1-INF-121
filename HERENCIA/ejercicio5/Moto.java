package ejercicio5;

class Moto extends Vehiculo {
    // Atributos 
    private int cilindrada; 
    private boolean casco;  

    // Constructor 
    public Moto(String conductor, String placa, int id, int cilindrada, boolean casco) {
        super(conductor, placa, id);
        this.cilindrada = cilindrada;
        this.casco = casco;
    }
}