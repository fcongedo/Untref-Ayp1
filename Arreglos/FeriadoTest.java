import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FeriadoTest {

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadoSinNombre() {
		Feriado a = new Feriado("", 1, 1);
	}

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadoConDiaIgualACero() {
		Feriado a = new Feriado("Hola", 0, 1);
	}

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadoConDiaIgualANegativo() {
		Feriado a = new Feriado("Hola", -1, 1);
	}

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadoConDia32() {
		Feriado a = new Feriado("Hola", 32, 1);
	}

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadoConMes13o() {
		Feriado a = new Feriado("Hola", 1, 13);
	}

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadooConMesIgualACero() {
		Feriado a = new Feriado("Hola", 1, 0);
	}

	@Test(expected = Error.class)
	public void ErrorAlCrearFeriadoConMesIgualANegativo() {
		Feriado a = new Feriado("Hola", 1, -1);
	}

	@Test
	public void crearUnFeriadoCorrectamente() {

		Feriado a = new Feriado("Hola", 1, 1);
		Assert.assertEquals("Hola", a.obtenerNombre());
		Assert.assertEquals(1, a.obtenerDia());
		Assert.assertEquals(1, a.obtenerMes());

	}

}
