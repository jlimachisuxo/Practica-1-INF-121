// Clase base Animal
class Animal {
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método desplazarse() (versión base)
    public void desplazarse() {
        System.out.println(this.nombre + " se está moviendo.");
    }

    // Getters para usar en la subclase (opcional, pero útil)
    public String getNombre() {
        return nombre;
    }
}






