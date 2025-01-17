package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformAction1 {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser-Edge
		WebDriverManager.edgedriver().setup();

		// Step1:Launch The Browser-Edge
		WebDriver driver = new EdgeDriver();

		// Customize the Browser-Size and Position
		driver.manage().window().setSize(new Dimension(1000, 800));
		driver.manage().window().setPosition(new Point(100, 100));

		// Step2:Navigate To The Application Via URL
		driver.get("https://www.zomato.com/");

		// Step3:Find The "Search TextField" And Store it
		WebElement searchTextField = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));

		// Validate
		boolean result1 = searchTextField.isDisplayed();
		boolean result2 = searchTextField.isEnabled();

		// Provide Execution Log
		if (result2 && result1) {
			System.out.println("Element Verified: 1.Its Is Displayed");
			System.out.println("Element Verified: 2.Its Is Enabled");
		} else {
			System.out.println("Element Verified: 1.Its Is  Not Displayed");
			System.out.println("Element Verified: 2.Its Is Not  Enabled");
		}
		// Perform Action-Enter The Data
		searchTextField.sendKeys("ChickenBriyani");
		Thread.sleep(5000);
		// Perform Action-Clear The Data
		searchTextField.clear();
		Thread.sleep(5000);

		// Perform Action-Enter The Data
		searchTextField.sendKeys("Mutton Briyani");
		Thread.sleep(5000);
		// Perform Action-Clear The Data
		searchTextField.clear();
		Thread.sleep(5000);

		// Perform Action-Enter The Data
		searchTextField.sendKeys("Shawarma");
		Thread.sleep(5000);
		// Perform Action-Clear The Data
		searchTextField.clear();
		Thread.sleep(5000);

		// Close The Browser
		driver.quit();

		// Execution Completed log
		System.out.println("Test Completed");
	}

}
