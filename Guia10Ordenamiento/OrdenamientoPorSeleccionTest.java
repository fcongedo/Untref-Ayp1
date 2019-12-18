import org.junit.Assert;
import org.junit.Test;



public class OrdenamientoPorSeleccionTest {

	@Test
	public void PrimerTestOrdenamientoPorSeleccion() {

		// Arrange
		int arreglo[] = new int[] { 54, 25, 86, 12, 65, 76, 1, 68, 76, 87 };
		int arregloExperado[] = new int[] { 1, 12, 25, 54, 65, 68, 76, 76, 86, 87 };
		
		OrdenamientoPorSeleccion a = new OrdenamientoPorSeleccion();

		// Act
		a.Ordenar(arreglo);

		// Assert
	Assert.assertArrayEquals(arregloExperado, a.Ordenar(arreglo));
	}
	
	@Test
	public void PrimerTestOrdenamientoPorSeleccionEjemploDos() {

		// Arrange
		int arreglo[] = new int[] { 54,20,100,10,1,3,2,5 };
		int arregloExperado[] = new int[] { 1,2,3,5,10,20,54,100 };
		
		OrdenamientoPorSeleccion a = new OrdenamientoPorSeleccion();

		// Act
		a.Ordenar(arreglo);

		// Assert
	Assert.assertArrayEquals(arregloExperado, a.Ordenar(arreglo));
	}
}