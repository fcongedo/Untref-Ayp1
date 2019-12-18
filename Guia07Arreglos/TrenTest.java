
import org.junit.Assert;
import org.junit.Test;

public class TrenTest {

	@Test
	public void testAlCrearCodigoPepitoSeCreaConCodigoPepito() {
		int[] capacidadesDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("pepito", capacidadesDeCarga);

		Assert.assertEquals("se espera que se obtenga codigo pepito", "pepito",
				tren.obtenerCódigo());

	}

	@Test(expected = Error.class)
	public void testeoAlCrearCodigoVacioDaError() {
		int[] capacidadesDeCarga = { 100, 200, 300 };
		Tren tren = new Tren("", capacidadesDeCarga);

	}

	@Test
	public void testAlcrearUnTrenCon3CapacidadesDeCargaSeCreaUnTrenConTresVagones() {
		int[] capacidadesDeCarga = { 200, 300, 400 };
		Tren tren = new Tren("pepito", capacidadesDeCarga);

		Assert.assertEquals(200, tren.obtenerVagon(1).obtenerCapacidadDeCarga());
		Assert.assertEquals(300, tren.obtenerVagon(2).obtenerCapacidadDeCarga());
		Assert.assertEquals(400, tren.obtenerVagon(3).obtenerCapacidadDeCarga());
	}

	@Test(expected = Error.class)
	public void testAlObtenerCapacidadDeCargaDeUnTrenInexistenteDaError() {
		int[] capacidadesDeCarga = { 100, 150, 200 };
		Tren tren = new Tren("pepito", capacidadesDeCarga);

		tren.obtenerVagon(5);

	}

	@Test
	public void testAlCargar100EnTresVagonesObtengoCartaTotalIgual300() {
		int[] capacidadesDeCarga = { 200, 200, 200 };
		Tren tren = new Tren("pepito", capacidadesDeCarga);

		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(100);
		tren.obtenerVagon(3).cambiarCarga(100);

		Assert.assertEquals(300, tren.obtenerCargaTotal());
	}

	@Test
	public void testAlCargar50EntreCuatroVagonesObtengoCargaTotalIgual200() {
		int[] capacidadesDeCarga = { 100, 100, 100, 100 };
		Tren tren = new Tren("pepito", capacidadesDeCarga);

		tren.obtenerVagon(1).cambiarCarga(50);
		tren.obtenerVagon(2).cambiarCarga(50);
		tren.obtenerVagon(3).cambiarCarga(50);
		tren.obtenerVagon(4).cambiarCarga(50);

		Assert.assertEquals(200, tren.obtenerCargaTotal());
	}

	@Test
	public void conTresVagonesCargadosConCienDoscientosYCuatrocientosVagonesPorEncimaDelPromedioEsUno() {
		int[] capacidadesDeCarga = {100, 200, 400};
		Tren tren = new Tren("pepito", capacidadesDeCarga);
		
		tren.obtenerVagon(1).cambiarCarga(100);
		tren.obtenerVagon(2).cambiarCarga(200);
		tren.obtenerVagon(3).cambiarCarga(400);
		
		Assert.assertEquals("se espera que de 1",1,tren.contarVagonesConCargaSuperiorAlPromedio());
	}

}
