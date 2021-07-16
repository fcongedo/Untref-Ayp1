public class IndicadorDeCanal {
	private int canales[];
	private int canalMinimo;
	private int canalMaximo;
	private int canalActual = 0;

	public IndicadorDeCanal(int canalMinimo, int canalMaximo) {
		if (canalMinimo < 1 || canalMaximo < 1) {
			throw new Error("No se pueden ingresar canalesNegativos");
		}
		this.canalMinimo = canalMinimo;
		this.canalMaximo = canalMaximo;

		for (int i = canalMinimo; i < canalMaximo; i++) {
			canales[i] = i;
		}
	}

	public int devolverCanalActual() {
		return this.canalActual;
	}

	public void cambiarCanalActual(int nuevoCanal) {
		if (nuevoCanal < canalMinimo || nuevoCanal > canalMaximo) {
			throw new Error("canal fuera de rango ");
		}
		this.canalActual = nuevoCanal;

	}

	public void cambiarCanalActualPorCanalSiguiente() {
		if (canalActual++ < canales.length) {
			this.canalActual++;
		} else
			throw new Error("llego al final de la grilla de canales");
	}

	public void cambiarCanalActualPorCanalAnterior() {
		if (canalActual-- > canalMinimo) {
			this.canalActual--;
		} else
			throw new Error("llego al principio de la grilla de canales");
	}

}
