package ejercicio7;

public class TestMascota {
    public static void main(String[] args) {
        // creando mascotas
        Mascota perro = new Mascota("Jack", "Perro");
        Mascota gato = new Mascota("Bigotes", "Gato");

        System.out.println("Estado inicial de las mascotas:");
        System.out.println(perro.getNombre() + " - Energia: " + perro.getEnergia());
        System.out.println(gato.getNombre() + " - Energia: " + gato.getEnergia());
        System.out.println("");

        // simulacion jugar con ambas mascotas
        System.out.println(" Simulacion de las actividades");
        perro.jugar();
        gato.jugar();
        System.out.println("");

        // jugar de nuevo con el perro paara disminuir la energia
        perro.jugar();
        perro.jugar();
        perro.jugar();
        System.out.println("");

        // alimenta para que aumente la energia
        perro.alimentar();
        perro.alimentar();
        perro.alimentar();
        System.out.println("");

        System.out.println("---fin de la simulacion---");
    }
   
}
