class Canguro extends Animal {
    // Constructor
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Redefinición del método desplazarse()
    @Override
    public void desplazarse() {
        System.out.println("Canguro " + getNombre() + " está saltando ágilmente.");
    }
}