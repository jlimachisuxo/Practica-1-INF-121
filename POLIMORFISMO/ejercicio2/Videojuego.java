package ejercicio2;

import java.util.Scanner;

public class Videojuego {
    // atributos
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // Constructor por defecto
    public Videojuego() {
        this.nombre = "";
        this.plataforma = "";
        this.cantidadJugadores = 0;
    }

    // Constructor con nombre y plataforma
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }

    // Constructor con todos los atributos
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    // Sobrecarga método agregarJugadores: agrega solo un jugador
    public void agregarJugadores() {
        this.cantidadJugadores++;
    }

    // agrega cantidad ingresada por teclado
    public void agregarJugadores(Scanner sc) {
        System.out.print("Ingrese la cantidad de jugadores a agregar: ");
        int cantidad = sc.nextInt();
        this.cantidadJugadores += cantidad;
    }

    // Getters para mostrar información
    public String getNombre() {
        return nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    @Override
    public String toString() {
        return "Videojuego[" +
                "nombre = " + nombre +
                ", plataforma = " + plataforma +
                ", cantidadJugadores = " + cantidadJugadores +
                "]";
    }
}
