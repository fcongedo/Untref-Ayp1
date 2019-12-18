public class OrdenamientoPorBurbujeo {
	private int aux;

	public int[] ordenar(int[] arreglo) {

		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = 0; j < arreglo.length - i -1; j++) {
				if (arreglo[j + 1] < arreglo[j]) {
					aux = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}
		return arreglo;
	}
}
