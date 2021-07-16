class Paquete {

	private int codigo;
	private String remitente;
	private double peso;

	public Paquete(int codigo, String remitente, double peso) {
		if (codigo <= 0) {
			throw new Error("el codigo debe ser mayor que cero");
		}
		if (remitente.equals("")) {
			throw new Error("debe ingresar un remitente");
		}
		if (peso <= 0) {
			throw new Error("el peso debe ser superior a cero");
		}
		this.codigo = codigo;
		this.remitente = remitente;
		this.peso = peso;

	}

	public String obtenerRemitente() {
		return this.remitente;

	}

	public double obtenerPeso() {
		return this.peso;

	}

	public int obtenerCodigo() {
		return this.codigo;

	}
}
