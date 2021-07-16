

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {

	@Test
	public void test() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(5, 2);

		Assert.assertEquals(7,
				a.obtenerCantidadTotalDePersonasQueOcupanLasHabitaciones());
	}

	@Test
	public void test2() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(5, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(4, 4);
		a.OcuparHabitacionCon(1, 5);

		Assert.assertEquals(2,
				a.ContarHabitacionesConMayoresPasadoPorParametro(4));
	}

	@Test
	public void test3() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(5, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(4, 4);
		a.OcuparHabitacionCon(1, 5);

		Assert.assertEquals(1,
				a.ContarHabitacionesConMayoresPasadoPorParametro(1));
	}

	@Test
	public void test4() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(4, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(4, 4);
		a.OcuparHabitacionCon(4, 1);

		Assert.assertEquals(4,
				a.ContarHabitacionesConMayoresPasadoPorParametro(4));
	}

	@Test(expected = Error.class)
	public void test5() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(4, 5);
	}
	@Test
	public void test6() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(5, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(3, 4);
		a.OcuparHabitacionCon(1, 5);
		a.OcuparHabitacionCon(5, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(2, 4);
		a.OcuparHabitacionCon(7, 1);
		

		Assert.assertEquals(1,
				a.ContarHabitacionesConMayoresPasadoPorParametro(7));
	}
	@Test
	public void test7() {
		Hotel a = new Hotel(10);
		a.OcuparHabitacionCon(5, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(3, 4);
		a.OcuparHabitacionCon(1, 5);
		a.OcuparHabitacionCon(5, 2);
		a.OcuparHabitacionCon(4, 1);
		a.OcuparHabitacionCon(2, 4);
		a.OcuparHabitacionCon(7, 1);
		

		Assert.assertEquals(51,
				a.obtenerCantidadTotalDePersonasQueOcupanLasHabitaciones());
		
	}
}
