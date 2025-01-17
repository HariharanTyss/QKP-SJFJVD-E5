package HandlingScrollingAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollAction_UsingJScode {

	public static void main(String[] args) throws InterruptedException {
		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To URL
		driver.get("https://www.selenium.dev/");

		// Steps To Perform Scroll Action--------------->

		// 1.Perform Typecating
		JavascriptExecutor jsobj = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		// 2.Call the method to execute the Js code----To perform Scrollling
		jsobj.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);

		// 2.Call the method to execute the Js code
		jsobj.executeScript("window.scrollBy(0,300)");

		// 2.Call the method to execute the Js code
		jsobj.executeScript("window.scrollBy(0,300)");

		// 2.Call the method to execute the Js code
		jsobj.executeScript("window.scrollBy(0,300)");

		// 2.Call the method to execute the Js code
		jsobj.executeScript("window.scrollBy(0,300)");

		// 2.Call the method to execute the Js code
		jsobj.executeScript("window.scrollBy(0,300)");

		// 2.Call the method to execute the Js code
		jsobj.executeScript("window.scrollBy(0,300)");

		Thread.sleep(4000);
		// Step3:Close the Browser
		driver.close();

		// Execution log
		System.out.println("Execution Completed");

	}

}
