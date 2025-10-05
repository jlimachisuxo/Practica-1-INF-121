package ejercicio2;

public class TestBus {
    public static void main(String[] args) {
        // instancia de un objeto de la clase Bus
        Bus bus1 = new Bus(14); 
        
        System.out.println("Estado inicial del bus:");
        bus1.mostrarBus();
        System.out.println("---------------------");

        // suben 5 pasajeros
        bus1.subirPasajero(5);
        System.out.println(" ");

        //mostrando cuantos asientos quedan disponibles
        System.out.println("Asientos disponibles: " + bus1.getAsientosDisponibles());
        System.out.println("");

        // intentar subir mas pasajeros de los que caben
        bus1.subirPasajero(10);
        System.out.println(" ");

        // cobrar pasaje a los pasajeros actuales
        System.out.println("Se cobro pasaje a todos los pasajeros que subieron");
        System.out.println("Total recaudado hasta ahora: Bs. " + bus1.cobrarPasaje());
        System.out.println("");

        System.out.println("estado final del bus:");
        bus1.mostrarBus();
    }
    

}
