class Hotel {
	private Habitacion[] habitaciones;
	private int proximaHabitacionDisponible = 0;
	private int totalDeOcupantesDeHabitaciones = 0;

	public Hotel(int cantidadDeHabitaciones) {
		this.habitaciones = new Habitacion[cantidadDeHabitaciones];
		for (int i = 0; i < this.habitaciones.length; i++) {
			habitaciones[i] = new Habitacion();
		}
	}

	public void OcuparHabitacionCon(int mayores, int menores) {
		if (proximaHabitacionDisponible >= habitaciones.length) {
			throw new Error("no hay habitaciones disponibles");
		}
		habitaciones[proximaHabitacionDisponible].ocupar(mayores, menores);
		totalDeOcupantesDeHabitaciones += habitaciones[proximaHabitacionDisponible]
				.obtenerCantidadDePasajeros();
		proximaHabitacionDisponible++;
	}

	public int obtenerCantidadTotalDePersonasQueOcupanLasHabitaciones() {
		return this.totalDeOcupantesDeHabitaciones;
	}

	public int ContarHabitacionesConMayoresPasadoPorParametro(int mayores) {
		int totalHabitacionesConMayores = 0;
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i].tieneXmayores(mayores)) {
				totalHabitacionesConMayores++;
			}
		}
		return totalHabitacionesConMayores;
	}
	public int[] contarHabitacionesConPersonas(){
		int[] retorno = new int[9];
		for(int i = 0; i<habitaciones.length; i++){
			retorno[habitaciones[i].obtenerCantidadDePasajeros()]++;
		}
		return retorno;
		
	}
}
