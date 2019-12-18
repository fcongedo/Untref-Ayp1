public class Eslabon {
	private double longitud;
	private int numero;

	/**
	 * post inicializa el Eslab�n con el n�mero y la longitud indicados.
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
	 * post devuelve el n�mero de Eslab�n.
	 */
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
		if (longitud <= 0) {
			throw new Error("la longitud tiene que ser superior a cero");
		}
		this.longitud = longitud;

	}
}
