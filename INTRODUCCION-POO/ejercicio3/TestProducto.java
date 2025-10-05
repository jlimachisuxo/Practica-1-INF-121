package ejercicio3;

public class TestProducto {
    public static void main(String[] args) {
        // crear un producto
        Producto prod1 = new Producto("Cuaderno tamano carta", 15.50, 50);

        System.out.println("Estado inicial del producto:");
        prod1.mostrarProducto();
        System.out.println("");

        //vender 15 cuadernos
        prod1.vender(15);
        System.out.println("");

        //intentar vender mas de lo que hay en stock
        prod1.vender(40);
        System.out.println("");

        //reabastecer 12 cuadernos
        prod1.reabastecer(12);
        System.out.println("");

        System.out.println("Estado final del producto:");
        prod1.mostrarProducto();
        System.out.println("");
    }
}
