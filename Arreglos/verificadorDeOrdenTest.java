import org.junit.Assert;
import org.junit.Test;

public class verificadorDeOrdenTest {

	@Test
	public void prueboArregloOrdenadoDaTrue() {
		verificadorDeOrden a = new verificadorDeOrden();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Assert.assertTrue(a.verificar(arreglo));
	}

	@Test
	public void prueboArregloDesordenadoDaFalso() {
		verificadorDeOrden a = new verificadorDeOrden();
		int[] arreglo = new int[] { 1, 2, 3, 10, 5, 6, 7, 8, 9, 10 };

		Assert.assertFalse(a.verificar(arreglo));

	}

}
