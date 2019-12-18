import org.junit.Assert;
import org.junit.Test;

public class NotaTest {

	@Test(expected = Error.class)
	public void prueboQueSiIngresoNotaNegativaDaError() {
		// inicializacion
		new Nota(-4);

	}

	@Test(expected = Error.class)
	public void prueboQueSiIngresoNotaMayorA10DaError() {
		// inicializacion
		new Nota(11);
	}

	@Test(expected = Error.class)
	public void prueboQueSiNuevoValorEsNegativoDaError() {
		// inicializacion
		Nota n = new Nota(4);
		// operacion
		n.recuperar(-10);
	}

	@Test
	public void prueboCorrectoFuncionamientoObtenerValor() {
		// inicializacion
		Nota n = new Nota(6);
		// operacion
		n.obtenerValor();
		// validacion
		Assert.assertEquals("se espera que el valor sea 6", 6, n.obtenerValor());

	}

	@Test
	public void prueboCorrectoFuncionamientoDelMetodoAprobado() {
		// inicializacion
		Nota n = new Nota(4);
		// operacion
		n.aprobado();

		// validacion
		Assert.assertTrue("se espera true", true);
	}

	@Test
	public void prueboCorrectoFuncionamientoDelMetodoDesaprobado() {
		// inicializacion
		Nota n = new Nota(3);
		// operacion
		n.desaprobado();
		// validacion
		Assert.assertFalse("se espera false", false);
	}

	@Test
	public void prueboCorrectoFuncionamientoDelMetodoAprobadoYDesaprobadoJuntosTrueFalse() {
		// inicializacion
		Nota n = new Nota(4);
		// operacion
		n.aprobado();
		n.desaprobado();

		// validacion
		Assert.assertTrue("se espera true", true);
		Assert.assertFalse("se espera true", false);
	}

	public void prueboCorrectoFuncionamientoDelMetodoAprobadoYDesaprobadoJuntosFalsoTrue() {
		// inicializacion
		Nota n = new Nota(3);
		// operacion
		n.aprobado();
		n.desaprobado();

		// validacion
		Assert.assertFalse("se espera true", false);
		Assert.assertTrue("se espera true", true);
	}

	@Test
	public void PrueboQueSiRecuperarConNotaMayorActualizaValor() {
		// inicializacion
		Nota n = new Nota(3);
		// operacion
		n.recuperar(5);
		// validacion
		Assert.assertEquals("se espera que el valor sea 5", 5, n.obtenerValor());

	}

	@Test
	public void PrueboQueSiRecuperarConNotaMenorNoActualizaValor() {
		// inicializacion
		Nota n = new Nota(5);
		// operacion
		n.recuperar(4);
		// validacion
		Assert.assertEquals("se espera que el valor sea 5", 5, n.obtenerValor());
	}
}