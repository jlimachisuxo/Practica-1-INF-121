class Pinguino extends Animal {
    // Constructor
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    // Redefinición del método desplazarse()
    @Override
    public void desplazarse() {
        System.out.println("Pinguino " + getNombre() + " está nadando o caminando torpemente.");
    }
}