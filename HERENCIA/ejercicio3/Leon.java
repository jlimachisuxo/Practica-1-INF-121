class Leon extends Animal {
    // Constructor llama al constructor de la clase base
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    // Redefinición del método desplazarse()
    @Override
    public void desplazarse() {
        System.out.println("Leon " + getNombre() + " está caminando rápidamente.");
    }
}
