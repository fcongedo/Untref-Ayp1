public class Playlist {
	private Cancion[] canciones;
	private int ultimaCancion = 0;
	private int contarCantidadCanciones = 0;
	private int proximaCancionDisponible = 0;
	private double duracionTotal;
	private double duracionTotalCanciones;

	public Playlist(int cantidadMaximaDeCanciones) {
		if (cantidadMaximaDeCanciones <= 0) {
			throw new Error("maxima cantidad de canciones invalida");
		}
		canciones = new Cancion[cantidadMaximaDeCanciones];
	}

	public int ObtenerCantidadMaximaDeCanciones() {
		return canciones.length;
	}

	public void agregarUnaCancion(Cancion nuevaCancion) {
		if (proximaCancionDisponible >= canciones.length) {
			throw new Error("PlayList llena");
		}

		canciones[proximaCancionDisponible] = nuevaCancion;
		proximaCancionDisponible++;
		contarCantidadCanciones++;

	}

	public String nombreCancion(int posicion) {
		return canciones[posicion - 1].obtenerTitulo();
	}

	public double obtenerDuracionCancion(int posicion) {
		return canciones[posicion - 1].obtenerDuracion();
	}

	public int obtenerCantidadCanciones() {
		return this.contarCantidadCanciones;
	}

	public double duracionTotalPlayListEnSegundos() {

		for (int i = 0; i < contarCantidadCanciones; i++) {
			duracionTotalCanciones += canciones[i].obtenerDuracion();

		}
		return this.duracionTotalCanciones * 60;
	}

}