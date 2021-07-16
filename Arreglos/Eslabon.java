public class Eslabon {
	private int numero;
	private double longitud;

	/**
	 * post inicializa el Eslab�n con el n�mero y la longitud indicados.
	 */
	public Eslabon(int numero, double longitud) {
		validarLongitud(longitud);
		if (numero < 1) {
			throw new Error("el numero debe ser mayor a cero");
		}
		this.numero = numero;
		this.longitud = longitud;

	}

	private void validarLongitud(double longitud) {
		if (longitud <= 0) {
			throw new Error("la longitud debe ser mayor a cero");
		}
	}

	public int obtenerNumero() {
		return this.numero;

	}

	/**
	 * post devuelve la longitud del Eslab�n.
	 */
	public double obtenerLongitud() {
		return this.longitud;

	}

	/**
	 * post cambia la longitud del Eslab�n.
	 */
	public void cambiarLongitud(double longitud) {
		validarLongitud(longitud);
		this.longitud = longitud;

	}
}