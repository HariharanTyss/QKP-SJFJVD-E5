package HandlingDisabledElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDisAbledElements_UsingJScode {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To URL
		driver.get("https://demoapp.skillrary.com/");

		// Identify the Dis-Abled Element
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));

		// Verify the Element
		boolean result = element.isEnabled();

		// Provide the log
		if (result) {
			System.out.println("Element Verified:It Is Enabled");
		} else {
			System.out.println("Element Verified:It Is  Not Enabled");

		}

		// Perform Action USing Sendkeys
		// element.sendKeys("Learning Selenium");

//------------------------------------------------------------------------------------
		// Steps To Perform Action On the Disabled Element-->By Using Js Code

		// 1.Perform Typecating
		JavascriptExecutor jsobj = (JavascriptExecutor) driver;

		// Call The Method To Execute The Js Code
		jsobj.executeScript("arguments[0].value='Learning Selenium'", element);

		Thread.sleep(5000);

		// Close the Browser
		driver.quit();
	}

}
