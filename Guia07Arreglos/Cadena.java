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
		this.eslabones = new Eslabon [longitudesDeEslabones.length];
		for(int i = 0; i<longitudesDeEslabones.length;i++){
			this.eslabones[i] = new Eslabon (i+1,longitudesDeEslabones[i]);
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
		if(numero <1){
			throw new Error ("el numero de eslabon tiene que ser mayor a cero");
			
		}
		return this.eslabones[numero-1];
		

	}

	/**
	 * post devuelve la longitud total de la Cadena, siendo esta la suma de la
	 * longitudes de sus Eslabones.
	 */
	public double obtenerLongitud() {
		double longitudTotalEslabones = 0;
		for(int i =0; i<this.eslabones.length;i++){
			longitudTotalEslabones+= this.eslabones[i].obtenerLongitud();
			
		}
		return longitudTotalEslabones;

	}

	/**
	 * post devuelve la cantidad de Eslabones cuya longitud es superior a
	 * longitudMinima.
	 */
	public int contarEslabonesConLongitudSuperiorA(double longitudMinima) {
		int cantidadTotalEslabones = 0;
		for(int i = 0; i<this.eslabones.length;i++){
			if(this.eslabones[i].obtenerLongitud()>longitudMinima){
				cantidadTotalEslabones++;
			}
		}
		return cantidadTotalEslabones;

	}
}