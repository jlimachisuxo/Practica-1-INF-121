package ejercicio7;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        // a) Instanciar a dos estudiantes y un docente.

        System.out.println("         a) INSTANCIA DE OBJETOS       ");        
        Docente docente1 = new Docente("Ana", "Mamani", "Flores", 45, 12500.50, "ING-4567");
        Estudiante estudiante1 = new Estudiante("Luis", "Perez", "Choque", 20, 102001, "A123");
        Estudiante estudiante2 = new Estudiante("Maria", "Vargas", "Rojas", 25, 102002, "B456");
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        // b) Implementar el método mostrar() en las 3 clases.
        System.out.println("           b) MÉTODO MOSTRAR()           ");
        
        System.out.println("\n--- Docente 1 ---");
        docente1.mostrar();
        
        System.out.println("\n--- Estudiante 1 ---");
        estudiante1.mostrar();
        
        System.out.println("\n--- Estudiante 2 ---");
        estudiante2.mostrar();

        // d) Implementar el método modificarEdad() para el estudiante.
        System.out.println("       d) MODIFICAR EDAD (Estudiante)    ");
        
        System.out.println("Edad inicial de Luis: " + estudiante1.getEdad());
        estudiante1.modificarEdad(21); // Modificación válida
        estudiante1.modificarEdad(5);  // Modificación inválida (por validación interna)
        
        // c) Agregar el método promedio() que devuelva el promedio de la edad de los estudiantes.
        System.out.println("             c) MÉTODO PROMEDIO()          ");
        
        double promedioEdades = Estudiante.promedio(estudiantes);
        System.out.println("Edades de Estudiantes: " + estudiante1.getEdad() + ", " + estudiante2.getEdad());
        System.out.printf("El promedio de edad de los estudiantes es: %.2f años\n", promedioEdades);

        // e) Verificar si uno de los estudiantes tiene la misma edad que el docente.
        System.out.println("          e) VERIFICACIÓN DE EDAD          ");
        
        int edadDocente = docente1.getEdad();
        System.out.println("Edad del Docente (" + docente1.nombre + "): " + edadDocente);

        // Verificación Estudiante 1
        boolean e1Igual = estudiante1.getEdad() == edadDocente;
        System.out.println("¿Estudiante 1 (" + estudiante1.nombre + ") tiene la misma edad? " + (e1Igual ? "SÍ" : "NO"));

        // Verificación Estudiante 2
        boolean e2Igual = estudiante2.getEdad() == edadDocente;
        System.out.println("¿Estudiante 2 (" + estudiante2.nombre + ") tiene la misma edad? " + (e2Igual ? "SÍ" : "NO"));
    }
}