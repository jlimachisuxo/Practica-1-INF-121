package ejercicio11;

public class Main {
    public static void main(String[] args) {
        // a) Crea 2 objetos de la clase hija y mostrar sus datos
        
        JefePolicia jp1 = new JefePolicia(
            "Ricardo Paz", 45, "JP001", 12500.00, "Coronel", "PZ-1001", 50, "Central"
        );

        JefePolicia jp2 = new JefePolicia(
            "Elena Robles", 38, "JP002", 15800.00, "General", "RB-2002", 120, "División Sur"
        );

        jp1.mostrarDatosCompletos();
        System.out.println();
        jp2.mostrarDatosCompletos();

        System.out.println("\n-------------------------------------");

        // b) Mostrar el nombre de aquel que tiene mayor sueldo.
        System.out.print("b) Mayor Sueldo: ");
        if (jp1.getSueldo() > jp2.getSueldo()) {
            System.out.println(jp1.getNombre() + " con $" + String.format("%,.2f", jp1.getSueldo()));
        } else if (jp2.getSueldo() > jp1.getSueldo()) {
            System.out.println(jp2.getNombre() + " con $" + String.format("%,.2f", jp2.getSueldo()));
        } else {
            System.out.println("Ambos tienen el mismo sueldo.");
        }

        // c) Comparar si ambos tienen mismo grado
        System.out.print("c) Mismo Grado: ");
        if (jp1.getGrado().equalsIgnoreCase(jp2.getGrado())) {
            System.out.println("Sí, ambos tienen el grado de " + jp1.getGrado() + ".");
        } else {
            System.out.println("No, sus grados son diferentes ( " + jp1.getGrado() + " vs " + jp2.getGrado() + " ).");
        }
        
        System.out.println("-------------------------------------");

    }
}
