import org.junit.Assert;
import org.junit.Test;

public class OrdenamientoPorBurbujeoTest {

	@Test
	public void testPruebOCorrectoFuncionamientoBurbujeo() {
		
		OrdenamientoPorBurbujeo a = new OrdenamientoPorBurbujeo();
		int[] arreglo = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arregloEsperado = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Assert.assertArrayEquals(arregloEsperado, a.ordenar(arreglo));
	}

	@Test
	public void PrimerTestDeOrdenamientoPorBurbujeo() {

		
		int arreglo[] = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int arregloEsperado[] = new int[] { 1, 12, 25, 54, 65, 68, 76, 76, 86, 87 };
		OrdenamientoPorBurbujeo a = new OrdenamientoPorBurbujeo();
		

		
		Assert.assertArrayEquals(arregloEsperado, a.ordenar(arreglo));

	}
}