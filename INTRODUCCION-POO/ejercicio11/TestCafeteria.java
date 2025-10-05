package ejercicio11;
import java.util.ArrayList;
public class TestCafeteria {
    public static void main(String[] args) {
        // creacion de un objeto de la clase pedido
        ArrayList<String> prodPedido = new ArrayList<>();
        prodPedido.add("Capuchino");
        prodPedido.add("Empanada de jamon y queso");
        prodPedido.add("Jugo de naranja");
        Pedido ped1 = new Pedido(prodPedido);

        // mostrar el estado inicial del pedido
        System.out.println(ped1);
        System.out.println("");

        // cambio del estado del pedido
        ped1.setEstado("Preparado");
        System.out.println("Estado del pedido despues de ser preparado:");
        System.out.println(ped1);
        System.out.println("");

        // creacion del pbjeto empleado
        Empleado emp1 = new Empleado("Juan Perez", "Tomar pedidos");

        // mostrar datos del empleado
        System.out.println(emp1);
        System.out.println("");
    }
}
