package HandlingFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grooming {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// ChromeDriver driver = new ChromeDriver();

		WebDriver driver = new ChromeDriver();

		driver.get("https://pistahouse.in/");

	}

}
