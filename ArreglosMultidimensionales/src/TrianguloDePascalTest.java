import org.junit.Assert;
import org.junit.Test;



public class TrianguloDePascalTest {

	@Test
	public void getCoeficiente() {
		
		TrianguloDePascal triangulo = new TrianguloDePascal(5);
		Assert.assertEquals("cantidad de filas",
							5, triangulo.getAltura());
		Assert.assertEquals("2do coeficiente de la fila 4",
				3, triangulo.getCoeficiente(4, 2));
		Assert.assertEquals("4to coeficiente de la fila 5",
				4, triangulo.getCoeficiente(5, 4));
		
	}
	
}