/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {
	private double[] temperaturas;
	private double temperaturaMinima = 25.0;
	private double temperaturaMaxima = 25.0;

	/**
	 * post deja inicializo las temperaturas del pronóstico en 25 oC.
	 */
	public PronosticoSemanal() {
		temperaturas = new double[7];
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = 25.0;
		}
	}

	/**
	 * pre recibe el número de día de la semana comprendido entre 1 y 7, siendo
	 * 1 lunes y 7 domingo. post devuelve la temperatura pronosticada para el
	 * día indicado.
	 */
	public double obtenerTemperatura(int dia) {
		verificarDia(dia);

		return temperaturas[dia - 1];

	}

	private void verificarDia(int dia) {
		if (dia < 1 || dia > 7) {
			throw new Error(
					"el dia debe estar comprendido entre 1(lunes) y 7(domingo)");
		}

	}

	/**
	 * pre recibe el número de día de la semana comprendido entre 1 y 7, siendo
	 * 1 lunes y 7 domingo. post cambia la temperatura pronosticada para el día
	 * indicado.
	 */
	public void pronosticarTemperatura(int dia, double temperatura) {
		verificarDia(dia);
		this.temperaturas[dia - 1] = temperatura;
	}

	/**
	 * post devuelve la temperatura promedio pronosticada para la próxima
	 * semana.
	 */
	public double calcularTemperaturaPromedio() {
		double totalTemperaturas = 0;
		for (int i = 0; i < this.temperaturas.length; i++) {
			totalTemperaturas += this.temperaturas[i];
		}
		return totalTemperaturas / temperaturas.length;
	}

	/**
	 * post devuelve la temperatura máxima pronosticada.
	 */
	public double buscarTemperaturaMinima() {
		
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i]< this.temperaturaMinima) {
				this.temperaturaMinima = temperaturas[i];
			}

		}
		return this.temperaturaMinima;
	}

	/**
	 * post devuelve la temperatura mínima pronosticada.
	 */
	public double buscarTemperaturaMaxima() {
		
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i]> this.temperaturaMaxima) {
				this.temperaturaMaxima = temperaturas[i];
			}
		}
		return this.temperaturaMaxima;
	}
}