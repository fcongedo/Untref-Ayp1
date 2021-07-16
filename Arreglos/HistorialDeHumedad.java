public class HistorialDeHumedad {

	private int cantidadDeMedicionesDeHumedad;
	private double[] muestrasDeHumedad;
	private int contadorDeMuestrasDeHumedad;

	public HistorialDeHumedad(int cantidadMedicionesDeHumedad) {
		if (cantidadMedicionesDeHumedad <= 0) {
			throw new Error(
					"la cantidad de mediciones por dia debe ser al menos 1");
		}
		this.cantidadDeMedicionesDeHumedad = cantidadMedicionesDeHumedad;
		this.muestrasDeHumedad = new double[cantidadDeMedicionesDeHumedad];
	}

	public void almacenarMuestraHumedad(int numeroDeMuestra, double humedad) {
		validarNumeroDeMuestra(numeroDeMuestra);
		validarHumedad(humedad);
		this.muestrasDeHumedad[numeroDeMuestra - 1] = humedad;
		contadorDeMuestrasDeHumedad++;

	}

	public int obtenerCantidadDeMedicionesDeHumedad() {
		return this.cantidadDeMedicionesDeHumedad;
	}

	public double obtenerMuestra(int numeroDeMuestra) {
		validarNumeroDeMuestra(numeroDeMuestra);
		return this.muestrasDeHumedad[numeroDeMuestra - 1];

	}

	public double obtenerHumedadPromedio() {
		double humedadTotal = 0;
		for (int i = 0; i < muestrasDeHumedad.length; i++) {
			humedadTotal += this.muestrasDeHumedad[i];

		}
		return humedadTotal / contadorDeMuestrasDeHumedad;

	}

	public double obtenerMaximoDeHumedad() {
		double maximoHumedad = this.muestrasDeHumedad[0];
		for (int i = 1; i < this.muestrasDeHumedad.length; i++) {
			if (this.muestrasDeHumedad[i] > maximoHumedad) {
				maximoHumedad = this.muestrasDeHumedad[i];
			}

		}
		return maximoHumedad;

	}

	public double obtenerMinimoDeHumedad() {
		double minimoHumedad = this.muestrasDeHumedad[0];
		for (int i = 1; i < this.muestrasDeHumedad.length; i++) {
			if (this.muestrasDeHumedad[i] < minimoHumedad) {
				minimoHumedad = this.muestrasDeHumedad[i];
			}

		}
		return minimoHumedad;
	}

	private void validarNumeroDeMuestra(int numeroDeMuestra) {
		if (numeroDeMuestra < 1
				|| numeroDeMuestra > this.muestrasDeHumedad.length) {
			throw new Error("el numero de muestra minimo es 1");
		}
	}

	private void validarHumedad(double humedad) {
		if (humedad < 0) {
			throw new Error("la humedad debe ser mayor o igual a cero");
		}

	}
}
