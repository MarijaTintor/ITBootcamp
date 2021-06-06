package youtube;

import org.openqa.selenium.WebDriver;

public class Youtube {

	public static final String URL = "https://www.youtube.com/";

	public static void open(WebDriver driver) {
		driver.get(URL);
	}

}
