public class Cancion {
	private String titulo;
	private double duracion;

	public Cancion(String titulo, double duracion) {
		if (titulo.equals("")) {
			throw new Error("por favor ingrese un titulo");
		}
		if (duracion <= 0.0) {
			throw new Error("la duracion debe ser mayor a cero");
		}
		this.titulo = titulo;
		this.duracion = duracion;

	}

	public String obtenerTitulo() {
		return this.titulo;
	}

	public double obtenerDuracion() {
		return this.duracion;

	}
}
