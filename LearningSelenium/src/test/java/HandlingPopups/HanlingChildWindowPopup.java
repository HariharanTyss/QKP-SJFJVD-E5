package HandlingPopups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanlingChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step2:Navigate To The Application Via URL
		driver.get("https://www.shoppersstack.com/products_page/17");

		// Identify The Element and Click(Will GiveThe Child Window Popups)
		driver.findElement(By.id("compare")).click();

		// Fetch the Parent Id And print
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		// Fetch All the Child Window ID and Print
		Set<String> allwindowid = driver.getWindowHandles();
//---------------------------------------------------------------
		// Scenario1: Close Only The Specific Amazon Child-Window
		for (String window : allwindowid) {
			// 1.Switch The Control from MainPage To Window
			driver.switchTo().window(window);

			driver.close();
		}

		// Scenario2: Close All Window Without Using Quit Method

		// Scenario3: Close All Child Windows Only

		// Scenario4: Close only Parent Window
	
	}

}
