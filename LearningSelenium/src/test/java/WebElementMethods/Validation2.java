package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation2 {

	public static void main(String[] args) {

		// Configure the Browser-Edge
		WebDriverManager.edgedriver().setup();

		// Step1:Launch The Browser-Edge
		WebDriver driver = new EdgeDriver();

		// Customize the Browser-Size and Position
		driver.manage().window().setSize(new Dimension(1000, 800));
		driver.manage().window().setPosition(new Point(100, 100));

		// Step2:Navigate To The Application Via URL
		driver.get("https://www.facebook.com/");

		// Step3;Identify The "Create New Account " Button
		WebElement createnewaccountbutton = driver.findElement(By.xpath("//a[contains(text(),'Create new')]"));

		// Step3.1: Perform Action-Click
		createnewaccountbutton.click();

		// Step4:Identify The "Male" Radio Button
		WebElement maleradiobutton = driver.findElement(By.xpath("//label[contains(text(),'Male')]/child::input"));

		// Step4.1:Perform Action -Click
		maleradiobutton.click();

		// Step5: Validate the Element Is Selected Or Not
		boolean result = maleradiobutton.isSelected();

		// Provide The Test Log
		if (result) {
			System.out.println("Element Verified: Its  Selected");
		} else {
			System.out.println("Element Verified: Its Not   Selected");

		}
		// Close The Browser
		driver.quit();

	}

}
