public class diasLluviosos {
	private boolean dias[] = new boolean[365];

	private void validarRangoDiaDelA�o(int diaDeA�o) {
		if (diaDeA�o > 365 || diaDeA�o < 1) {
			throw new Error("dia del a�o invalido, rango valido 1 a 365");
		}

	}

	void registrarQueLlovioElDia(int diaDeA�o, boolean llovio) {
		validarRangoDiaDelA�o(diaDeA�o);
		dias[diaDeA�o - 1] = llovio;

	}

	public boolean consultarSiLlovioElDia(int diaDeA�o) {
		validarRangoDiaDelA�o(diaDeA�o);
		return dias[diaDeA�o - 1];
	}

	public int contarDiasLluviosos() {
		int contadorDiasLluviosos = 0;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] == true) {
				contadorDiasLluviosos++;
			}

		}
		return contadorDiasLluviosos;

	}

	public int consultarCuatrimestreMasLluvioso() {
		int cuatrimestreMasLluvioso = 0;
		int[] cuatrimestres = new int[3];

		cuatrimestres[0] = contarDiasLluviososPorRango(1, 120);
		cuatrimestres[1] = contarDiasLluviososPorRango(121, 243);
		cuatrimestres[2] = contarDiasLluviososPorRango(244, 365);

		for (int i = 0; i < cuatrimestres.length; i++) {
			if (cuatrimestres[i] > cuatrimestreMasLluvioso) {
				cuatrimestreMasLluvioso = i + 1;
			}
		}
		return cuatrimestreMasLluvioso;
	}

	private int contarDiasLluviososPorRango(int primerDia, int ultimoDia) {
		int diasLluviosos = 0;
		for (int i = primerDia; i < ultimoDia + 1; i++) {
			if (this.dias[i - 1] == true) {
				diasLluviosos++;
			}
		}
		return diasLluviosos;
	}

	public int consultarPrimerDiaConLluvia() {
		int primerDiaConLluvia = 0;

		for (int i = 0; i < dias.length && primerDiaConLluvia == 0; i++) {
			if (dias[i] == true) {
				primerDiaConLluvia = i + 1;

			}

		}
		return primerDiaConLluvia;

	}

}
