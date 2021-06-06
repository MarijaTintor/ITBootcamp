package test;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import youtube.SearchYoutube;
import youtube.Youtube;

public class TestSearch {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void searchSong() {
		Youtube.open(driver);
		SearchYoutube.clikSearch(driver);
		SearchYoutube.enterData(driver);
		SearchYoutube.clickSearchButton(driver);
		SearchYoutube.clickOnVideo(driver);

		String expectedUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@Test
	public void searchSongsFromExcel() {
		File f = new File("data.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			for (int i = 0; i < 2; i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);

				String song = c0.toString();

				driver.navigate().to(Youtube.URL);
				SearchYoutube.clikSearch(driver);
				SearchYoutube.findSongsFromTable(driver, song);
				SearchYoutube.clickOnVideo(driver);
				String actualUrl = driver.getCurrentUrl();
				String expectedUrl = "https://www.youtube.com/watch?v=8gyY5Aza8DE";

				Assert.assertEquals(actualUrl, expectedUrl);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
