package ejercicio7;

public class Parada {
	private String[] admins;
	private String[][] autos;
	private String nombreP;
	private int nroAdmins;
	private int nroAutos;

	// Constructor por defecto
	public Parada() {
		admins = new String[10];
		autos = new String[10][3]; // modelo, conductor, placa
		nombreP = "";
		nroAdmins = 0;
		nroAutos = 0;
	}

	// Constructor pidiendo datos
	public Parada(String nombreP) {
		admins = new String[10];
		autos = new String[10][3];
		this.nombreP = nombreP;
		nroAdmins = 0;
		nroAutos = 0;
	}

	// Método mostrar
	public void mostrar() {
		System.out.println("Nombre de parada: " + nombreP);
		System.out.println("Admins:");
		for (int i = 0; i < nroAdmins; i++) {
			System.out.println("  - " + admins[i]);
		}
		System.out.println("Autos:");
		for (int i = 0; i < nroAutos; i++) {
			System.out.println("  Modelo: " + autos[i][0] + ", Conductor: " + autos[i][1] + ", Placa: " + autos[i][2]);
		}
	}

	// Método adicionar(x):
	public void adicionar(String admin) {
		if (nroAdmins < admins.length) {
			admins[nroAdmins] = admin;
			nroAdmins++;
		} else {
			System.out.println("No se puede agregar más admins.");
		}
	}

	// Método adicionar(x, y, z): añade un auto
	public void adicionar(String modelo, String conductor, String placa) {
		if (nroAutos < autos.length) {
			autos[nroAutos][0] = modelo;
			autos[nroAutos][1] = conductor;
			autos[nroAutos][2] = placa;
			nroAutos++;
		} else {
			System.out.println("No se puede agregar más autos.");
		}
	}
}
