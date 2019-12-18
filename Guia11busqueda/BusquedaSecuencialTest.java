package guia11Busqueda;

import org.junit.Assert;
import org.junit.Test;

public class BusquedaSecuencialTest {

	@Test
	public void prueboCorrectoFuncionamientoBusquedaSecuencial() {
		BusquedaSecuencial a = new BusquedaSecuencial();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int posicion = 5;

		Assert.assertEquals(posicion, a.buscar(arreglo, 6));

	}

	@Test
	public void prueboCorrectoFuncionamientoBusquedaSecuencialSiNoLoEncuentraDevuelveMenosUno() {
		BusquedaSecuencial a = new BusquedaSecuencial();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	    int posicion = -1;

		Assert.assertEquals(posicion, a.buscar(arreglo, 11));

	}

	@Test
	public void prueboCorrectoFuncionamientoBusquedaSecuencialBuscandoNumeroNueve() {
		BusquedaSecuencial a = new BusquedaSecuencial();
		int[] arreglo = new int[] { 10, 9, 8, 20, 12, 14, 0, 5, 3 };
		int posicion= 1;

		Assert.assertEquals(posicion, a.buscar(arreglo, 9));
	}

	@Test
	public void prueboCorrectoFuncionamientoBusquedaSecuencialBuscandoNumeroCero() {
		BusquedaSecuencial a = new BusquedaSecuencial();
		int[] arreglo = new int[] { 10, 9, 8, 20, 12, 14, 0, 5, 3 };
		int posicion = 6;

		Assert.assertEquals(posicion, a.buscar(arreglo, 0));

	}

}
