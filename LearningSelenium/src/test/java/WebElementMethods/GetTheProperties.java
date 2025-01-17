package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTheProperties {

	public static void main(String[] args) {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("https://www.selenium.dev/");

		// Identify The Element
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Selenium')]"));

		// Fetch The Text
		String text = element.getText();
		System.out.println("Text Is: " + text);

		// Fetch The Attribute Value
		String attribute = element.getAttribute("class");
		System.out.println("Attribute Value of Class:" + attribute);

		// Fetch The Css Property
		String cssvalue = element.getCssValue("color");
		System.out.println("Css Value Is:" + cssvalue);

		// Fetch The TagName
		String tagname = element.getTagName();
		System.out.println("TagName Is :" + tagname);

		// Fetch the Size
		Dimension size = element.getSize();
		System.out.println("Size of the Element (Width,Height):" + size);
		System.out.println("Width of the Element:" + size.getWidth());
		System.out.println("Height of the Element:" + element.getSize().getHeight());

		// Fetch the Location
		Point location = element.getLocation();
		System.out.println("location of the Element(X,Y):" + location);
		System.out.println("X co-ordinate of the Element:" + location.getX());
		System.out.println("Y co-ordinate of the Element:" + location.getY());

		// Fetch Using Rect
		Rectangle rectangle = element.getRect();
		Dimension size1 = rectangle.getDimension();
		Point location1 = rectangle.getPoint();
		int height1 = rectangle.getHeight();
		int width1 = rectangle.getWidth();
		int x1 = rectangle.getX();
		int y1 = rectangle.getY();

		// Step10:Close the Browser
		driver.close();

		// Execution log
		System.out.println("Execution Completed");

	}

}
