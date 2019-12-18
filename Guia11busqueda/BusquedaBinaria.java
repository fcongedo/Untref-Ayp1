package guia11Busqueda;

public class BusquedaBinaria {

	public int busqueda(int[] arreglo, int buscado) {
		
		int inicio = 0;
		int fin = arreglo.length - 1;
		int medio = (inicio + fin) / 2;
		
		while (inicio <= fin) {
			
			medio = (inicio + fin) / 2;

			if (buscado == arreglo[medio]) {
				return medio;
			}
			if (buscado < arreglo[medio]) {
				fin = medio - 1;
			} else {
				inicio = medio + 1;
			}
		}
		return -1;
	}
}
