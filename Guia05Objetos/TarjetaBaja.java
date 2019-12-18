public class TarjetaBaja {
	private double precioViajeColectivo = 1.25;
	private double precioViajeSubte = 2.50;
	private int contadorViajesColectivo;
	private int contadorViajesSubte;
	private double saldo;

	/*
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		if (saldoInicial <= 0) {
			throw new Error(
					"el saldo debe ser mayor a cero para poder realizar viajes");
		}
		saldo = saldoInicial;

	}

	public double obtenerSaldo() {
		return saldo;
	}

	/*
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		if (monto <= 0) {
			throw new Error("el monto a agregar debe ser superior a cero");
		}
		this.saldo += monto;

	}

	/*
	 * pre : saldo suficiente. post: utiliza 1.25 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if (saldo < precioViajeColectivo) {
			throw new Error(
					"saldo insuficiente para viajar en colectivo, por favor recargue la tarjeta");
		}
		this.saldo -= precioViajeColectivo;
		contadorViajesColectivo++;

	}

	/*
	 * pre : saldo suficiente. post: utiliza 2.50 del saldo para un viaje en
	 * subte.
	 */
	public void pagarViajeEnSubte() {
		if (saldo < precioViajeSubte) {
			throw new Error(
					"saldo insuficiente para viajar en Subte, por favor recargue la tarjeta");
		}
		this.saldo -= precioViajeSubte;
		contadorViajesSubte++;

	}

	/*
	 * post: devuelve la cantidad de viajes realizados.
	 */

	public int contarViajes() {
		return contadorViajesSubte + contadorViajesColectivo;

	}

	/*
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return contadorViajesColectivo;

	}

	/*
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return contadorViajesSubte;

	}
}
