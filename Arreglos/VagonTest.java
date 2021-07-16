import org.junit.Assert;
import org.junit.Test;

public class VagonTest {

	@Test
	public void seCreaUnVagonConNumeroUno() {
		Vagon vagon = new Vagon(1, 200);
		Assert.assertEquals(1, vagon.obtenerNúmero());
	}

	@Test
	public void seCreaUnVagonConNumeroTres() {
		Vagon vagon = new Vagon(3, 200);
		Assert.assertEquals(3, vagon.obtenerNúmero());
	}

	@Test(expected = Error.class)
	public void seCreaUnVagonConNumeroCeroLargaUnaExcepcion() {
		Vagon vagon = new Vagon(0, 200);

	}

	@Test(expected = Error.class)
	public void seCreaUnVagonConNumeroNegativoLargaUnaExcepcion() {
		Vagon vagon = new Vagon(-1, 200);

	}

	@Test(expected = Error.class)
	public void SecreaUnVagonConCapacidadDeCargaCeroLargaUnaExcepcion() {
		Vagon vagon = new Vagon(1, 0);
	}

	@Test(expected = Error.class)
	public void SecreaUnVagonConCapacidadDeCargaNegativaLargaUnaExcepcion() {
		Vagon vagon = new Vagon(1, -10);
	}

	@Test
	public void CreaUnVagonConCapacidadDeCargaDe200() {
		Vagon vagon = new Vagon(1, 200);
		Assert.assertEquals(200, vagon.obtenerCapacidadDeCarga());
	}

	@Test
	public void CreaUnVagonSuCargaEsCero() {
		Vagon vagon = new Vagon(1, 200);
		Assert.assertEquals(0, vagon.obtenerCarga());
	}

	@Test
	public void AlCambiarLaCargaA1000LaCargaEs1000() {
		Vagon vagon = new Vagon(1, 1000);
		vagon.cambiarCarga(1000);
		Assert.assertEquals(1000, vagon.obtenerCarga());
	}

	@Test
	public void alCambiarLaCargaAMenos300NoCambiaLaCarga() {
		Vagon vagon = new Vagon(3, 1000);

		vagon.cambiarCarga(-300);

		Assert.assertEquals(0, vagon.obtenerCarga());
	}

	@Test
	public void alCambiarLaCargaSiEsMayorQueLaCapacidadNoCambiaLaCarga() {
		Vagon vagon = new Vagon(3, 1000);

		vagon.cambiarCarga(1001);

		Assert.assertEquals(0, vagon.obtenerCarga());
	}

}
