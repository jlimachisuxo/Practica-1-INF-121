public class Main {
    public static void main(String[] args) {
        // c) Crea un arreglo de animales
        Animal[] zoologico = new Animal[3];

        zoologico[0] = new Leon("Simba", 5);
        zoologico[1] = new Pinguino("Skipper", 3);
        zoologico[2] = new Canguro("Joey", 2);

        System.out.println("--- El Zoológico en Movimiento ---");

        // Hace que cada uno se desplace
        for (Animal animal : zoologico) {
            animal.desplazarse(); 
        }
    }
}