package ejercicio3;

// Diseña una clase Producto que tenga atributos nombre, precio y
// stock. Agrega métodos para vender productos y reabastecer el stock.
// a) Define la clase y los atributos.
// b) Agrega un método vender(cantidad: Int) que reste del stock
// c) Agrega un método reabastecer(cantidad: Int) que sume al stock.

public class Producto {
    // atributos
    private String nombre;
    private double precio;
    private int stock;

    // constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // metodos
    public void vender(int cantidad){
        if(cantidad <= stock){
            this.stock -=  cantidad;
            System.out.println("Se vendioron " + cantidad + " unidades de " + nombre);
            System.out.println("Stock actual: " + this.stock);
        }
        else{
            System.out.println("Error: No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
        }
    }

    public void reabastecer(int cantidad){
        this.stock += cantidad;
        System.out.println("Se agregaron " + cantidad + " unidades de " + nombre);
        System.out.println("Stock actual: " + this.stock);
    }

    //mostrar detalles del producto
    public void  mostrarProducto(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Bs. " + precio);
        System.out.println("Stock disponible: " + stock);
    }
}
