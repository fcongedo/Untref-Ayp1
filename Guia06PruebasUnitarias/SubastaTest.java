import org.junit.Assert;
import org.junit.Test;

public class SubastaTest {

	@Test(expected = Error.class)
	public void prueboArticuloVacioDaError() {
		// inicializacion
		new Subasta("", 3);
	}

	@Test(expected = Error.class)
	public void prueboArticuloVacioYPrecioBaseCeroDaError() {
		// inicializacion
		new Subasta("", 0);
	}

	@Test(expected = Error.class)
	public void prueboArticuloVacioYPrecioBaseNegativoDaError() {
		// inicializacion
		new Subasta("", -200);
	}

	@Test(expected = Error.class)
	public void prueboPrecioBaseCeroDaErrorConArticuloLlenoDaError() {
		// inicializacion
		new Subasta("auto", 0);
	}

	@Test(expected = Error.class)
	public void prueboPrecioBaseNegativoConArticuloLlenoDaError() {
		// inicializacion
		new Subasta("auto", -100);
	}

	@Test(expected = Error.class)
	public void prueboQueSiOfertaEsCeroDaError() {
		// inicializacion
		Subasta sub = new Subasta("auto", 4);
		// operacion
		sub.ofertar(0);
	}

	@Test(expected = Error.class)
	public void prueboQueSiOFertaEsNegativaDaError() {
		// inicializacion
		Subasta sub = new Subasta("auto", 4);
		// operacion
		sub.ofertar(-100);
	}

	@Test(expected = Error.class)
	public void prueboQueSiOfertaEsMenorPrecioBaseDaErorr() {
		// inicializacion
		Subasta sub = new Subasta("auto", 3);
		// operacion
		sub.ofertar(2);
	}

	@Test
	public void prueboFuncionamientoObtenerArticulo() {
		// inicializacion
		Subasta sub = new Subasta("auto", 3);
		// operacion
		sub.obtenerArticulo();
		// validacion
		Assert.assertEquals("se espera que sea auto", "auto",
				sub.obtenerArticulo());
	}

	@Test
	public void prueboQueActualizaOfertaGanadora() {
		// inicializacion
		Subasta sub = new Subasta("auto", 3);
		// operacion
		sub.ofertar(5);
		sub.ofertar(6);
		sub.obtenerOfertaGanadora();
		// validacion
		Assert.assertEquals("se espera que la oferta ganadora sea 6", 6,
				sub.obtenerOfertaGanadora(), 0);
	}

	@Test
	public void prueboQueSiOfertoValorMenoraOfertaGanadorActualNoActualizaOfertaGanador() {
		// inicializacion
		Subasta sub = new Subasta("auto", 1);
		// operacion
		sub.ofertar(6);
		sub.ofertar(4);
		// validacion
		Assert.assertEquals("se espera que la oferta ganadora sera 6", 6,
				sub.obtenerOfertaGanadora(), 0);
	}

	@Test
	public void PrueboQueSiOfertaEsIgualPrecioBaseActualizaOfertaGanador() {
		// inicializacion
		Subasta sub = new Subasta("auto", 2);
		// operacion
		sub.ofertar(2);
		// validacion
		Assert.assertEquals("se espera que oferta ganadora sea 2", 2,
				sub.obtenerOfertaGanadora(), 0);
	}

	@Test
	public void prueboQueSiSubastaEstaCerradaIgnoraOfertasMayoresAlPrecioBase() {
		// inicializacion
		Subasta sub = new Subasta("auto", 4);
		// operacion
		sub.ofertar(5);
		sub.cerrar();
		sub.ofertar(6);
		// validacion
		Assert.assertEquals("se espera que oferta ganadora sea 5", 5,
				sub.obtenerOfertaGanadora(), 0);
	}

}
