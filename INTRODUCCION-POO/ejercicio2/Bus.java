package ejercicio2;
// Ejercicio 2. Realiza la abstracción de un Bus.
// a) Al bus desean subir X cantidad de pasajeros, actualiza los datos del bus.
// b) Crea un método para cobrar pasaje a los pasajeros. (Costo del pasaje: bs. 1.50)’
// c) Muestra cuántos asientos quedan disponibles.
// d) Crea una instancia del bus y utiliza los métodos de los incisos anteriores.
public class Bus {
    //atributos
    private int capacidad;
    private int pasajerosActuales;
    private double costoPasaje = 1.50;

    //constructor
    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajerosActuales = 0; //el bus esta vacio        
    }

    //metodos
    public void subirPasajero(int numPasajeros){
        if(this.pasajerosActuales + numPasajeros <= this.capacidad){
            this.pasajerosActuales += numPasajeros;
            System.out.println(numPasajeros + " pasajeros subiendo al bus.");

        }
        else{
            System.out.println("No hay espacio para " + numPasajeros + " pasajeros.");
        }        
    }

    public double cobrarPasaje(){
        return this.pasajerosActuales * this.costoPasaje;
    }

    public int getAsientosDisponibles(){
        return this.capacidad - this.pasajerosActuales;
    }

    public void mostrarBus(){
        System.out.println("Capacidad del bus: " + this.capacidad);
        System.out.println("Pasajeros actuales: " + this.pasajerosActuales);
        System.out.println("Asientos disponibles:" + getAsientosDisponibles());
        System.out.println("Total recaudado: Bs. " + cobrarPasaje());
    }

}
