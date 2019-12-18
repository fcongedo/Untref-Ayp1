public class Vagon {
	private int numero;
	private int capacidadDeCarga;
	private int carga;

	/**
	 * post inicializa el Vag�n con el n�mero y la capacidad de carga indicados.
	 * La carga inicial es 0.
	 */
	public Vagon(int numero, int capacidadDeCarga) {
		if (numero <= 0) {
			throw new Error("el numero debe ser superior a cero");
		}
		if (capacidadDeCarga <= 0) {
			throw new Error(
					"la capacidad de carga tiene que ser superior a cero");
		}
		this.numero = numero;
		this.capacidadDeCarga = capacidadDeCarga;
		this.carga = 0;
	}

	/**
	 * post devuelve el n�mero de Vag�n.
	 */
	public int obtenerNumero() {
		return this.numero;

	}

	/**
	 * post devuelve la carga actual del Vag�n.
	 */
	public int obtenerCarga() {
		return this.carga;

	}

	/** post cambia la carga actual del Vag�n. */
	public void cambiarCarga(int carga) {
		if (carga > 0 && carga <= this.capacidadDeCarga) {
			this.carga = carga;
		}

	}

	/**
	 * post devuelve la carga m�xima del Vag�n.
	 */
	public int obtenerCapacidadDeCarga() {
		return this.capacidadDeCarga;

	}
}