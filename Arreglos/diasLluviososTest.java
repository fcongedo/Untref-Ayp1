
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class diasLluviososTest {

	private diasLluviosos diasLluviosos;

	@Before
	public void seCreaElObjetoDiasLluviosos() {
		this.diasLluviosos = new diasLluviosos();
	}

	@Test
	public void alCrearElObjetoDiasLluviososNoLlovioElPrimerDiaDelAno() {
		boolean llovioEsteDia = this.diasLluviosos.consultarSiLlovioElDia(1);

		Assert.assertFalse(llovioEsteDia);
	}

	@Test
	public void alCrearElObjetoDiasLluviososNoLlovioNunca() {
		for (int dia = 1; dia < 366; dia++) {
			Assert.assertFalse(this.diasLluviosos.consultarSiLlovioElDia(dia));
		}
	}

	@Test(expected = Error.class)
	public void alConsultarSiLlovioElDia0DevuelveError() {
		this.diasLluviosos.consultarSiLlovioElDia(0);
	}

	@Test(expected = Error.class)
	public void alConsultarSiLlovioElDia366DevuelveError() {
		this.diasLluviosos.consultarSiLlovioElDia(366);
	}

	@Test
	public void alRegistrarQueLlovioElPrimerDiaDelAnoEseDiaLlovio() {
		this.diasLluviosos.registrarQueLlovioElDia(1, true);

		boolean llovioEsteDia = this.diasLluviosos.consultarSiLlovioElDia(1);

		Assert.assertTrue(llovioEsteDia);
	}

	@Test(expected = Error.class)
	public void alRegistrarQueLlovioElDia0DaError() {
		this.diasLluviosos.registrarQueLlovioElDia(0, true);
	}

	@Test(expected = Error.class)
	public void alRegistrarQueLlovioElDia366DaError() {
		this.diasLluviosos.registrarQueLlovioElDia(366, true);
	}

	@Test
	public void alRegistrarQueLlovioDosDiasLlovioDosDias() {
		this.diasLluviosos.registrarQueLlovioElDia(1, true);
		this.diasLluviosos.registrarQueLlovioElDia(2, true);

		Assert.assertEquals(2, this.diasLluviosos.contarDiasLluviosos());
	}

	@Test
	public void alRegistrarQueLlovioDosDiasLlovioTresDias() {
		this.diasLluviosos.registrarQueLlovioElDia(1, true);
		this.diasLluviosos.registrarQueLlovioElDia(2, true);
		this.diasLluviosos.registrarQueLlovioElDia(200, true);

		Assert.assertEquals(3, this.diasLluviosos.contarDiasLluviosos());
	}

	@Test
	public void alRegistrarQueLlovioLosDiasUnoTresYCienElPrimerDiaConLluviaEsElUno() {
		this.diasLluviosos.registrarQueLlovioElDia(1, true);
		this.diasLluviosos.registrarQueLlovioElDia(3, true);
		this.diasLluviosos.registrarQueLlovioElDia(100, true);

		Assert.assertEquals(1, this.diasLluviosos.consultarPrimerDiaConLluvia());
	}

	@Test
	public void alRegistrarQueLlovioLosDiasCincoTresYCienElPrimerDiaConLluviaEsElTres() {
		this.diasLluviosos.registrarQueLlovioElDia(5, true);
		this.diasLluviosos.registrarQueLlovioElDia(3, true);
		this.diasLluviosos.registrarQueLlovioElDia(100, true);

		Assert.assertEquals(3, this.diasLluviosos.consultarPrimerDiaConLluvia());
	}

	@Test
	public void siNoLlovioNuncaElPrimerDiaConLluviaEsCero() {
		Assert.assertEquals(0, this.diasLluviosos.consultarPrimerDiaConLluvia());
	}

	@Test
	public void siLlovioLosDiasUnoDosYTresElPrimerCuatrimestreEsElMasLluvioso() {
		this.diasLluviosos.registrarQueLlovioElDia(1, true);
		this.diasLluviosos.registrarQueLlovioElDia(2, true);
		this.diasLluviosos.registrarQueLlovioElDia(3, true);

		int cuatrimestreMasLluvioso = this.diasLluviosos
				.consultarCuatrimestreMasLluvioso();

		Assert.assertEquals(1, cuatrimestreMasLluvioso);
	}

	@Test
	public void siLlovioLosDias130Y140ElSegundoCuatrimestreEsElMasLluvioso() {
		this.diasLluviosos.registrarQueLlovioElDia(130, true);
		this.diasLluviosos.registrarQueLlovioElDia(140, true);

		int cuatrimestreMasLluvioso = this.diasLluviosos
				.consultarCuatrimestreMasLluvioso();

		Assert.assertEquals(2, cuatrimestreMasLluvioso);
	}

	@Test
	public void siNuncaLlovioElCuatrimestreCeroEsElMasLluvioso() {
		int cuatrimestreMasLluvioso = this.diasLluviosos
				.consultarCuatrimestreMasLluvioso();

		Assert.assertEquals(0, cuatrimestreMasLluvioso);
	}

	@Test
	public void siLlovioLosDias244Y365ElTercerCuatrimestreEsElMasLluvioso() {
		this.diasLluviosos.registrarQueLlovioElDia(244, true);
		this.diasLluviosos.registrarQueLlovioElDia(365, true);

		int cuatrimestreMasLluvioso = this.diasLluviosos
				.consultarCuatrimestreMasLluvioso();

		Assert.assertEquals(3, cuatrimestreMasLluvioso);
	}

	@Test
	public void siLlovioElDia365ElTercerCuatrimestreEsElMasLluvioso() {
		this.diasLluviosos.registrarQueLlovioElDia(365, true);

		int cuatrimestreMasLluvioso = this.diasLluviosos
				.consultarCuatrimestreMasLluvioso();

		Assert.assertEquals(3, cuatrimestreMasLluvioso);
	}

}