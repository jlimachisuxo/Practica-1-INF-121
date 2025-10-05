package ejercicio3;

public class Matriz {
    private float[][] matriz;
    private static final int TAM = 5;

    // Constructor: matriz identidad
    public Matriz() {
        matriz = new float[TAM][TAM];
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                matriz[i][j] = (i == j) ? 1.0f : 0.0f;
            }
        }
    }

    // Constructor: recibe matriz externa
    public Matriz(float[][] valores) {
        matriz = new float[TAM][TAM];
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (valores != null && i < valores.length && j < valores[i].length) {
                    matriz[i][j] = valores[i][j];
                } else {
                    matriz[i][j] = 0.0f;
                }
            }
        }
    }

    // Sumar matrices
    public Matriz sumar(Matriz otra) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return resultado;
    }

    // Restar matrices
    public Matriz restar(Matriz otra) {
        Matriz resultado = new Matriz();
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return resultado;
    }

    // Comparar igualdad
    public boolean igual(Matriz otra) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para mostrar la matriz
    public void mostrar() {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
