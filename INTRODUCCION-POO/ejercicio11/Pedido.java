package ejercicio11;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<String> productos;
    private String estado; //registrado, preparado, entregado

    //constructor
    public Pedido(ArrayList<String> productos) {
        this.productos = productos;
        this.estado = "registrado"; //estado por defecto
    }

    // getters
    public ArrayList<String> getProductos() {
        return productos;
    }

    public String getEstado(){
        return estado;
    }

    // setter
    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "productos=" + productos +
                ", estado='" + estado + '\'' +
                '}';
    }
}
