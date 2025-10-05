package ejercicio2;

import java.util.Scanner;

public class TestVideojuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciar al menos 2 videojuegos
        Videojuego v1 = new Videojuego("FIFA 23", "PS5");
        Videojuego v2 = new Videojuego("Mario Kart", "Switch", 2);

        // Usar agregarJugadores() sin parámetros
        v1.agregarJugadores();

        // con Scanner para ingresar cantidad
        v2.agregarJugadores(sc);

        // Mostrar resultados
        System.out.println(v1);
        System.out.println(v2);

        sc.close();
    }
}
