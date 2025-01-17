package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To URL
		driver.get("https://www.shoppersstack.com/");

		// Identify the element
		WebElement element = driver.findElement(By.xpath("//button[@id='loginBtn']"));

		// Perform Action
		element.click();

		Thread.sleep(2000);
		// Step10:Close the Browser
		driver.close();

		// Execution log
		System.out.println("Execution Completed");

	}

}
