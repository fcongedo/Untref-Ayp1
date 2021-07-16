public class TrianguloDePascal {

	private int[][] triangulo;
	private int altura;
	
	public TrianguloDePascal(int tamano) {
		this.altura = tamano;
		this.triangulo = new int[tamano][];
			
		for (int i = 0; i < tamano; i++) {
			this.triangulo[i] = new int[i+1];
		}

		for (int i = 0; i < tamano; i++) {
			this.triangulo[i][0] = 1;
			this.triangulo[i][i] = 1;
		}
		
		for (int i = 2; i < tamano; i++) {
			for (int j = 1; j < i; j++) {
				this.triangulo[i][j] = this.triangulo[i-1][j-1] + this.triangulo[i-1][j];
			}
		}
		
	}
	

	public int getAltura() {
		return this.altura;
	}
	
	
	public int getCoeficiente(int fila, int coeficiente) {
		return this.triangulo[fila-1][coeficiente-1];
	}
	
}