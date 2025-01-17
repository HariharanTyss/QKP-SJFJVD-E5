package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser-Edge
		WebDriverManager.edgedriver().setup();

		// Step1:Launch The Browser-Edge
		WebDriver driver = new EdgeDriver();

		// Customize the Browser-Size and Position
		driver.manage().window().setSize(new Dimension(1000, 800));
		driver.manage().window().setPosition(new Point(100, 100));

		// Step2:Navigate To The Application Via URL
		driver.get("https://www.maccosmetics.in/products/13854/products/makeup/lips/lipstick");

		// Verify The Lipstick_Page Using Title
		String exptitle = "Lipstick Makeup | M∙A∙C Cosmetics – Official Site";
		String acttitle = driver.getTitle();
		if (exptitle.equals(acttitle)) {
			System.out.println("Title Verified:---pass");
			System.out.println("Actual Title is : " + acttitle);
		} else {
			System.out.println("Title Verified:---Fail");

		}

		Thread.sleep(5000);
		// Step3:Identify The Element
		WebElement addtobagbutton = driver.findElement(By.xpath("(//button[contains(@title,'Add To Bag')])[4]"));

		// Step4:Validate The Element
		boolean result1 = addtobagbutton.isDisplayed();
		boolean result2 = addtobagbutton.isEnabled();

		// Provide Validate Message For Test Log
		if (result1) {
			System.out.println("Element Verified: It  is displayed");
		} else {
			System.out.println("Element Verified: It  is not displayed");
		}

		// Provide Validate Message For Test Log
		if (result2) {
			System.out.println("Element Verified: It  is Enabled");
		} else {
			System.out.println("Element Verified: It  is not Enabled");
		}

		// Step5:Close the Browser
		driver.close();

	}

}
