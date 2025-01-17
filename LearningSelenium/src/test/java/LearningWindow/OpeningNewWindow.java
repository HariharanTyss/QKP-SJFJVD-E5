package LearningWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningNewWindow {

	@Test
	public void m1() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.wexa.ai/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.wexa.ai/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.wexa.ai/");

	}
}
