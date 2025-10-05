package ejercicio15;

public class TestBuzon {
    public static void main(String[] args) {
        // Instanciar 3 cartas
        Carta carta1 = new Carta("C123", "Hola Peter, ¿cómo estás?", "Juan Álvarez", "Peter Chaves");
        Carta carta2 = new Carta("C456", "Querido amigo, te escribo para decirte que ella no te ama por lo tanto...", "Pepe Mujica", "Wilmer Pérez");
        Carta carta3 = new Carta("C789", "Paty te manda saludos y amor.", "Paty Vasques", "Pepe Mujica");

        // Instanciar 3 buzones, cada uno con al menos 3 cartas
        Buzon buz1 = new Buzon(1, 3);
        Buzon buz2 = new Buzon(2, 3);
        Buzon buz3 = new Buzon(3, 3);

        // Asignar cartas a los buzones
        buz1.setCarta(0, 0, carta1);
        buz1.setCarta(0, 1, carta2);
        buz1.setCarta(0, 2, carta3);

        buz2.setCarta(0, 0, carta2);
        buz2.setCarta(0, 1, carta3);
        buz2.setCarta(0, 2, carta1);

        buz3.setCarta(0, 0, carta3);
        buz3.setCarta(0, 1, carta1);
        buz3.setCarta(0, 2, carta2);

        // Declarar arreglo de buzones para todos los incisos (antes de cualquier uso)
        Buzon[] buzones = {buz1, buz2, buz3};

        // Inciso f y g) Buscar palabra clave en descripciones y mostrar coincidencias
        String palabraClave = "amor";
        System.out.println("\nCoincidencias con la palabra clave '" + palabraClave + "':");
        for (Buzon buz : buzones) {
            Carta[][] matriz = buz.getCartas();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    Carta carta = matriz[i][j];
                    if (carta != null && carta.getDescripcion().toLowerCase().contains(palabraClave.toLowerCase())) {
                        System.out.println("Código: " + carta.getCodigo() + ", Remitente: " + carta.getRemitente() + ", Destinatario: " + carta.getDestinatario());
                    }
                }
            }
        }

        // Inciso e) Verificar si algún remitente recibió alguna carta y de quién
        System.out.println("\nRemitentes que recibieron cartas y de quién:");
        java.util.HashSet<String> remitentes = new java.util.HashSet<>();
        for (Buzon buz : buzones) {
            Carta[][] matriz = buz.getCartas();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    Carta carta = matriz[i][j];
                    if (carta != null) {
                        // Si el remitente es igual al destinatario, lo mostramos
                        if (carta.getRemitente().equalsIgnoreCase(carta.getDestinatario())) {
                            System.out.println(carta.getRemitente() + " recibió una carta de sí mismo.");
                        } else {
                            remitentes.add(carta.getRemitente());
                        }
                    }
                }
            }
        }
        // Mostrar de quién recibió cartas cada remitente
        for (String remitente : remitentes) {
            java.util.HashSet<String> deQuien = new java.util.HashSet<>();
            for (Buzon buz : buzones) {
                Carta[][] matriz = buz.getCartas();
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        Carta carta = matriz[i][j];
                        if (carta != null && carta.getDestinatario().equalsIgnoreCase(remitente)) {
                            deQuien.add(carta.getRemitente());
                        }
                    }
                }
            }
            if (!deQuien.isEmpty()) {
                System.out.println(remitente + " recibió carta(s) de: " + deQuien);
            }
        }

        // Inciso c) Verificar cuántas cartas recibió el destinatario "Pepe Mujica"
        String destinatarioBuscado = "Pepe Mujica";
        int contador = 0;
        for (Buzon buz : buzones) {
            Carta[][] matriz = buz.getCartas();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    Carta carta = matriz[i][j];
                    if (carta != null && carta.getDestinatario().equalsIgnoreCase(destinatarioBuscado)) {
                        contador++;
                    }
                }
            }
        }
        System.out.println("Cartas recibidas por '" + destinatarioBuscado + "': " + contador);

        // Inciso d) Eliminar la carta cuyo código sea "C456" en todos los buzones
        String codigoEliminar = "C456";
        for (Buzon buz : buzones) {
            buz.eliminarCartaPorCodigo(codigoEliminar);
        }
        System.out.println("Carta con código '" + codigoEliminar + "' eliminada de todos los buzones.");
    }
}
