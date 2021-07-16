import org.junit.Assert;
import org.junit.Test;

public class PronosticoSemanalTest {

	@Test(expected = Error.class)
	public void prueboIngresarDiaNegativoLanzaExcepcion() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.obtenerTemperatura(-1);
	}

	@Test(expected = Error.class)
	public void prueboIngresarNumeroOchoLanzaExcepcion() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.obtenerTemperatura(8);
	}

	@Test
	public void prueboMetodoObtenerTemperaturaDiaDos() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(2, 35.0);
		a.obtenerTemperatura(2);

		Assert.assertEquals("se espera que se obtenga 35°c", 35.0,
				a.obtenerTemperatura(2), 0.01);
	}

	@Test
	public void prueboMetodoObtenerTemperaturaDiaUno() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 45.0);
		a.obtenerTemperatura(1);
		Assert.assertEquals("se espera que se obtenga 45°c", 45.0,
				a.obtenerTemperatura(1), 0.01);
	}

	@Test
	public void prueboMetodoObtenerTemperaturaDiaSiete() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(7, 15.0);
		a.obtenerTemperatura(7);
		Assert.assertEquals("se espera que se obtenga 15°c", 15.0,
				a.obtenerTemperatura(7), 0.01);
	}

	@Test
	public void prueboFuncionamientoMetodoObtenerTemperaturaPromedio() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 50.3);
		a.pronosticarTemperatura(2, 25.0);
		a.pronosticarTemperatura(3, 28.4);
		a.pronosticarTemperatura(4, 15.0);
		a.pronosticarTemperatura(5, 0.0);
		a.pronosticarTemperatura(6, -10.0);
		a.pronosticarTemperatura(7, 35.0);

		Assert.assertEquals("se espera una temperatura promedio de 20.52°c",
				20.52, a.calcularTemperaturaPromedio(), 0.1);

	}

	@Test
	public void prueboObtenerTemperaturaMaxima() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 50.3);
		a.pronosticarTemperatura(2, 25.0);
		a.pronosticarTemperatura(3, 28.4);
		a.pronosticarTemperatura(4, 15.0);
		a.pronosticarTemperatura(5, 0.0);
		a.pronosticarTemperatura(6, -10.0);
		a.pronosticarTemperatura(7, 35.0);
		Assert.assertEquals(
				"se espera que la temperatura maxima sea de 50.3°c", 50.3,
				a.buscarTemperaturaMáxima(), 0.1);
	}

	@Test
	public void prueboObtenerTemperaturaMinima() {
		PronosticoSemanal a = new PronosticoSemanal();
		a.pronosticarTemperatura(1, 50.3);
		a.pronosticarTemperatura(2, 25.0);
		a.pronosticarTemperatura(3, 28.4);
		a.pronosticarTemperatura(4, 15.0);
		a.pronosticarTemperatura(5, 0.0);
		a.pronosticarTemperatura(6, -10.0);
		a.pronosticarTemperatura(7, 35.0);
		Assert.assertEquals(
				"se espera que la temperatura minima sea de -10.0°c", -10.0,
				a.buscarTemperaturaMínima(), 0.1);

	}
}
