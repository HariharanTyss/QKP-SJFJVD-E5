package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To The Application Via URL
		driver.get("https://www.instagram.com/");

		// Fetch the Parent ID
		String parentID = driver.getWindowHandle();
		// Print on the Console
		System.out.println(parentID);


	}

}
