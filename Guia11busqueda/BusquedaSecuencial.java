package guia11Busqueda;

public class BusquedaSecuencial {

	public int buscar(int[] arreglo, int buscado) {

		int posicion = -1;

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == buscado) {
				posicion = i;
			}
		}
		return posicion;
	}
}
