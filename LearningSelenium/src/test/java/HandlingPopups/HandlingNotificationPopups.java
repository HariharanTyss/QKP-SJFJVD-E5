package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNotificationPopups {

	public static void main(String[] args) {

		// Configure The Browser
		WebDriverManager.chromedriver().setup();

		// Customize The Browser Settings
		ChromeOptions optionobj = new ChromeOptions();
		optionobj.addArguments("--disable-notifications");

		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Navigate To The Application
		driver.get("https://www.easemytrip.com/");

	}

}
