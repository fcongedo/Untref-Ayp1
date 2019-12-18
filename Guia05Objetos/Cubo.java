public class Cubo {
	private int lado;
	private int superficieCara;
	private int volumen;

	/*
	 * post: inicializa el cubo a partir de la medida de lado dada
	 */
	public Cubo(int lado) {
		if (lado <= 0) {
			throw new Error("la medida del lado del cubo debe ser mayor a cero");
		}
		this.lado = lado;
	}

	/*
	 * post: devuelve la longitud de los lados del cubo
	 */
	public int medirLongitudLado() {
		return lado * 6;
	}

	/*
	 * pre: lado es mayor a cero post: cambia la longitud de todos los lados del
	 * cubo
	 */
	public void cambiarLongitudLado(int lado) {
		if (lado <= 0) {
			throw new Error("la medida del lado del cubo debe ser mayor a cero");
		}
		this.lado = lado;

	}

	/*
	 * post: devuelve la superficie ocupada por las caras del cubo
	 */
	public int medirSuperficieCara() {
		return superficieCara = lado * lado;
	}

	/*
	 * pre: superficieCara es un valor mayor a 0. post: cambia la superficie de
	 * las caras del cubo
	 */
	public void cambiarSuperficieCara(int superficieCara) {
		if (superficieCara <= 0) {
			throw new Error(
					"la medida de la superficieCara debe ser mayor a cero");
		}
		this.superficieCara = superficieCara;
	}

	/*
	 * post: devuelve el volumen que encierra el cubo
	 */
	public int medirVolumen() {
		return volumen = lado * 3;

	}

	/*
	 * pre: volumen es un valor mayor a 0. post: cambia el volumen del cubo
	 */

	public void cambiarVolumen(int volumen) {
		if (volumen <= 0) {
			throw new Error("el volumen debe ser mayor a cero");
		}
		this.volumen = volumen;

	}

	public int ObtenerSuperficieCara() {
		return superficieCara;
	}

	public int obtenerVolumen() {
		return volumen;
	}

}
