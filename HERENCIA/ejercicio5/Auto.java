package ejercicio5;

class Auto extends Vehiculo {
    // Atributos 
    private int caballosFuerza;  
    private boolean descapotable; 

    // Constructor 
    public Auto(String conductor, String placa, int id, int caballosFuerza, boolean descapotable) {
        super(conductor, placa, id);
        this.caballosFuerza = caballosFuerza;
        this.descapotable = descapotable;
    }
}
