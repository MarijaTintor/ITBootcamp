package domaciTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

	@Test
	public void testPovrsinaKruga() {
		double pKruga = Calc.pKruga(5);
		Assert.assertEquals(pKruga, 78.5);
	}

	@Test
	public void testPovrsinaKvadrata() {
		double pKvadrata = Calc.pKvadrata(5);
		Assert.assertEquals(pKvadrata, 25.0);
	}

	@Test
	public void testPovrsinaPravougaonika() {
		double pPravougaonika = Calc.pPravougaonika(5, 4);
		System.out.println(pPravougaonika);
		Assert.assertEquals(pPravougaonika, 20.0);
	}
}
