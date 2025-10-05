
package ejercicio13;

public class TestFruta {
	public static void main(String[] args) {
    // 1. Crear frutas
    String[] vitaminasKiwi = {"K", "C", "E"};
    Fruta kiwi = new Fruta("kiwi", "subtropical", 3, vitaminasKiwi);
    Fruta naranja = new Fruta("naranja", "citrica", "C", "A");
    Fruta mango = new Fruta("mango", "tropical");
    mango.agregarVitamina("A");
    mango.agregarVitamina("E");

    // 2. Crear arreglo de frutas
    Fruta[] frutas = {kiwi, naranja, mango};

    // 3. Mostrar datos de las frutas
    System.out.println("Fruta 1: " + kiwi.getNombre() + ", tipo: " + kiwi.getTipo() + ", vitaminas: " + kiwi.mostrarVitaminas());
    System.out.println("Fruta 2: " + naranja.getNombre() + ", tipo: " + naranja.getTipo() + ", vitaminas: " + naranja.mostrarVitaminas());
    System.out.println("Fruta 3: " + mango.getNombre() + ", tipo: " + mango.getTipo() + ", vitaminas: " + mango.mostrarVitaminas());

    // 4. Inciso b) Verificar cuál fruta tiene más vitaminas
    Fruta maxVitaminas = frutas[0];
    for (int i = 1; i < frutas.length; i++) {
        if (frutas[i].getNroVitaminas() > maxVitaminas.getNroVitaminas()) {
            maxVitaminas = frutas[i];
        }
    }
    System.out.println("La fruta con más vitaminas es: " + maxVitaminas.getNombre() + " (" + maxVitaminas.getNroVitaminas() + ")");

    // 5. Inciso c) Mostrar las vitaminas de la fruta x
    String frutaBuscada = "kiwi";
    for (Fruta f : frutas) {
        if (f.getNombre().equalsIgnoreCase(frutaBuscada)) {
            System.out.println("Vitaminas de la fruta '" + frutaBuscada + "': " + f.mostrarVitaminas());
        }
    }

    // 6. Inciso d) Contar cuántas vitaminas son cítricas
    // Supongamos que las vitaminas cítricas son: C
    int totalCitricas = 0;
    for (Fruta f : frutas) {
        for (String vit : f.getVitaminas()) {
            if (vit.equalsIgnoreCase("C")) {
                totalCitricas++;
            }
        }
    }
    System.out.println("Cantidad de vitaminas cítricas (C): " + totalCitricas);

    // 7. Inciso e) Ordenar frutas alfabéticamente según el nombre de sus vitaminas
    java.util.Arrays.sort(frutas, (f1, f2) -> {
        String v1 = f1.mostrarVitaminas();
        String v2 = f2.mostrarVitaminas();
        return v1.compareToIgnoreCase(v2);
    });
    System.out.println("\nFrutas ordenadas por nombre de sus vitaminas:");
    for (Fruta f : frutas) {
        System.out.println(f.getNombre() + " -> " + f.mostrarVitaminas());
        System.out.println("");
    }
}
}
