package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath_Relative1 {

	public static void main(String[] args) throws InterruptedException {
		// Configure the Browser-chrome
		WebDriverManager.chromedriver().setup();

		// Step1:Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Browser
		driver.manage().window().maximize();

		// Step2:Navigate To The Application Via URL
		driver.get("file:///C:/Users/Harry/Downloads/webpage%20(2).html");

		String exptitle = "Learning Selenium";
		String acttitle = driver.getTitle();

		// Verify The WebPage
		if (exptitle.equalsIgnoreCase(acttitle))
			System.out.println("Title Verified-pass");
		else
			System.out.println("Title Verified-fail");

		// Step3:Identify the Element("NameTextField") location-Using RelativeXpath
		WebElement element1 = driver.findElement(By.xpath("//input[contains(@id,'me')]"));
		
		Thread.sleep(5000);
		// Step3.1:Perform Action On the Element-clear
		element1.clear();

		// Step4:Identify the Element ("Name Text")location-Using RelativeXpath
		WebElement element2 = driver.findElement(By.xpath("//label[contains(text(),'Na')]"));

		Thread.sleep(5000);
		// Step4.1:Perform Action On the Element
		element2.click();	
	}

}
