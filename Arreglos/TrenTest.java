import org.junit.Assert;
import org.junit.Test;

public class TrenTest {

	@Test
	public void AlCrearTrenConCodigoPepeSeCreaConCodigoPepe() {
		int[] capacidadDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("pepe", capacidadDeCarga);
		Assert.assertEquals("pepe", tren.obtenerCodigo());

	}

	@Test(expected = Error.class)
	public void AlCrearTrenConCodigoVacioDaError() {
		int[] capacidadDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("", capacidadDeCarga);

	}

	@Test
	public void alCrearUntrenConTresCapacidadesDeCargaSeCreaUnTrenCoTresVagones() {
		int[] capacidadesDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("pepe", capacidadesDeCarga);

		Assert.assertEquals(100, tren.obtenerVagon(1).obtenerCapacidadDeCarga());
		Assert.assertEquals(200, tren.obtenerVagon(2).obtenerCapacidadDeCarga());
		Assert.assertEquals(300, tren.obtenerVagon(3).obtenerCapacidadDeCarga());

	}

	@Test(expected = Error.class)
	public void alObtenerCapacidadDeCargaDeUnVagonInexistenteDaError() {
		int[] capacidadesDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("manhattan", capacidadesDeCarga);

		tren.obtenerVagon(5);
	}

	@Test
	public void alCargar100EnTresVagonesLaCargaTotalEs300() {
		int[] capacidadesDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("pepe", capacidadesDeCarga);
		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(100);
		tren.obtenerVagon(3).cambiarCarga(100);
		Assert.assertEquals(300, tren.obtenerCargaTotal());
	}

	@Test
	public void alCargar50EnTresVagonesLaCargaTotalEs150() {
		int[] capacidadesDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("pepe", capacidadesDeCarga);
		tren.obtenerVagon(1).cambiarCarga(50);
		tren.obtenerVagon(2).cambiarCarga(50);
		tren.obtenerVagon(3).cambiarCarga(50);
		Assert.assertEquals(150, tren.obtenerCargaTotal());

	}

	@Test
	public void conTresVagonesCargadosConCienDoscientosYCuatrocientosVagonesPorEncimaDelPromedioEsUno() {
		int[] capacidadesDeCarga = { 100, 200, 400 };
		Tren tren = new Tren("manhattan", capacidadesDeCarga);

		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(200);
		tren.obtenerVagon(3).cambiarCarga(400);

		Assert.assertEquals(1, tren.contarVagonesConCargaSuperiorAlPromedio());
	}

	@Test
	public void conTresVagonesCargadosConCienTrescientosCuatrocientosSetecientosYMilVagonesPorEncimaDelPromedioSonDos() {
		int[] capacidadesDeCarga = { 100, 300, 400, 700, 1000 };
		Tren tren = new Tren("manhattan", capacidadesDeCarga);

		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(300);
		tren.obtenerVagon(3).cambiarCarga(400);
		tren.obtenerVagon(1).cambiarCarga(700);
		tren.obtenerVagon(2).cambiarCarga(1000);

		Assert.assertEquals(2, tren.contarVagonesConCargaSuperiorAlPromedio());
	}
}
