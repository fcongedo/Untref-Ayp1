/**
 * Una Candena está conformada por una secuencia de Eslabones. Cada uno de los
 * Eslabones que forman parte de una Cadena pueden tener diferente longitud.
 */
public class Cadena {
	private Eslabon[] eslabones;

	/**
	 * post crea la Cadena inicializando los Eslabones con número correlativo y
	 * con la longitud indicada en longitudesDeEslabones.
	 */
	public Cadena(double[] longitudesDeEslabones) {
		this.eslabones = new Eslabon[longitudesDeEslabones.length];
		for (int i = 0; i < longitudesDeEslabones.length; i++) {
			this.eslabones[i] = new Eslabon(i + 1, longitudesDeEslabones[i]);
		}

	}

	/**
	 * post devuelve la cantida de Eslabones que tiene la Cadena.
	 */
	public int contarCantidadDeEslabones() {
		return this.eslabones.length;

	}

	/**
	 * pre número es un valor comprendido en entre 1 y la cantidad de Eslabones
	 * que tiene la Cadena. post devuelve el Eslabón con el número indicado.
	 */
	public Eslabon obtenerEslabón(int numero) {
		if (numero - 1 < 0 || numero - 1 > this.eslabones.length) {
			throw new Error("el numero de eslabon no existe");
		}
		return this.eslabones[numero - 1];

	}

	//
	/**
	 * post devuelve la longitud total de la Cadena, siendo esta la suma de la
	 * longitudes de sus Eslabones.
	 */
	public double obtenerLongitud() {
		double longitudTotal = 0;
		for (int i = 0; i < this.eslabones.length; i++) {
			longitudTotal += this.eslabones[i].obtenerLongitud();
		}
		return longitudTotal;

	}

	/**
	 * post devuelve la cantidad de Eslabones cuya longitud es superior a
	 * longitudMinima.
	 */
	public int contarEslabonesConLongitudSuperiorA(double longitudMinima) {
		int contadorEslabones = 0;
		for (int i = 0; i < this.eslabones.length; i++) {
			if (this.eslabones[i].obtenerLongitud() > longitudMinima) {
				contadorEslabones++;
			}
		}
		return contadorEslabones;

	}
}
