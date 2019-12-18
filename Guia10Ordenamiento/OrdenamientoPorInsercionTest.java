
import org.junit.Assert;
import org.junit.Test;

public class OrdenamientoPorInsercionTest {

	@Test
	public void pruebaConArrayOrdenadoInsercion() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayEsperado = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		OrdenamientoPorInsercion ordenador = new OrdenamientoPorInsercion();

		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	
	@Test
	public void pruebaConArrayOrdenadoInsercionDos() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayEsperado = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		OrdenamientoPorInsercion ordenador = new OrdenamientoPorInsercion();

		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
	@Test
	public void pruebaConArrayOrdenadoInsercion3() {
		int[] array = { 1, 10, 30, 0, 5, 50, -1, 2, 9, 3 };
		int[] arrayEsperado = { -1, 0, 1, 2, 3, 5, 9, 10, 30, 50 };

		OrdenamientoPorInsercion ordenador = new OrdenamientoPorInsercion();

		Assert.assertArrayEquals(arrayEsperado, ordenador.ordenar(array));
	}
}

