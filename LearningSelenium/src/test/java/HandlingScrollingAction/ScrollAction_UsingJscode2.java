package HandlingScrollingAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollAction_UsingJscode2 {

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

		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Support the Selenium Project')]"));
		Thread.sleep(5000);
		// 2.Call the method to execute the Js code----To perform Scrollling
		jsobj.executeScript("arguments[0].scrollIntoView(true)", element);

		WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Development Partners')]"));
		Thread.sleep(5000);
		// 2.Call the method to execute the Js code----To perform Scrollling
		jsobj.executeScript("arguments[0].scrollIntoView(false)", element1);

		WebElement element2 = driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers. ')]"));
		Thread.sleep(5000);
		// 2.Call the method to execute the Js code----To perform Scrollling
		jsobj.executeScript("arguments[0].scrollIntoView(false)", element2);
		Thread.sleep(5000);

	}

}
