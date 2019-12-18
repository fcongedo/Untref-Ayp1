import org.junit.Assert;
import org.junit.Test;

public class diasLluviososTest {

	@Test
	public void alCrearElObjetoDiasLluviososNoLlovioElPrimerDiaDelAño() {
		diasLluviosos a = new diasLluviosos();
		boolean llovioEsteDia = a.consultarSiLlovioElDia(1);

		Assert.assertFalse(llovioEsteDia);
	}

	@Test(expected = Error.class)
	public void prueboAlconsultarDiaQueLlovioFueraDeRangoDaErrorCero() {
		diasLluviosos a = new diasLluviosos();
		boolean noLlovioEsteDia = a.consultarSiLlovioElDia(0);

		Assert.assertFalse(noLlovioEsteDia);
	}

	@Test(expected = Error.class)
	public void prueboAlconsultarDiaQueLlovioFueraDeRangoDaErrorNegativo() {
		diasLluviosos a = new diasLluviosos();

		Assert.assertFalse(a.consultarSiLlovioElDia(-1));

	}

	@Test(expected = Error.class)
	public void prueboAlconsultarDiaQueLlovioFueraDeRangoDaErrorPositivoMayorA365() {
		diasLluviosos a = new diasLluviosos();

		Assert.assertFalse(a.consultarSiLlovioElDia(366));
	}

	@Test(expected = Error.class)
	public void prueboAlRegistrarQueLlovioDiaFueraDeRangoDaErrorCero() {
		diasLluviosos a = new diasLluviosos();

		a.registrarQueLlovioElDia(0, true);

		Assert.assertFalse(a.consultarSiLlovioElDia(0));
	}

	@Test(expected = Error.class)
	public void alRegistrarQueLlovioElDia0DaError() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(0, true);
	}

	@Test(expected = Error.class)
	public void alRegistrarQueLlovioElDia366DaError() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(366, true);
	}

	@Test
	public void prueboAlRegistrarQueLlovioDiaUnoDevuelveUno() {
		diasLluviosos a = new diasLluviosos();

		a.registrarQueLlovioElDia(1, true);

		Assert.assertTrue(a.consultarSiLlovioElDia(1));
	}

	@Test
	public void prueboQueSiNuncaLlovioElPrimerDiaConLluviaEsCero() {
		diasLluviosos a = new diasLluviosos();

		Assert.assertEquals(0, a.consultarPrimerDiaConLluvia());
	}

	@Test
	public void prueboQueAlRegistrarQueLlovioDosDiasDevuelve2Dias() {
		diasLluviosos a = new diasLluviosos();

		a.registrarQueLlovioElDia(1, true);
		a.registrarQueLlovioElDia(2, true);

		Assert.assertEquals(2, a.contarDiasLluviosos());
	}

	@Test
	public void prueboQueAlRegistrarQueLlovioTresDiasDevuelveTresDias() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(1, true);
		a.registrarQueLlovioElDia(100, true);
		a.registrarQueLlovioElDia(365, true);

		Assert.assertEquals(3, a.contarDiasLluviosos());
	}

	@Test
	public void prueboQueAlRegistrarTresDiasDevuelvePrimerDiaConLLuvia() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(1, true);
		a.registrarQueLlovioElDia(100, true);
		a.registrarQueLlovioElDia(365, true);

		Assert.assertEquals(1, a.consultarPrimerDiaConLluvia());

	}

	@Test
	public void prueboQueAlRegistrarUnDiaConlLuviaDevuelvePrimerDiaConLluvia() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(100, true);

		Assert.assertEquals(100, a.consultarPrimerDiaConLluvia());
	}

	@Test
	public void PrueboQueAlRegistrarQueLlovioLosDiasCincoTresYCienElPrimerDiaConLluviaEsElTres() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(5, true);
		a.registrarQueLlovioElDia(3, true);
		a.registrarQueLlovioElDia(100, true);

		Assert.assertEquals(3, a.consultarPrimerDiaConLluvia());
	}

	@Test
	public void PrueboQueAlRegistrarQueLlovioLosDiasCincoTresYCienDevuelvePrimerCuatrimestreComoElMasLluvioso() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(5, true);
		a.registrarQueLlovioElDia(3, true);
		a.registrarQueLlovioElDia(100, true);

		Assert.assertEquals(3, a.consultarCuatrimestreMasLluvioso());

	}

	@Test
	public void PrueboQueAlRegistrarQueLlovioLosDias122y150y160DevuelvePrimerCuatrimestreComoElMasLluvioso() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(122, true);
		a.registrarQueLlovioElDia(150, true);
		a.registrarQueLlovioElDia(160, true);

		Assert.assertEquals(2, a.consultarCuatrimestreMasLluvioso());

	}

	@Test
	public void PrueboQueAlRegistrarQueLlovioLosDias350y300y365DevuelvePrimerCuatrimestreComoElMasLluvioso() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(350, true);
		a.registrarQueLlovioElDia(300, true);
		a.registrarQueLlovioElDia(365, true);

		Assert.assertEquals(3, a.consultarCuatrimestreMasLluvioso());

	}

	@Test
	public void PrueboQueAlRegistrarQueLlovioLosDias100y300y365DevuelvePrimerCuatrimestreComoElMasLluvioso() {
		diasLluviosos a = new diasLluviosos();
		a.registrarQueLlovioElDia(100, true);
		a.registrarQueLlovioElDia(300, true);
		a.registrarQueLlovioElDia(365, true);

		Assert.assertEquals(3, a.consultarCuatrimestreMasLluvioso());
	}
}
