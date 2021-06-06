package banka;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBank {

	private Bank b;

	@BeforeClass
	public void initBank() {
		b = new Bank();
	}

	@BeforeMethod
	public void reset() {
		b.reset();
	}

	@Test
	public void testOpen() {
		int max = 5;
		for (int i = 0; i < max; i++) {
			Account ac = b.openAccount("Tijana");
			Assert.assertEquals(b.getAccount(ac.getNumber()), ac);
		}

	}

	@Test
	public void testPayIn() {

		double amount = 1000d;
		Account ac = b.openAccount("Tijana");
		ac.setAmount(300d);
		double amount1 = 1300d;

		b.payInMoney(ac.getNumber(), amount);

		Assert.assertEquals(ac.getAmount().doubleValue(), amount1);
		// Double amount1 = 1300d;
		// Assert.assertEquals(ac.getAmount(), amount1);

		/*
		 * Account account = new Account("Tijana", "123-456"); account.setAmount(0.0);
		 * ArrayList<Account> banka = new ArrayList<Account>(); banka.add(account);
		 * banka.get(0).setAmount(100.00); double iznos = banka.get(0).getAmount();
		 * 
		 * SoftAssert sc = new SoftAssert(); sc.assertEquals(iznos, 100.00);
		 */

	}

	@Test
	public void testTransfer() {

		Account ac1 = b.openAccount("Tijana");
		Account ac2 = b.openAccount("Jelena");

		b.payInMoney(ac1.getNumber(), 500d);
		b.transferMoney(ac1.getNumber(), ac2.getNumber(), 300d);
		SoftAssert sa = new SoftAssert();

		sa.assertEquals(ac1.getAmount(), 200d);
		sa.assertEquals(ac2.getAmount(), 300d);

		sa.assertAll();

	}

	@Test
	public void testSum() {
		int max = 5;
		for (int i = 0; i < 5; i++) {
			Account ac = b.openAccount("Tijana");
			ac.setAmount(1000d);
		}

		double acctualAmount = 5000d;
		double expectedAmount = b.getSumMoney();

		Assert.assertEquals(acctualAmount, expectedAmount);
	}
}
