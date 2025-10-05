package ejercicio11;

public interface IPolicia {
    // 2 atributos de comportamiento
    String getGrado();
    String getPlaca();
    
    default void realizarArresto() {
        System.out.println("  (Policia) Realizando un arresto...");
    }
}
