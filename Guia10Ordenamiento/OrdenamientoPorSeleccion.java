public class OrdenamientoPorSeleccion {

	public int[] Ordenar(int[] arreglo) {
		
		int menor;
		
		for (int i = 0; i < arreglo.length - 1; i++) {
			menor = i;
			for (int j = i + 1; j < arreglo.length; j++) {
				if (arreglo[j] < arreglo[menor]) {
					menor = j;
				}
			}
			int Aux = arreglo[i];
			arreglo[i] = arreglo[menor];
			arreglo[menor] = Aux;
		}
		return arreglo;
	}
}
