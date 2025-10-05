package ejercicio3;

public class TestMatriz {
	public static void main(String[] args) {
		// Matriz identidad
		Matriz m1 = new Matriz();
		System.out.println("Matriz identidad:");
		m1.mostrar();

		// Matriz personalizada
		float[][] datos = new float[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				datos[i][j] = i + j;
			}
		}
		Matriz m2 = new Matriz(datos);
		System.out.println("Matriz personalizada:");
		m2.mostrar();

		// Suma de matrices
		Matriz suma = m1.sumar(m2);
		System.out.println("Suma de m1 + m2:");
		suma.mostrar();

		// Resta de matrices
		Matriz resta = m2.restar(m1);
		System.out.println("Resta de m2 - m1:");
		resta.mostrar();

		// Comparar igualdad
		System.out.println("¿m1 y m2 son iguales?: " + m1.igual(m2));
		System.out.println("¿m1 y m1 son iguales?: " + m1.igual(m1));
	}
}
