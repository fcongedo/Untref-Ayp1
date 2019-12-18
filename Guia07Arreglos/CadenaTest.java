import org.junit.Assert;
import org.junit.Test;

public class CadenaTest {

	@Test
	public void testeoCrearUnaCadenaConTresEslabones() {
		double[] longitudesDeEslabones = { 4.0, 4.0, 4.0 };
		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(3, cadena.contarCantidadDeEslabones());

	}

	@Test
	public void testeoCrearUnaCadenaConCincoEslabones() {
		double[] longitudesDeEslabones = { 4.0, 4.0, 4.0, 4.0, 4.0 };
		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(5, cadena.contarCantidadDeEslabones());

	}

	@Test(expected = Error.class)
	public void testeoQueSilongitudDeEslabonesEsCeroDaError() {
		double[] longitudesDeEslabones = { 0.0 };

		Cadena cadena = new Cadena(longitudesDeEslabones);

	}

	@Test(expected = Error.class)
	public void testeoQueSiLongitudDeEslabonesEsCeroDaError() {
		double[] longitudesDeEslabones = { 4.0, 3.0, 3.0, 0 };

		Cadena cadena = new Cadena(longitudesDeEslabones);
	}

	@Test
	public void testeoObtenerEslabonUnoDevuelveUno() {
		double[] longitudesDeEslabones = { 4.0, 3.0, 3.0, 4.0 };

		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(4.0, cadena.obtenerEslabón(1).obtenerLongitud(), 0);
	}

	@Test(expected = Error.class)
	public void testeoObtenerEslabonQueNoExisteSieteDaError() {
		double[] longitudesDeEslabones = { 4.0, 3.0, 3.0, 5.0 };

		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(4.0, cadena.obtenerEslabón(4).obtenerLongitud(), 0);
	}

	@Test(expected = Error.class)
	public void testeoObtenerEslabonQueNoExisteCeroDaError() {
		double[] longitudesDeEslabones = { 4.0, 3.0, 3.0, 5.0 };

		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(4.0, cadena.obtenerEslabón(0).obtenerLongitud(), 0);
	}

	@Test
	public void TesteoLongitudTotalEslabonesIngresando3EslabonesCincoCuatroYTres() {
		double[] longitudesDeEslabones = { 5.0, 4.0, 3.0 };
		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(12.0, cadena.obtenerLongitud(), 0);
	}

	@Test
	public void TesteoContarEslabonesMayoresALongitudSuperiorATres() {
		double[] longitudesDeEslabones = { 3.0, 4.0, 5.0 };
		Cadena cadena = new Cadena(longitudesDeEslabones);

		Assert.assertEquals(2, cadena.contarEslabonesConLongitudSuperiorA(3.0));
	}
}
