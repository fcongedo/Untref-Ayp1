public class Nota {

	private int valorInicial;

	/*
	 * pre: valorInicial esta comprendido entre 0 y 10. Post: inicializa la Nota
	 * con el valor indicado.
	 */
	public Nota(int valorInicial) {
		if (valorInicial < 0 || valorInicial > 10) {
			throw new Error(
					"el valor de la nota debe estar commprendido entre 0 y 10");
		}
		this.valorInicial = valorInicial;

	}

	/*
	 * post: devuelve el valor numerico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {
		return this.valorInicial;
	}

	/*
	 * post: indica si la Nota permite o no la aprobacion.
	 */
	boolean aprobado() {
		return (valorInicial >= 4);

	}

	/*
	 * post:indica si la Nota implica la desaprobacion.
	 */
	boolean desaprobado() {
		return (valorInicial <= 4);

	}

	/*
	 * pre: nuevoValor esta comprendido entre 0 y 10. Post: modifica el valor
	 * numerico de la Notam cambiandolo por NuevoValor, si NuevoValor es
	 * superior al valor numerico actual de la nota.
	 */
	void recuperar(int nuevoValor) {
		if (nuevoValor < 0 || nuevoValor > 10) {
			throw new Error(
					"el valor de la nota debe estar comprendido entre 0 y 10");
		} else if (nuevoValor > valorInicial) {
			valorInicial = nuevoValor;

		}
	}

}
