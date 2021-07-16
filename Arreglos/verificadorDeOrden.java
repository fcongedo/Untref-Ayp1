public class verificadorDeOrden {

	public boolean verificar(int[] arregloDeEnteros) {
		boolean estaOrdenado = true;
		for (int i = 0; i < arregloDeEnteros.length - 1 && estaOrdenado; i++) {
			estaOrdenado = arregloDeEnteros[i] <= arregloDeEnteros[i + 1];
		}

		return estaOrdenado;
	}

}
