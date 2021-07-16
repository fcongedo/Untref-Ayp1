public class MapaDeHumedad {
	
	private double[][] mapaDeHumedad;
	private int largo;
	private int ancho;
	private double humedadTotal;
	private double humedadMaximaRegistrada;
	private double humedadMinimaRegistrada = 100;
	private int muestrasRegistradas;

	public MapaDeHumedad(int largo, int ancho) {
		this.mapaDeHumedad = new double[largo][ancho];
		this.largo = largo;
		this.ancho = ancho;
	}
	

	public void almacenarMuestra(int fila, int columna, double porcentajeDeHumedad) {
		this.validarRangoDeTerreno(fila, columna);
		
		if (porcentajeDeHumedad < 0) {
			throw new Error("El porcentaje de humedad debe "
					+ "encontrarse entre 0 y 100");
		}
		
		this.registrarHumedadMaxima(porcentajeDeHumedad);
		this.registrarHumedadMinima(porcentajeDeHumedad);
		this.registrarHumedadTotal(fila, columna, porcentajeDeHumedad);
		
		this.mapaDeHumedad[fila-1][columna-1] = porcentajeDeHumedad;
	}
	

	public double obtenerMuestra(int fila, int columna) {
		this.validarRangoDeTerreno(fila, columna);
		
		return this.mapaDeHumedad[fila-1][columna-1];
	}
	
	
	private void validarRangoDeTerreno(int fila, int columna) {
		if(fila > this.largo 
				|| fila <= 0 
				|| columna > this.ancho 
				|| columna <= 0) {
			throw new Error("La coordenada ingresada "
					+ "se encuentra fuera del terreno");
		}
	}
	
	
	private void registrarHumedadMaxima(double porcentajeDeHumedad) {
		if (porcentajeDeHumedad > this.humedadMaximaRegistrada) {
			this.humedadMaximaRegistrada = porcentajeDeHumedad;
		}
	}
	
	
	private void registrarHumedadMinima(double porcentajeDeHumedad) {
		if (porcentajeDeHumedad < this.humedadMinimaRegistrada) {
			this.humedadMinimaRegistrada = porcentajeDeHumedad;
		}	
	}
	
	
	private void registrarHumedadTotal(int fila, int columna, double porcentajeDeHumedad) {
		if (this.mapaDeHumedad[fila-1][columna-1] == 0) {
			this.humedadTotal += porcentajeDeHumedad;
			this.muestrasRegistradas++;
		} else {
			this.humedadTotal -= this.mapaDeHumedad[fila-1][columna-1];
			this.humedadTotal += porcentajeDeHumedad;
		}
	}

	
	public double obtenerHumedadPromedio() {
		return this.humedadTotal / (this.largo * this.ancho);
	}

	
	public double obtenerHumedadMaxima() {
		return this.humedadMaximaRegistrada;
	}


	public double obtenerHumedadMinima() {
		double humedadMinima = 0.0;
		
		if (this.muestrasRegistradas == this.largo * this.ancho) {
			humedadMinima = this.humedadMinimaRegistrada;
		}
		
		return humedadMinima;
	}


	public double calcularHumedadPromedioDelContorno() {		
		int metrosCuadradosDelContorno = (this.largo * this.ancho) - ((this.largo - 2) * (this.ancho - 2));
		double humedadTotalDelContorno = 0.0;
		
		for (int i = 0; i < this.largo; i++) {
			for (int j = 0; j < this.ancho; j++) {
				if (i == 0 || i == this.largo -1) {
					humedadTotalDelContorno += this.mapaDeHumedad[i][j];
				}
				if (i != 0 && i != this.largo -1 && j != 0 && j != this.ancho -1) {
					humedadTotalDelContorno += this.mapaDeHumedad[i][j];
				}
			}
		}
		
		return humedadTotalDelContorno / metrosCuadradosDelContorno;
	}


	public int contarMuestrasEnRango(double principioDeRango, double finDeRango) {
		int muestrasEnRango = 0;
		
		for (int i = 0; i < this.largo; i++) {
			for (int j = 0; j < this.ancho; j++) {
				if (this.mapaDeHumedad[i][j] >= principioDeRango 
						&& this.mapaDeHumedad[i][j] <= finDeRango) {
					muestrasEnRango++;
				}
			}
		}
		
		return muestrasEnRango;
	}


	public void reemplazarMuestraPorPromedioDeContiguos(int fila, int columna) {
		int cantidadDeContiguos = 0;
		double[] muestrasContiguas = new double[8];
		double sumaDeMuestrasContiguas = 0.0;
		
		
		muestrasContiguas[0] = this.obtenerMuestraContigua(fila-1, columna-1);
		muestrasContiguas[1] = this.obtenerMuestraContigua(fila-1, columna);
		muestrasContiguas[2] = this.obtenerMuestraContigua(fila-1, columna+1);
		muestrasContiguas[3] = this.obtenerMuestraContigua(fila, columna-1);
		muestrasContiguas[4] = this.obtenerMuestraContigua(fila, columna+1);
		muestrasContiguas[5] = this.obtenerMuestraContigua(fila+1, columna-1);
		muestrasContiguas[6] = this.obtenerMuestraContigua(fila+1, columna);
		muestrasContiguas[7] = this.obtenerMuestraContigua(fila+1, columna+1);
		
		
		for (int i = 0; i < muestrasContiguas.length; i++) {
			if (muestrasContiguas[i] != -1.0) {
				cantidadDeContiguos++;
				sumaDeMuestrasContiguas += muestrasContiguas[i];
			}
		}
		
		double porcentajeDeHumedad = sumaDeMuestrasContiguas / cantidadDeContiguos;
		
		this.almacenarMuestra(fila, columna, porcentajeDeHumedad);
		
	}
	
	private double obtenerMuestraContigua(int fila, int columna) {
		double muestra = -1.0;
		
		if (this.validarMuestraContigua(fila, columna)) {
			muestra = this.mapaDeHumedad[fila-1][columna-1];
		}
		
		return muestra;
	}
	
	
	private boolean validarMuestraContigua(int fila, int columna) {
		return fila < this.largo 
				&& fila >= 1 
				&& columna < this.ancho 
				&& columna >= 1;
	}
		
	
}