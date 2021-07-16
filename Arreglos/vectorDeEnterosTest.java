import org.junit.Assert;
import org.junit.Test;

public class vectorDeEnterosTest {

	@Test
	public void prueboArregloCorrecto() {
		vectorDeEnteros a = new vectorDeEnteros();
		int[] arreglo = new int[] { 1, 2, 4, 8, 16 };

		Assert.assertTrue(a.verificarVectorEnteros(arreglo));
	}

	@Test
	public void prueboArregloCorrecto2() {
		vectorDeEnteros a = new vectorDeEnteros();
		int arrayAVerificar[] = { 1, 2, 4, 8 };

		Assert.assertTrue(a.verificarVectorEnteros(arrayAVerificar));
	}

	@Test
	public void laSucesionInvalidaPosicionUno() {
		vectorDeEnteros a = new vectorDeEnteros();
		int arrayAVerificar[] = { 1, 3, 4, 8 };

		Assert.assertFalse(a.verificarVectorEnteros(arrayAVerificar));
		Assert.assertEquals(1, a.obtenerPosicionInvalida());
	}

	@Test
	public void laSucesionInvalidaPosicionCinco() {
		vectorDeEnteros a = new vectorDeEnteros();
		int arrayAVerificar[] = { 1, 2, 4, 8, 10 };

		Assert.assertFalse(a.verificarVectorEnteros(arrayAVerificar));
		Assert.assertEquals(4, a.obtenerPosicionInvalida());
	}

}