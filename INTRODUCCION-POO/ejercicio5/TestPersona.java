package ejercicio5;

public class TestPersona {
    public static void main(String[] args) {
        // instanciar 2 personas
        Persona per1 = new Persona("Ana", "Loza", "Gonzales", 23, "9175632");
        Persona per2 = new Persona("Diego", "Loza", "Martinez", 17, "1236985");

        System.out.println("Datos de la persona 1:");
        per1.mostrarDatos();
        System.out.println("Datos de la persona 2:");
        per2.mostrarDatos();
        System.out.println("");

        // verificando si son mayores de edad
        System.out.println("Verificando si son mayores de edad:");
        System.out.println("Es " + per1.getPaterno() + " mayor de dad? " + per1.esMayorDeEdad());        
        System.out.println("Es " + per2.getPaterno() + " mayor de dad? " + per2.esMayorDeEdad()); 
        System.out.println("");

        // modificando la edad de una persona
        System.out.println("Modificacion de edad:");
        per2.modificarEdad(21);

        // verificando si es mayor de edad despues del cambio
        System.out.println("Es " + per2.getPaterno() + " mayor de dad? " + per2.esMayorDeEdad());
        System.out.println("");

        // verificando si tienen el mismo apellido paterno
        System.out.println("Verificacion del apellido paterno");
        if(per1.getPaterno().equals(per2.getPaterno())){
            System.out.println("Las dos personas tienen el mismo apellido paterno " + per1.getPaterno());
            System.out.println("");

        }
        else{
            System.out.println("Las dos personas tienen apellidos paternos diferentes.");
        }
    }
}
