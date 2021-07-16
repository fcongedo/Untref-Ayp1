public class PronosticoSemanal {
	private double[] temperaturas;

	/**
	 * post deja inicializo las temperaturas del pron�stico en 25 �C.
	 */
	public PronosticoSemanal() {
		temperaturas = new double[7];
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = 25.0;
		}
	}

	/**
	 * pre recibe el n�mero de d�a de la semana comprendido entre 1 y 7, siendo
	 * 1 lunes y 7 domingo. post devuelve la temperatura pronosticada para el
	 * d�a indicado.
	 */
	public double obtenerTemperatura(int dia) {
		validarDia(dia);
		return temperaturas[dia - 1];

	}

	private void validarDia(int dia) {
		if (dia < 1 || dia > 7) {
			throw new Error("dia invalido, rango valido 1 a 7");
		}

	}

	/**
	 * pre recibe el n�mero de d�a de la semana comprendido entre 1 y 7, siendo
	 * 1 lunes y 7 domingo. post cambia la temperatura pronosticada para el d�a
	 * indicado.
	 */
	public void pronosticarTemperatura(int dia, double temperatura) {
		validarDia(dia);
		temperaturas[dia - 1] = temperatura;
	}

	/**
	 * post devuelve la temperatura promedio pronosticada para la pr�xima
	 * semana.
	 */
	public double calcularTemperaturaPromedio() {
		double temperaturaTotal = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturaTotal += temperaturas[i];
		}
		return temperaturaTotal / temperaturas.length;
	}

	/**
	 * post devuelve la temperatura m�xima pronosticada.
	 */
	public double buscarTemperaturaM�xima() {
		double temperaturaMaxima = temperaturas[0];
		for (int i = 1; i < temperaturas.length; i++) {
			if (temperaturas[i] > temperaturaMaxima) {
				temperaturaMaxima = temperaturas[i];
			}
		}
		return temperaturaMaxima;
	}

	/**
	 * post devuelve la temperatura m�nima pronosticada.
	 */
	public double buscarTemperaturaM�nima() {
		double temperaturaMinima = temperaturas[0];
		for (int i = 1; i < temperaturas.length; i++) {
			if (temperaturas[i] < temperaturaMinima) {
				temperaturaMinima = temperaturas[i];
			}

		}
		return temperaturaMinima;
	}
}