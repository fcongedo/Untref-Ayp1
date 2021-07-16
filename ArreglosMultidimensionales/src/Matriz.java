public class Matriz {

	private int filas;
	private int columnas;
	private int[][] matriz;

	public Matriz(int[][] matriz) {
		this.filas = matriz.length;
		this.columnas = matriz[0].length;
		this.matriz = matriz;
	}

	public int getFilas() {
		return this.filas;
	}

	public int getColumnas() {
		return this.columnas;
	}

	public int[][] getMatriz() {
		return this.matriz;
	}

	public Matriz sumarMatriz(Matriz matrizASumar) {

		if (this.columnas != matrizASumar.getColumnas()
				|| this.filas != matrizASumar.getFilas()) {
			throw new Error("No se puede sumar dos matrices de distinta"
					+ "dimensión");
		}

		int[][] matrizResultado = new int[this.filas][this.columnas];

		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				matrizResultado[i][j] = this.matriz[i][j]
						+ matrizASumar.getMatriz()[i][j];
			}
		}

		Matriz matrizResultante = new Matriz(matrizResultado);

		return matrizResultante;

	}

	public Matriz restarMatriz(Matriz matrizARestar) {

		if (this.columnas != matrizARestar.getColumnas()
				|| this.filas != matrizARestar.getFilas()) {
			throw new Error("No se puede restar dos matrices de distinta"
					+ "dimensión");
		}

		int[][] matrizResultado = new int[this.filas][this.columnas];

		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				matrizResultado[i][j] = this.matriz[i][j]
						- matrizARestar.getMatriz()[i][j];
			}
		}

		Matriz matrizResultante = new Matriz(matrizResultado);

		return matrizResultante;

	}

	public Matriz multiplicarPorEscalar(int escalar) {

		int[][] matrizResultado = new int[this.filas][this.columnas];

		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				matrizResultado[i][j] = escalar * this.matriz[i][j];
			}
		}

		Matriz matrizResultante = new Matriz(matrizResultado);

		return matrizResultante;

	}

	public boolean esDiagonal() {
		boolean esDiagonal = true;

		for (int i = 0; i < this.filas && esDiagonal; i++) {
			for (int j = 0; j < this.columnas && esDiagonal; j++) {
				if (i == j && this.matriz[i][j] == 0 || i != j
						&& this.matriz[i][j] != 0) {
					esDiagonal = false;
				}
			}

		}

		return esDiagonal;
	}

	public boolean esTriangularInferior() {
		boolean esTriangularInferior = true;

		for (int i = 0; i < this.filas && esTriangularInferior; i++) {
			for (int j = 0; j < this.columnas && esTriangularInferior; j++) {
				if (i == j && this.matriz[i][j] == 0 || i > j
						&& this.matriz[i][j] == 0 || i < j
						&& this.matriz[i][j] != 0) {
					esTriangularInferior = false;
				}
			}

		}

		return esTriangularInferior;
	}

	public boolean esTriangularSuperior() {
		boolean esTriangularSuperior = true;

		for (int i = 0; i < this.filas && esTriangularSuperior; i++) {
			for (int j = 0; j < this.columnas && esTriangularSuperior; j++) {
				if (i == j && this.matriz[i][j] == 0 || i < j
						&& this.matriz[i][j] == 0 || i > j
						&& this.matriz[i][j] != 0) {
					esTriangularSuperior = false;
				}
			}

		}

		return esTriangularSuperior;
	}

}