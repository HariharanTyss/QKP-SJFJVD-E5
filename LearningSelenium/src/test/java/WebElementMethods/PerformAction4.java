package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformAction4 {

	public static void main(String[] args) {

		// Configure the Browser-Edge
		WebDriverManager.edgedriver().setup();

		// Step1:Launch The Browser-Edge
		WebDriver driver = new EdgeDriver();

		// Customize the Browser-Size and Position
		driver.manage().window().setSize(new Dimension(1000, 800));
		driver.manage().window().setPosition(new Point(100, 100));

		// Step2:Navigate To The Application Via URL
		driver.get("https://demowebshop.tricentis.com/register");

		// Identify teh Element
		WebElement ResigesterButton = driver.findElement(By.id("register-button"));

		// Perform Action -Submit
		ResigesterButton.submit();
	}

}
