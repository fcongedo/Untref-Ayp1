import org.junit.Assert;
import org.junit.Test;

public class TarjetaBajaTest {

	/*
	 * PrecioViajeColectivo = 1.25 PrecioViajeSubte = 2.50
	 */

	@Test(expected = Error.class)
	public void prueboSaldoInicialCeroDaError() {
		new TarjetaBaja(0);
	}

	@Test(expected = Error.class)
	public void prueboSaldoInicialNegativoDaError() {
		new TarjetaBaja(-100);
	}

	@Test(expected = Error.class)
	public void prueboMetodoCargarValorMontoCeroDaError() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(100);
		// Operacion
		tarj.cargar(0);
	}

	@Test(expected = Error.class)
	public void prueboMetodoCargarValorMontoNegativoDaError() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(100);
		// Operacion
		tarj.cargar(-10);

	}

	@Test(expected = Error.class)
	public void PrueboErrorSaldoInsuficienteParaViajeEnColectivo() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(1.00);
		// Operacion
		tarj.pagarViajeEnColectivo();
	}

	@Test(expected = Error.class)
	public void PrueboErrorSaldoInsuficienteParaViajeEnSubte() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(2.00);
		// Operacion
		tarj.pagarViajeEnSubte();
	}

	@Test
	public void prueboCorrectoFuncionamientoObtenerSaldo() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(100);
		// Operacion
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("el saldo debe ser 100", 100, tarj.obtenerSaldo(),
				1);

	}

	@Test
	public void prueboCorrectoFuncionamientoCargarSaldo() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(100);
		// Operacion
		tarj.cargar(50);
		
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("el saldo debe ser 150", 150, tarj.obtenerSaldo(),
				1);
	}

	@Test
	public void prueboCorrectoFuncionamientoViajarColectivo() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(1.25);

		// Operacion
		tarj.pagarViajeEnColectivo();
		
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("El saldo debe ser cero", 0, tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 1 viaje en colectivo", 1,
				tarj.contarViajesEnColectivo());

	}

	@Test
	public void prueboCorrectoFuncionamientoViajarSubte() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(2.50);

		// Operacion
		tarj.pagarViajeEnSubte();
		
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("El saldo debe ser cero", 0, tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 1 viaje en Subte", 1,
				tarj.contarViajesEnSubte());
	}

	@Test
	public void prueboCorrectoFuncionamientoViajarColectivoYSubte() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(3.75);

		// Operacion
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnSubte();
		
		tarj.obtenerSaldo();
		

		// Validacion
		Assert.assertEquals("El saldo debe ser cero", 0, tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 1 viaje en colectivo", 1,
				tarj.contarViajesEnColectivo());
		Assert.assertEquals("debe contar 1 viaje en subte", 1,
				tarj.contarViajesEnSubte());
	}

	@Test
	public void prueboCorrectoFuncionamientoViajarColectivoTresViajes() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(5);

		// Operacion
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnColectivo();
		
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("El saldo debe ser 1.25,", 1.25,
				tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 3 viajes en colectivo", 3,
				tarj.contarViajesEnColectivo());
		Assert.assertEquals("debe contar 0 viajes en subte", 0,
				tarj.contarViajesEnSubte());

	}

	@Test
	public void prueboCorrectoFuncionamientoViajarColectivoTresSubte() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(10);

		// Operacion
		tarj.pagarViajeEnSubte();
		tarj.pagarViajeEnSubte();
		tarj.pagarViajeEnSubte();
		
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("El saldo debe ser 2.50,", 2.50,
				tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 3 viajes en subte", 3,
				tarj.contarViajesEnSubte());
		Assert.assertEquals("debe contar 0 viajes en colectivo", 0,
				tarj.contarViajesEnColectivo());
	}

	@Test
	public void prueboCorrectoFuncionamientoViajarColectivoTresSubteAndTresEnColectivo() {
		// Inicializacion
		TarjetaBaja tarj = new TarjetaBaja(15);

		// Operacion
		tarj.pagarViajeEnSubte();
		tarj.pagarViajeEnSubte();
		tarj.pagarViajeEnSubte();
		
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnColectivo();
		
		tarj.obtenerSaldo();

		// Validacion
		Assert.assertEquals("El saldo debe ser 3.75,", 3.75,
				tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 3 viajes en subte", 3,
				tarj.contarViajesEnSubte());
		Assert.assertEquals("debe contar 3 viajes en colectivo", 3,
				tarj.contarViajesEnColectivo());
	}

	@Test
	public void prueboContadorViajesTotales() {
		TarjetaBaja tarj = new TarjetaBaja(15);

		// Operacion
		tarj.pagarViajeEnSubte();
		tarj.pagarViajeEnSubte();
		tarj.pagarViajeEnSubte();
		
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnColectivo();
		tarj.pagarViajeEnColectivo();
		
		tarj.obtenerSaldo();
		// Validacion
		Assert.assertEquals("El saldo debe ser 3.75,", 3.75,
				tarj.obtenerSaldo(), 1);
		Assert.assertEquals("debe contar 3 viajes en subte", 3,
				tarj.contarViajesEnSubte());
		Assert.assertEquals("debe contar 3 viajes en colectivo", 3,
				tarj.contarViajesEnColectivo());
		Assert.assertEquals(
				"debe contar 6 viajes (3 en colectivo y 3 en subte", 6,
				tarj.contarViajes());

	}

}