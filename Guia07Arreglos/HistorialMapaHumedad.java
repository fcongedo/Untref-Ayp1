public class HistorialMapaHumedad {
	private double[] muestrasDeHumedad;
	private int cantidadDeMediciones;
	private int numeroDeMuestra;
	private int contadorMuestrasTomadas;

	public HistorialMapaHumedad(int cantidadDeMediciones) {
		if (cantidadDeMediciones <= 0) {
			throw new Error(
					"la cantidad de mediciones deben ser mayores que cero");

		}
		this.muestrasDeHumedad = new double[cantidadDeMediciones];
		this.cantidadDeMediciones = cantidadDeMediciones;
	}

	public void cargarMuestraHumedad(int numeroDeMuestra, double humedad) {
		validarNumeroDeMuestra();
		if (humedad >= 0) {
			this.muestrasDeHumedad[numeroDeMuestra - 1] = humedad;
			contadorMuestrasTomadas++;
		}

	}

	private void validarNumeroDeMuestra() {
		if (numeroDeMuestra <= 0
				|| numeroDeMuestra > this.muestrasDeHumedad.length) {
			throw new Error("el numero de muestra no existe");
		}
	}

	public double obtenerMuestraHumedad(int numeroMuestra) {
		validarNumeroDeMuestra();
		return this.muestrasDeHumedad[numeroDeMuestra - 1];

	}

	public double humedadPromedio() {
		double totalHumedad = 0;

		for (int i = 0; i < this.muestrasDeHumedad.length; i++) {
			totalHumedad += this.muestrasDeHumedad[i];
		}
		return totalHumedad / contadorMuestrasTomadas;

	}

	public double buscarMinimoHumedad() {
		double minimoHumedad = this.muestrasDeHumedad[0];
		for (int i = 0; i < this.muestrasDeHumedad.length; i++) {
			if (this.muestrasDeHumedad[i] < minimoHumedad) {
				minimoHumedad = this.muestrasDeHumedad[i];
			}
		}
		return minimoHumedad;

	}

	public double buscarMaximoHumedad() {
		double maximoHumedad = this.muestrasDeHumedad[0];
		for (int i = 0; i < this.muestrasDeHumedad.length; i++) {
			if (this.muestrasDeHumedad[i] > maximoHumedad) {
				maximoHumedad = this.muestrasDeHumedad[i];
			}
		}
		return maximoHumedad;
	}

}
