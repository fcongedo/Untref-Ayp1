import org.junit.Assert;
import org.junit.Test;

public class PronosticoSemanalTest {

	@Test(expected = Error.class)
	public void prueboErrorAlIngresarDiaNegativo() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.obtenerTemperatura(-1);

	}

	@Test(expected = Error.class)
	public void prueboErrorAlIngresarDiaPositivoNumeroOcho() {

		PronosticoSemanal a = new PronosticoSemanal();
		a.obtenerTemperatura(8);
	}

	@Test
	public void prueboCorrectoFuncionamientoObtenerTemperaturaDiaDos() {

		double temperaturaEsperada = 25.0;
		PronosticoSemanal a = new PronosticoSemanal();

		Assert.assertEquals(temperaturaEsperada, a.obtenerTemperatura(2), 0.1);
	}

	@Test
	public void prueboCorrectoFuncionamientoObtenerTemperaturaPronosticandoTemperaturaNueva() {
		double temperaturaEsperada = 35.0;
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(5, 35.0);

		Assert.assertEquals(temperaturaEsperada, a.obtenerTemperatura(5), 0.1);
	}

	@Test
	public void prueboCorrectoFuncionamientoObtenerTemperaturaPromedio() {
		double promedioEsperado = 17.98;
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 10);
		a.pronosticarTemperatura(2, 20);
		a.pronosticarTemperatura(3, -20);
		a.pronosticarTemperatura(4, 30);
		a.pronosticarTemperatura(5, 35.5);
		a.pronosticarTemperatura(6, 0);
		a.pronosticarTemperatura(7, 50.4);

		Assert.assertEquals(promedioEsperado, a.calcularTemperaturaPromedio(),
				0.1);

	}

	@Test
	public void prueboCorrectoFuncionamientoBuscarTemperaturaMinima() {
		double temperaturaMinimaEsperada = -20;
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 10);
		a.pronosticarTemperatura(2, 20);
		a.pronosticarTemperatura(3, -20);
		a.pronosticarTemperatura(4, 30);
		a.pronosticarTemperatura(5, 35.5);
		a.pronosticarTemperatura(6, 0);
		a.pronosticarTemperatura(7, 50.4);

		Assert.assertEquals(temperaturaMinimaEsperada,
				a.buscarTemperaturaMinima(), 0.1);
	}

	@Test
	public void prueboCorrectoFuncionamientoBuscarTemperaturaMaxima() {
		double temperaturaMaximaEsperada = 50.4;
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 10);
		a.pronosticarTemperatura(2, 20);
		a.pronosticarTemperatura(3, -20);
		a.pronosticarTemperatura(4, 30);
		a.pronosticarTemperatura(5, 35.5);
		a.pronosticarTemperatura(6, 0);
		a.pronosticarTemperatura(7, 50.4);

		Assert.assertEquals(temperaturaMaximaEsperada,
				a.buscarTemperaturaMaxima(), 0.1);
	}

	@Test
	public void prueboCorrectoFuncionamientoBuscarTemperaturaMaximaMinimaYTemperaturaPromedio() {
		double temperaturaMaximaEsperada = 100;
		double temperaturaMinimaEsperada = -50;
		double temperaturaPromedioEsperada = 27.98;

		PronosticoSemanal a = new PronosticoSemanal();

		a.pronosticarTemperatura(1, 10);
		a.pronosticarTemperatura(2, 20);
		a.pronosticarTemperatura(3, 100);
		a.pronosticarTemperatura(4, 30);
		a.pronosticarTemperatura(5, 35.5);
		a.pronosticarTemperatura(6, -50);
		a.pronosticarTemperatura(7, 50.4);

		Assert.assertEquals(temperaturaMaximaEsperada,
				a.buscarTemperaturaMaxima(), 0.1);
		Assert.assertEquals(temperaturaMinimaEsperada,
				a.buscarTemperaturaMinima(), 0.1);
		Assert.assertEquals(temperaturaPromedioEsperada,
				a.calcularTemperaturaPromedio(), 0.1);
	}
}
