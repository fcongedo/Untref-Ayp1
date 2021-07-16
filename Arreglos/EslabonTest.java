import org.junit.Assert;
import org.junit.Test;

public class EslabonTest {

	@Test
	public void crearEslabonConNumeroTresCreaEslabonConNumeroTres() {
		Eslabon eslabon = new Eslabon(3, 8.0);
		Assert.assertEquals(3, eslabon.obtenerNumero());
	}

	@Test
	public void crearEslabonConNumeroCuatroCreaEslabonConNumeroCuatro() {
		Eslabon eslabon = new Eslabon(4, 8.0);
		Assert.assertEquals(4, eslabon.obtenerNumero());
	}

	@Test(expected = Error.class)
	public void creaEslabonConNumeroMenosUnoDaError() {
		new Eslabon(-1, 8.0);
	}

	@Test(expected = Error.class)
	public void creaEslabonConNumeroCeroDaError() {
		new Eslabon(0, 8.0);
	}

	@Test(expected = Error.class)
	public void creaEslabonConLongitudCeroDaError() {

		new Eslabon(2, 0.0);
	}

	@Test
	public void creaEslabonConLongitudCuatro() {
		Eslabon eslabon = new Eslabon(3, 4.0);
		Assert.assertEquals(4.0, eslabon.obtenerLongitud(), 0.1);
	}

	@Test
	public void creaEslabonConLongitudCinco() {
		Eslabon eslabon = new Eslabon(3, 5.0);
		Assert.assertEquals(5.0, eslabon.obtenerLongitud(), 0.1);
	}

	@Test
	public void creaUnEslabonConLongitudCincoLuegoCambioLongitudAVeinte() {
		Eslabon eslabon = new Eslabon(4, 5.0);
		eslabon.cambiarLongitud(20.0);
		Assert.assertEquals(20.0, eslabon.obtenerLongitud(), 0.1);

	}

}