public class BuscadorDeFeriados {
	public BuscadorDeFeriados(Object object, int i) {
		// TODO Apéndice de constructor generado automáticamente
	}


	/**
	 * post: devuelve un arreglo en el que la posición i-ésima indica si el día
	 * (i + 1) del mes pasado por parámetro es un feriado o no.
	 */
	public boolean[] indicarDiasFeriadosDelMes(Feriado[] feriados, int mes) {
		if (mes < 1 || mes > 12) {
			throw new Error("mes fuera de rango");

		}
		boolean[] indicarDiasFeriadosDelMes = new boolean[feriados.length];
		for (int i = 0; i < feriados.length; i++) {
			if (feriados[i].obtenerNombre() != "") {
				indicarDiasFeriadosDelMes[i] = true;
			}
			indicarDiasFeriadosDelMes[i] = false;
		}
		return indicarDiasFeriadosDelMes;

	}
}