package ejercicio11;

public class Empleado {
    private String nombre;
    private String rol; // tomar pedidos, preparacion

    //constructor
    public Empleado(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getRol() {
        return rol;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
