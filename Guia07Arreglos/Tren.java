public class Tren {
	private String codigo;
	private Vagon[] vagones;
	private double promedioCargaTotal;

	/**
	 * post crea el Tren con el código indicado, inicializando los Vagones con
	 * número correlativo y la capicidad de carga indicada en
	 * capacidadesDeCarga.
	 */
	public Tren(String codigo, int[] capacidadesDeCarga) {
		if (codigo.length() <= 0) {
			throw new Error("Debe ingresar un codigo");
		}
		this.vagones = new Vagon[capacidadesDeCarga.length];
		for (int i = 0; i < capacidadesDeCarga.length; i++) {
			this.vagones[i] = new Vagon(i + 1, capacidadesDeCarga[i]);
		}

		this.codigo = codigo;

	}

	public String obtenerCódigo() {
		return this.codigo;

	}

	/**
	 * pre número es un valor comprendido en entre 1 y la cantidad de vagones
	 * que tiene el Tren. post devuelve el Vagón con el número indicado.
	 */
	public Vagon obtenerVagon(int numero) {
		if (numero <= 0 || numero > this.vagones.length) {
			throw new Error("el vagon no existe");

		}
		return this.vagones[numero - 1];
	}

	/**
	 * post devuelve la carga total del Tren, siendo esta la suma de cargas de
	 * sus vagones.
	 */
	public int obtenerCargaTotal() {
		int cargaTotal = 0;
		for (int i = 0; i < this.vagones.length; i++) {
			cargaTotal += this.vagones[i].obtenerCarga();
		}
		return cargaTotal;

	}

	/**
	 * post devuelve la cantidad de Vagones cuya carga es superior al promedio
	 * de carga de los Vagones del Tren.
	 */
	public int contarVagonesConCargaSuperiorAlPromedio() {
		int promedioDeCargaTotal = (this.obtenerCargaTotal()
				/ this.vagones.length);
		int vagonesConCargaSuperiorAlPromedio = 0;

		for (int i = 0; i < this.vagones.length; i++) {
			if (this.vagones[i].obtenerCarga() > promedioDeCargaTotal) {
				vagonesConCargaSuperiorAlPromedio++;
			}
		}

		return vagonesConCargaSuperiorAlPromedio;

	}
	
	
}