package ejercicio7;

public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;

    // contructor
    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 50; // energia inicial
    }

    //metodos
    public int getEnergia(){
        return this.energia;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void alimentar(){
        this.energia += 20;
        if(this.energia > 100){
            this.energia = 100;
        }
        System.out.println(this.nombre + " ha sido alimentado. Su energia actual es: " + this.energia);        
    }

    public void jugar(){
        this.energia -= 15;
        if(this.energia < 0){
            this.energia = 0;
        }
        System.out.println(this.nombre + " esta jugando. Su energia actual es: " + this.energia);
        
    }
}
