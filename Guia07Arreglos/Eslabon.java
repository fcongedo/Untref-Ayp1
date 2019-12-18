public class Eslabon {
	private double longitud;
	private int numero;

	/**
	 * post inicializa el Eslabón con el número y la longitud indicados.
	 */
	public Eslabon(int numero, double longitud) {
		if (numero < 1) {
			throw new Error("el numero debe ser mayor a cero");
		}
		if (longitud <= 0) {
			throw new Error("la longitud tiene que ser superior a cero");
		}
		this.numero = numero;
		this.longitud = longitud;

	}

	/**
	 * post devuelve el número de Eslabón.
	 */
	public int obtenerNumero() {
		return this.numero;

	}

	/**
	 * post devuelve la longitud del Eslabón.
	 */
	public double obtenerLongitud() {
		return this.longitud;

	}

	/**
	 * post cambia la longitud del Eslabón.
	 */
	public void cambiarLongitud(double longitud) {
		if (longitud <= 0) {
			throw new Error("la longitud tiene que ser superior a cero");
		}
		this.longitud = longitud;

	}
}
