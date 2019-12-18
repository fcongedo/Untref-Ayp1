public class OrdenamientoPorInsercion {

	public int[] ordenar(int[] vector) {

		for (int i = 1; i < vector.length; i++) {

			int Aux = vector[i];

			for (int j = i - 1; j >= 0; j--) {
				if (Aux < vector[j]) {

					vector[j + 1] = vector[j];
					vector[j] = Aux;
				}
			}
		}
		return vector;
	}
}