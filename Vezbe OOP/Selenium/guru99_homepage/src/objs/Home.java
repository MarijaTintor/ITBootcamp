package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	public static final String URL = "http://demo.guru99.com/test/newtours/";

	public static void clickRegBtn(WebDriver driver) {
		driver.findElement(By.linkText("REGISTER")).click();

	}

}
