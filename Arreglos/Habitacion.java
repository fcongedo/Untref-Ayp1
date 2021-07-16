class Habitacion {
	private int mayores;
	private int menores;

	public void ocupar(int mayores, int menores) {

		validarMenores(menores);
		validarMayores(mayores);

		if (mayores + menores > 8) {
			throw new Error("Se supera la capacidad de la habitacion");
		}
		this.mayores = mayores;
		this.menores = menores;
	}

	private void validarMenores(int menores) {
		if (menores < 0) {
			throw new Error("no puede ingresar ocupantes negativos");
		}
	}

	private void validarMayores(int mayores) {
		if (mayores < 0) {
			throw new Error("no puede ingresar ocupantes negativos");
		}

	}

	public int obtenerCantidadDePasajeros() {
		return this.mayores + this.menores;
	}

	public boolean tieneXmayores(int mayores) {
		validarMayores(mayores);
		return this.mayores == mayores;

	}
}
