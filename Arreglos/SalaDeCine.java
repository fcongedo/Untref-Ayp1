public class SalaDeCine {
	private int cantidadDeButacasTotales;
	private int cantidadDeFilas;
	private boolean[][] cine;
	private int cantidadDeButacasPorFila;
	private int totalButacasOcupadas;
	private int[] cantidadDeButacasLibresXFila;

	/**
	 * Pre: crea una sala de cine, a partir de la cantidad de butacasTotales, y
	 * cantidadDeFilas y post: inicializa la sala con valor de verdad true
	 * 
	 * @param cantidadButacasTotales
	 * @param cantidadDeFilas
	 */
	public SalaDeCine(int cantidadButacasTotales, int cantidadDeFilas) {
		if (cantidadDeButacasTotales < 1) {
			throw new Error("la cantidad De butacas debe ser superior a 0");

		}
		if (cantidadDeFilas < 1) {
			throw new Error("la cantidad de filas debe ser superior a 0");

		}
		this.cantidadDeButacasTotales = cantidadButacasTotales;
		this.cantidadDeFilas = cantidadDeFilas;
		this.cantidadDeButacasPorFila = cantidadDeButacasTotales
				/ cantidadDeFilas;
		cine = new boolean[cantidadDeFilas][cantidadDeButacasPorFila];

		for (int i = 0; i < cantidadDeFilas; i++) {
			for (int j = 0; j < cantidadDeButacasPorFila; j++) {
				cine[i][j] = true;
			}
		}
	}

	/**
	 * pre: consulta si la butaca esta ocupada o no (pasa por parametros fila y
	 * columna) post: devuelve si la butaca esta ocupada, o lanza una excepcion
	 * si ingresa dato erroneo
	 * 
	 * @param fila
	 * @param asiento
	 * @return
	 */

	public boolean consultarSiUnaButacaEstaOcupada(int fila, int asiento) {
		verificarFilaYAsiento(fila, asiento);
		return cine[fila - 1][asiento - 1];
	}

	/**
	 * pre: ocupa butaca, con la fila y asiento pasado por parametro
	 * 
	 * @param fila
	 * @param asiento
	 */

	public void ocuparButaca(int fila, int asiento) {

		verificarFilaYAsiento(fila, asiento);
		if (cine[fila - 1][asiento - 1] != false) {
			cine[fila - 1][asiento - 1] = false;
			totalButacasOcupadas++;
		}
		throw new Error("la butaca ya esta ocupada");
	}

	/**
	 * post: devuelve la cantidadTotalDeButacasOcupadas.
	 * 
	 * @return
	 */

	public int obtenerButacastotalOcupadas() {
		return this.totalButacasOcupadas;
	}

	/**
	 * pre: chequea si hay espacio para acomodar un grupo de personas en una
	 * fila post: devuelve si es posible o no
	 * 
	 * @param cantidadDePersonas
	 * @return
	 */

	public boolean HayEspacioPara(int cantidadDePersonas) {
		boolean hayEspacioPara = false;

		if (cantidadDePersonas > this.cantidadDeButacasPorFila) {
			throw new Error(
					"No hay esa cantidad de butacas en una fila en esta sala ");
		}
		for (int x = 0; x < this.cantidadDeFilas; x++) {
			for (int y = 0; y < this.cantidadDeButacasPorFila; y++) {
				while (this.cine[x][y] == true) {
					cantidadDeButacasLibresXFila[x]++;
				}
			}
		}
		for (int x = 0; x < this.cantidadDeButacasLibresXFila.length; x++) {
			if (this.cantidadDeButacasLibresXFila[x] == cantidadDePersonas) {
				hayEspacioPara = true;
			}

		}
		return hayEspacioPara;
	}

	/**
	 * Post: verificar rango de fila y asiento mayor a 0
	 * 
	 * @param fila
	 * @param asiento
	 */

	private void verificarFilaYAsiento(int fila, int asiento) {
		if (fila < 1 || fila > this.cantidadDeFilas) {
			throw new Error("la cantidad filas es incorrecta ");
		}
		if (asiento < 1 || asiento > this.cantidadDeButacasTotales) {
			throw new Error("la cantidad De butacas es incorrecta");
		}

	}
}
