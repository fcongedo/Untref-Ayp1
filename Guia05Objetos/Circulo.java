public class Circulo {
	private double radio;

	/*
	 * pre:inicializa el circulo a partir de un radio pasado como parametro
	 */

	public Circulo(double radioPorParametro) {
		if (radioPorParametro <= 0) {
			throw new Error("el radio ingresado debe ser mayor a cero");
		}
		radio = radioPorParametro;

	}

	/*
	 * post: devuelve el radio
	 */

	public double obtenerRadio() {
		return radio;

	}

	/*
	 * post calcula y devuelve el perimetro
	 */

	public double obtenerPerimetro() {
		return radio * 2;
	}

	/*
	 * post: calcula y devuelve el diametro
	 */
	public double obtenerDiametro() {
		return 2 * Math.PI * radio;

	}

	/*
	 * post: calcula y devuevle la superficie
	 */

	public double obtenerSupeficie() {
		return Math.PI + radio * radio;
	}

}
