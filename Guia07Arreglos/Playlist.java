public class Playlist {
	private Cancion[] canciones;
	private int ultimaCancion = 0;
	private int contarCantidadCanciones = 0;

	public Playlist(int cantidadMaximaDeCanciones) {
		if (cantidadMaximaDeCanciones <= 0) {
			throw new Error("maxima cantidad de canciones invalida");
		}
		canciones = new Cancion[cantidadMaximaDeCanciones];
	}

	public void agregarUnaCancion(Cancion nuevaCancion) {
		int ultimaCancion = this.canciones.length;
		if (ultimaCancion >= 0) {
			canciones[ultimaCancion] = nuevaCancion;
			ultimaCancion--;
			contarCantidadCanciones++;
		}
		throw new Error("PlayList lleno");
	}

	public String nombreCancion(int posicion) {
		return canciones[posicion - 1].obtenerTitulo();
	}

	public int obtenerCantidadCanciones() {
		return this.contarCantidadCanciones;
	}

	public int duracionTotalPlayListEnSegundos() {
		int duracionTotal = 0;
		for (int i = 0; i < canciones.length; i++) {
			duracionTotal += (canciones[i].obtenerDuracion()) * 60;
		}
		return duracionTotal;
	}

}