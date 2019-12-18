package guia11Busqueda;

import org.junit.Assert;
import org.junit.Test;

public class BusquedaBinariaTest {

	@Test
	public void PrueboFuncionamientoBusquedaBinariaBuscandoNumeroVeinte() {
		BusquedaBinaria a = new BusquedaBinaria();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
		int posicion = 9;
	

		Assert.assertEquals(posicion, a.busqueda(arreglo, 20));

	}

	@Test
	public void PrueboCorrectoFuncionamientoBusquedaBinariaNoEncuentraDevuelveMenosUno() {
		BusquedaBinaria a = new BusquedaBinaria();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		a.busqueda(arreglo, 20);
		int posicion = -1;

		Assert.assertEquals(posicion, a.busqueda(arreglo, 20));
	}

	@Test
	public void PrueboFuncionamientoBusquedaBinariaBuscandoNumeroUno() {
		BusquedaBinaria a = new BusquedaBinaria();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
		int posicion = 0;

		Assert.assertEquals(posicion, a.busqueda(arreglo, 1));
	}

	@Test
	public void PrueboFuncionamientoBusquedaBinariaBuscandoNumeroCinco() {
		BusquedaBinaria a = new BusquedaBinaria();
		int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
		int posicion = 4;

		Assert.assertEquals(posicion, a.busqueda(arreglo, 5));
	}
}
