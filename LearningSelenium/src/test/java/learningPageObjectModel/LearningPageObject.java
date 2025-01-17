package learningPageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningPageObject {

	@Test

	public void m1() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// Declaration
		WebElement searchBox;

		// Initilaization
		searchBox = driver.findElement(By.name("q"));

		// Utilization
		searchBox.sendKeys("Selenium");

		searchBox.clear();

		driver.navigate().refresh();

		// Initilaization
		searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("Java");

		searchBox.clear();

		driver.navigate().refresh();

		

	}
}
