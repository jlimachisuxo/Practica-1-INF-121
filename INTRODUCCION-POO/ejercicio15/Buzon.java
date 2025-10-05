
package ejercicio15;

public class Buzon {
	private int nro;
	private int nroC;
	private Carta[][] c = new Carta[50][3];

	public Buzon(int nro, int nroC) {
		this.nro = nro;
		this.nroC = nroC;
	}

	public int getNro() {
		return nro;
	}

	public int getNroC() {
		return nroC;
	}

	public Carta[][] getCartas() {
		return c;
	}

	public void setCarta(int fila, int col, Carta carta) {
		if (fila >= 0 && fila < c.length && col >= 0 && col < c[0].length) {
			c[fila][col] = carta;
		}
	}

	public Carta getCarta(int fila, int col) {
		if (fila >= 0 && fila < c.length && col >= 0 && col < c[0].length) {
			return c[fila][col];
		}
		return null;
	}

	public void eliminarCartaPorCodigo(String codigo) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] != null && c[i][j].getCodigo().equalsIgnoreCase(codigo)) {
					c[i][j] = null;
				}
			}
		}
	}
}
