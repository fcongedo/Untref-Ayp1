import org.junit.Assert;
import org.junit.Test;

public class CancionTest {

	@Test(expected = Error.class)
	public void EsperoUnErrorAlCrearCancionConUnaDuracionDeCero() {

		Cancion a = new Cancion("Hola", 0);

	}

	@Test(expected = Error.class)
	public void EsperoUnErrorAlCrearCancionConUnaDuracionNegativa() {

		Cancion a = new Cancion("Hola", -1);

	}

	@Test(expected = Error.class)
	public void EsperoUnErrorAlCrearCancionSinTitulo() {

		Cancion a = new Cancion("", 2);

	}

	@Test
	public void CreaCorrectamenteUnaCancionConTituloHolaYDuracionDos() {

		Cancion a = new Cancion("Hola", 2);

		Assert.assertEquals(2, a.obtenerDuracion());
		Assert.assertEquals("Hola", a.obtenerTitulo());

	}

}
