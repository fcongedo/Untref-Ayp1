public class Cancion {
	private String titulo;
	private int duracion;

	public Cancion(String titulo, int duracion) {
		if (this.titulo.length() <= 0) {
			throw new Error("por favor ingrese un titulo");
		}
		if (this.duracion <= 0) {
			throw new Error("la duracion debe ser mayor a cero");
		}
		this.titulo = titulo;
		this.duracion = duracion;

	}

	public String obtenerTitulo() {
		return this.titulo;
	}

	public int obtenerDuracion() {
		return this.duracion;

	}
}
