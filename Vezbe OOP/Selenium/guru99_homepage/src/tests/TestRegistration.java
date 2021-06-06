package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objs.Home;
import objs.Registration;
import resources.Constants;

public class TestRegistration {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}

	@Test
	public void testRegBtn() {
		driver.navigate().to(Constants.HOME_URL);
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}

	@Test
	public void testRegForm() {
		File f = new File("data.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();

			for (int i = 0; i < 3; i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				Cell c1 = row.getCell(1);
				Cell c2 = row.getCell(2);

				String username = c0.toString();
				String password = c1.toString();
				String cPassword = c2.toString();

				driver.navigate().to(Constants.URL);
				Registration.inputUsername(driver, username);
				Registration.inputPassword(driver, password);
				Registration.inputConfirmPassword(driver, cPassword);
				Registration.submit(driver);

				String currentUrl = driver.getCurrentUrl();
				String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";

				sa.assertEquals(currentUrl, expectedUrl, username + " " + i);

				/*
				 * Cell cell = row.createCell(3); if (currentUrl.equals(expectedUrl)) {
				 * cell.setCellValue("OK"); OutputStream os = new FileOutputStream("data.xlsx");
				 * wb.write(os); } else { cell.setCellValue("KO"); OutputStream os = new
				 * FileOutputStream("data.xlsx"); wb.write(os); }
				 */

			}

			sa.assertAll();
			wb.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
