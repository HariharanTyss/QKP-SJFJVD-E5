package LearningTestRetry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver staticdriver;

	@BeforeMethod
	public void configure() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");

	}

}
