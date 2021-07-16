import org.junit.Assert;
import org.junit.Test;

public class CadenaTest {

	@Test
	public void crearCadenaConTresEslabones() {
		double[] longitudDeEslabones = { 4.0, 4.0, 4.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);

		Assert.assertEquals(3, cadena.contarCantidadDeEslabones());
	}

	@Test
	public void crearCadenaConCincoEslabones() {
		double[] longitudDeEslabones = { 4.0, 4.0, 4.0, 4.0, 4.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);

		Assert.assertEquals(5, cadena.contarCantidadDeEslabones());
	}

	@Test(expected = Error.class)
	public void prueboQueLanzaExepcionAlCrearUnaCadenaConLongitudCeroDeEslabon() {
		double[] longitudDeEslabones = { 4.0, 4.0, 0.0, 4.0, 4.0 };
		new Cadena(longitudDeEslabones);
	}

	@Test
	public void siObtengoEslabonUnoDevuelveEslabonUno() {
		double[] longitudDeEslabones = { 4.0, 3.0, 2.6, 5, 4, 10.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);
		Assert.assertEquals(4.0, cadena.obtenerEslabón(1).obtenerLongitud(), 0);

	}

	@Test(expected = Error.class)
	public void siObtengoEslabonCeroDaError() {
		double[] longitudDeEslabones = { 4.0, 3.0, 2.6, 5, 4.8 };
		Cadena cadena = new Cadena(longitudDeEslabones);
		Assert.assertEquals(4.0, cadena.obtenerEslabón(0).obtenerLongitud(), 0);

	}

	@Test(expected = Error.class)
	public void siObtengoEslabonQueNoExisteDaError() {
		double[] longitudDeEslabones = { 4.0, 3.0, 2.6, 5.4, 8.1 };

		Cadena cadena = new Cadena(longitudDeEslabones);

		Assert.assertEquals(4.0, cadena.obtenerEslabón(7).obtenerLongitud(), 0);
	}

	@Test
	public void longitudesTotalDeEslabonConLongitudesCincoCuatroYTresEsDoce() {
		double[] longitudDeEslabones = { 5.0, 4.0, 3.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);
		Assert.assertEquals(12.0, cadena.obtenerLongitud(), 0.1);
	}

	@Test
	public void logitudesCincoCuatroYTreceEsVeintidos() {
		double[] longitudDeEslabones = { 5.0, 4.0, 13.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);
		Assert.assertEquals(22.0, cadena.obtenerLongitud(), 0.1);
	}

	@Test
	public void conUnaCadenaDeLongitudesTresCuatroYCincoEslabonesSuperioresATresSonDos() {
		double[] longitudDeEslabones = { 3.0, 4.0, 5.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);
		Assert.assertEquals(2, cadena.contarEslabonesConLongitudSuperiorA(3));
	}

	@Test
	public void conUnaCadenaDeLongitudesTresCuatroDoceYCincoEslabonesSuperioresATresSonTres() {
		double[] longitudDeEslabones = { 3.0, 4.0, 12.0, 5.0 };
		Cadena cadena = new Cadena(longitudDeEslabones);
		Assert.assertEquals(3, cadena.contarEslabonesConLongitudSuperiorA(3));
	}

}
