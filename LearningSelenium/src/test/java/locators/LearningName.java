package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningName {

	public static void main(String[] args) throws InterruptedException
	{
		
		// Execution Log
		System.out.println("Test Execution Started");

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step1.1Maximize The Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application Via URL
		driver.get("file:///C:/Users/Harry/Downloads/webpage%20(2).html");

		// Step3:Identify the Element Using Id Locator And Store It
		WebElement element = driver.findElement(By.name("name"));

		// Step4:Perform Action Clear
		element.clear();

		Thread.sleep(3000);
		// Step4:Perform Action-Click /Sendkeys
		element.sendKeys("Harry");
		Thread.sleep(3000);

		// Step10:Close The Browser
		driver.quit();

		// Execution Log
		System.out.println("Test Execution Completed");

	}

}
