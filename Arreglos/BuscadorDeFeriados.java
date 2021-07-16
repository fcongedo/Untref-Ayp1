public class BuscadorDeFeriados {
	public BuscadorDeFeriados(Object object, int i) {
		// TODO Ap�ndice de constructor generado autom�ticamente
	}


	/**
	 * post: devuelve un arreglo en el que la posici�n i-�sima indica si el d�a
	 * (i + 1) del mes pasado por par�metro es un feriado o no.
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