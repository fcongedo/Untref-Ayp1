public class ExpendedorDePasajes {
	private double precioPorKm;
	private double distanciaMaxima;
	private double distanciaTotal;
	private double ventaTotal;
	private int contadorCantidadPasajesVendidos = 0;

	public ExpendedorDePasajes(double precioPorKm) {
		if (precioPorKm <= 0) {
			throw new Error("el precioPorKm debe ser mayor a cero");
		}
		this.precioPorKm = precioPorKm;

	}

	public double venderPasaje(double distanciaEnKm) {
		if (distanciaEnKm <= 0) {
			throw new Error("la distanciaEnKm debe ser mayor a cero");
		}
		if (distanciaEnKm > distanciaMaxima) {
			this.distanciaMaxima = distanciaEnKm;
			ventaTotal += (distanciaEnKm * precioPorKm);
			distanciaTotal += distanciaEnKm;
			contadorCantidadPasajesVendidos++;

		}
		return this.precioPorKm * distanciaEnKm;

	}

	public double venderPasajes(int cantidad, double distanciaEnKm) {
		if (cantidad <= 0 || distanciaEnKm <= 0) {
			throw new Error(
					"la distancia en km o la cantidad deben ser mayores a cero");
		}
		if (distanciaEnKm > distanciaMaxima) {
			this.distanciaMaxima = distanciaEnKm;
			this.distanciaTotal += (cantidad * distanciaEnKm);
			this.ventaTotal += (this.precioPorKm * cantidad * distanciaEnKm);
			this.contadorCantidadPasajesVendidos += cantidad;
		}
		return this.precioPorKm * distanciaEnKm * cantidad;

	}

	public int pasajesVendidos() {
		return contadorCantidadPasajesVendidos;

	}

	public double distanciaMaxima() {
		return this.distanciaMaxima;

	}

	public double distanciaPromedio() {
		return this.distanciaTotal / this.contadorCantidadPasajesVendidos;
	}

	public double ventaTotal() {
		return this.ventaTotal;

	}
}