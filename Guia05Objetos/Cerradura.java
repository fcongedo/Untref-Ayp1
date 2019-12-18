public class Cerradura {

	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int claveDeApertura;
	private int intentosExitosos;
	private int intentosFallidos;
	private boolean estaAbierta;
	private boolean estaBloqueada;

	public Cerradura(int claveDeApertura,
			int cantidadDeFallosConsecutivosQueLaBloquean) {
		if (cantidadDeFallosConsecutivosQueLaBloquean <= 0) {
			throw new Error(
					"la cantidad de fallos consecutivos debe ser superior a cero");

		}
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.claveDeApertura = claveDeApertura;
	}

	public boolean abrir(int clave) {
		if (!estaBloqueada) {
			if (this.claveDeApertura == clave) {

				this.intentosExitosos++;
				this.intentosFallidos = 0;
				this.estaAbierta = true;
				System.out.println("clave correcta, cerradura abierta");
			} else {

				this.intentosFallidos++;
				System.out.println("clave incorrecta, cerradura cerrada");
				this.estaAbierta = false;
			}
			if (intentosFallidos == cantidadDeFallosConsecutivosQueLaBloquean) {
				System.out.println("Intento abrir la cerradura incorrectamente "
						+ cantidadDeFallosConsecutivosQueLaBloquean
						+ " veces cerradura  bloqueada");
				this.estaBloqueada = true;

			}

		}
		return estaAbierta;

	}

	public void cerrar() {
		if (estaAbierta == true) {

			this.estaAbierta = false;
		}
	}

	public boolean estaAbierta() {
		return this.estaAbierta;

	}

	public boolean estaCerrada() {
		return !this.estaAbierta;
	}

	public boolean fueBloqueada() {
		return this.estaBloqueada;

	}

	public int contarAperturasExitosas() {
		return this.intentosExitosos;
	}

	public int contarAperturasFallidas() {
		return this.intentosFallidos;
	}
}