public class Vagon {
	private int numero;
	private int capacidadDeCarga;
	private int carga;

	/**
	 * post inicializa el Vagón con el número y la capacidad de carga indicados.
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
	 * post devuelve el número de Vagón.
	 */
	public int obtenerNumero() {
		return this.numero;

	}

	/**
	 * post devuelve la carga actual del Vagón.
	 */
	public int obtenerCarga() {
		return this.carga;

	}

	/** post cambia la carga actual del Vagón. */
	public void cambiarCarga(int carga) {
		if (carga > 0 && carga <= this.capacidadDeCarga) {
			this.carga = carga;
		}

	}

	/**
	 * post devuelve la carga máxima del Vagón.
	 */
	public int obtenerCapacidadDeCarga() {
		return this.capacidadDeCarga;

	}
}