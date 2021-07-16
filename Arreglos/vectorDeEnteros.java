public class vectorDeEnteros {

	private int posicionInvalida;

	public boolean verificarVectorEnteros(int[] vector) {
		boolean correcta = true;
		for (int i = 0; i < vector.length - 1 && correcta; i++) {
			if (vector[i] * 2 != vector[i + 1]) {
				posicionInvalida = i + 1;
				correcta = false;

			}
		}
		return correcta;

	}

	public int obtenerPosicionInvalida() {
		return posicionInvalida;
	}

}
