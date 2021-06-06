package banka;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAccount {

	@Test
	public void testKonstruktor() {
		Account ac = new Account("Tijana", "123456-789");

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(ac.getName(), "Tijana");
		sa.assertEquals(ac.getNumber(), "123456-789");
		sa.assertEquals(ac.getAmount(), 0d);

		sa.assertAll();
	}

	@Test
	public void testSeter() {
		String ime = "Tijana";
		String brojRacuna = "123";
		double stanje = 0;
		double stanje1 = 1000;

		Account ac = new Account(ime, brojRacuna);
		SoftAssert sa = new SoftAssert();

		sa.assertEquals(ac.getName(), ime);
		sa.assertEquals(ac.getNumber(), brojRacuna);
		sa.assertEquals(ac.getAmount(), stanje);

		ac.setAmount(stanje1);
		sa.assertEquals(ac.getAmount(), stanje1);

		sa.assertAll();
	}

	@Test
	public void testIspravanFormatIspisa() {
		Account ac = new Account("Tijana", "779");

		String ocekivani = String.format("%s\t%s\t%.2f", ac.getNumber(), ac.getName(), ac.getAmount());

		Assert.assertEquals(ac.toString(), ocekivani);
	}

	@Test
	public void testHiljaduNaloga() {
		int max = 50;
		Account[] racuni = new Account[50];
		for (int i = 0; i < max; i++) {
			racuni[i] = new Account("Tijana" + i);
		}

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < i; j++) {
				Assert.assertNotEquals(racuni[i].getNumber(), racuni[j].getNumber());
			}
		}

		// j = i , j < max, j++

	}
}
