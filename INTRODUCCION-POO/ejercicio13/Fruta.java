
package ejercicio13;

public class Fruta {
	private String nombre;
	private String tipo;
	private int nroVitaminas;
	private String[] v = new String[30];

	// Constructor 1: todos los parámetros
	public Fruta(String nombre, String tipo, int nroVitaminas, String[] vitaminas) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nroVitaminas = nroVitaminas;
		for (int i = 0; i < nroVitaminas && i < vitaminas.length; i++) {
			this.v[i] = vitaminas[i];
		}
	}

	// Constructor 2: nombre, tipo y vitaminas (array variable)
	public Fruta(String nombre, String tipo, String... vitaminas) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nroVitaminas = vitaminas.length;
		for (int i = 0; i < vitaminas.length; i++) {
			this.v[i] = vitaminas[i];
		}
	}

	// Constructor 3: solo nombre y tipo, luego se agregan vitaminas
	public Fruta(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nroVitaminas = 0;
	}

	public void agregarVitamina(String vitamina) {
		if (nroVitaminas < v.length) {
			v[nroVitaminas++] = vitamina;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNroVitaminas() {
		return nroVitaminas;
	}

	public String[] getVitaminas() {
		String[] vitaminas = new String[nroVitaminas];
		for (int i = 0; i < nroVitaminas; i++) {
			vitaminas[i] = v[i];
		}
		return vitaminas;
	}

	// Para mostrar las vitaminas como String
	public String mostrarVitaminas() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nroVitaminas; i++) {
			sb.append(v[i]);
			if (i < nroVitaminas - 1) sb.append(", ");
		}
		return sb.toString();
	}
}
