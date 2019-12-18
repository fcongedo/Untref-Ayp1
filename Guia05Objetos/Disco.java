public class Disco {
	private double radioExterior;
	private double radioInterior;

	Disco(double radio1, double radio2) {
		if (radio1 <= 0 || radio2 <= 0) {
			throw new Error(
					"el valor del radio o de los radios debe ser mayor a cero");
		}
		if (radio1 == radio2) {
			throw new Error("debe ingresar dos valores de radio diferentes");

		}
		if (radio1 > radio2) {
			radioExterior = radio1;
			radioInterior = radio2;
		}
		radioExterior = radio2;
		radioInterior = radio1;

	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public double getRadioInterior() {
		return radioInterior;
	}

	public double obtenerPerimetroExterior() {
		return radioExterior * 2;
	}

	public double obtenerPerimetroInterior() {
		return radioInterior * 2;
	}

	public double obtenerSuperficie() {
		return (Math.PI + radioExterior * radioExterior)
				- (Math.PI + radioInterior * radioInterior);
	}

}
