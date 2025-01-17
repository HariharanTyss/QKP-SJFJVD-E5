package WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningGetWindowHandles {

	public static void main(String[] args) 
	{
		
		
		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To The Application Via URL
		driver.get("https://www.instagram.com/");

		// Fetch the Parent ID
		 Set<String> parentID = driver.getWindowHandles();

		// Print on the Console
		System.out.println(parentID);

	}

}
