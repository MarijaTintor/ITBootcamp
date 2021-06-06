package youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchYoutube {

	public static final String SEARCH_TXPATH = "//*[@id=\"search\"]";
	public static final String CONFIRM_SEARCH_TXPATH = "//*[@id=\"search-icon-legacy\"]";
	public static final String VIDEO = "//*[@id=\"video-title\"]/yt-formatted-string";

	public static void clikSearch(WebDriver driver) {
		WebElement search = driver.findElement(By.xpath(SEARCH_TXPATH));
		driver.manage().window().maximize();
		search.click();
	}

	public static void enterData(WebDriver driver) {
		WebElement search = driver.findElement(By.xpath(SEARCH_TXPATH));
		search.sendKeys("never gonna give you up");
	}

	public static void clickSearchButton(WebDriver driver) {
		WebElement searchButton = driver.findElement(By.xpath(CONFIRM_SEARCH_TXPATH));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searchButton.click();
	}

	public static void clickOnVideo(WebDriver driver) {
		WebElement video = driver.findElement(By.xpath(VIDEO));
		video.click();
	}

	public static void findSongsFromTable(WebDriver driver, String song) {
		WebElement search = driver.findElement(By.xpath(SEARCH_TXPATH));

		search.sendKeys(song);
		search.sendKeys(Keys.ENTER);
	}
}
