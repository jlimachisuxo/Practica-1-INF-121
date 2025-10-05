package ejercicio5;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar un vehículo de cada tipo
        System.out.println("--- a) Instanciación de vehículos ---");
        Bus bus1 = new Bus("Roberto Gómez", "AZ-1234", 101, 50, "Transporte Urbano");
        Auto auto1 = new Auto("Laura Pérez", "CB-5678", 201, 150, true);
        Moto moto1 = new Moto("Carlos Ruiz", "LP-9012", 301, 250, true);
        System.out.println("3 Vehículos instanciados correctamente.");

        System.out.println("\n--- b) Mostrar Placa y Conductor ---");
        // b) Mostrar La placa y conductor cada vehículo.
        
        System.out.println("BUS: Placa=" + bus1.getPlaca() + ", Conductor=" + bus1.getConductor());
        System.out.println("AUTO: Placa=" + auto1.getPlaca() + ", Conductor=" + auto1.getConductor());
        System.out.println("MOTO: Placa=" + moto1.getPlaca() + ", Conductor=" + moto1.getConductor());

        System.out.println("\n--- c) Cambiar Conductor (Método cambiarConductor) ---");
        // c) Crear un método para cambiar al conductor de un vehículo
        
        // Cambiando el conductor del Bus
        System.out.println("Conductor actual del Bus: " + bus1.getConductor());
        bus1.cambiarConductor("Juan Mamani");

        // Cambiando el conductor del Auto
        System.out.println("Conductor actual del Auto: " + auto1.getConductor());
        auto1.cambiarConductor("Sofía Morales");
    }
}