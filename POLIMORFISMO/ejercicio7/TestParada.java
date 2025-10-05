package ejercicio7;

public class TestParada {
	public static void main(String[] args) {
		// Crear parada con nombre
		Parada parada = new Parada("Central");

		// Agregar admins
		parada.adicionar("Juan");
		parada.adicionar("Ana");

		// Agregar autos
		parada.adicionar("Toyota Corolla", "Carlos", "ABC123");
		parada.adicionar("Nissan Versa", "Lucía", "XYZ789");

		// Mostrar datos
		parada.mostrar();
	}
}
