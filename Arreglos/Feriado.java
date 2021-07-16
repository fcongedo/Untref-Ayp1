public class Feriado {
	private String nombre;
	private int dia;
	private int mes;

	public Feriado(String nombre, int dia, int mes) {
		if (nombre.equals("")) {
			throw new Error("debe ingresar un nombre al feriado");
		}
		if (dia < 1 || dia > 31) {
			throw new Error("dia fuera de rango");
		}
		if (mes < 1 || mes > 12) {
			throw new Error("mes fuera de rango");
		}
		this.nombre = nombre;
		this.dia = dia;
		this.mes = mes;

	}

	public String obtenerNombre() {
		return this.nombre;

	}

	public int obtenerDia() {
		return this.dia;

	}

	public int obtenerMes() {
		return this.mes;

	}
}