public class Bateria {

	private int velocidadDeCargaxMinuto;
	private int consumoPorMinuto;
	private int nivelCargaBateria;
	private int consumoTotal;
	private int contadorCargasAlCienXciento;

	public Bateria(int velocidadDeCargaxMinuto, int consumoPorMinuto) {
		if (velocidadDeCargaxMinuto <= 0 || consumoPorMinuto <= 0) {
			throw new Error(
					"el valor de carga o consumo por minuto debe ser superior a cero");
		}
		this.velocidadDeCargaxMinuto = velocidadDeCargaxMinuto;
		this.consumoPorMinuto = consumoPorMinuto;
	}

	public int medirCarga() {
		return nivelCargaBateria;
	}

	public void consumir(int tiempo) {
		if (tiempo <= 0) {
			throw new Error(
					"el valor de tiempo para cargar la bateria tiene que ser superior a cero");
		}
		nivelCargaBateria += -(consumoPorMinuto * tiempo);
		consumoTotal += (consumoPorMinuto * tiempo);
	}

	public void cargar(int tiempo) {
		if (tiempo <= 0) {
			throw new Error(
					"el valor de tiempo para cargar la bateria tiene que ser superior a cero");
		}

		nivelCargaBateria += +(velocidadDeCargaxMinuto * tiempo);
		if (nivelCargaBateria == 100) {
			contadorCargasAlCienXciento++;
		}

	}

	public int medirConsumoTotal() {
		return this.consumoTotal;

	}

	public int contarCargasTotales() {

		return contadorCargasAlCienXciento;

	}
}
