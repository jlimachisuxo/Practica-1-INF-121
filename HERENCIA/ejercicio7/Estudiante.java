package ejercicio7;

import java.util.List;

class Estudiante extends Persona {
    // Atributos 
    private int ru;
    private String matricula;

    // Constructor 
    public Estudiante(String nombre, String paterno, String materno, int edad, int ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.matricula = matricula;
    }

    @Override
    public void modificarEdad(int nuevaEdad) {

        if (nuevaEdad >= 16 && nuevaEdad < 30) {
            this.edad = nuevaEdad;
            System.out.println("-> Edad del estudiante " + nombre + " actualizada a " + nuevaEdad + " años.");
        } else {
            System.out.println("AVISO: No se modificó la edad. La edad de estudiante debe ser entre 16 y 29.");
        }
    }

    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("--- DATOS ESTUDIANTE ---");
        System.out.println("RU (Registro Universitario): " + ru);
        System.out.println("Matrícula: " + matricula);
    }
    
    public static double promedio(List<Estudiante> listaEstudiantes) {
        if (listaEstudiantes == null || listaEstudiantes.isEmpty()) {
            return 0.0;
        }
        int sumaEdades = 0;
        for (Estudiante e : listaEstudiantes) {
            sumaEdades += e.getEdad();
        }
        return (double) sumaEdades / listaEstudiantes.size();
    }
}
