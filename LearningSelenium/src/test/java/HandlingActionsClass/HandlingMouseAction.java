package HandlingActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseAction {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To The Application
		driver.get("https://demo.automationtesting.in/Frames.html");

		// Mouse Action Steps

		// 1.Create An Object For Action Class
		Actions actionobj = new Actions(driver);

		// Identify Element
		WebElement element = driver.findElement(By.linkText("More"));

		// Call theMouse Hover Method
		actionobj.moveToElement(element).perform();

		// Call the Mouse Hover Method
		actionobj.moveToElement(driver.findElement(By.linkText("File Upload"))).perform();

		// Call the Click Method
		actionobj.click(driver.findElement(By.linkText("File Upload"))).perform();

		// Call the Right Click Method
		// actionobj.contextClick(driver.findElement(By.linkText("File
		// Upload"))).perform();

		// Call the Double Click Method
		// actionobj.doubleClick(driver.findElement(By.linkText("File
		// Upload"))).perform();

		// ===========================================

		// actionobj.moveToElement(element).moveToElement(driver.findElement(By.linkText("File
		// Upload"))).contextClick().perform();

		driver.get("https://demo.automationtesting.in/Register.html");

		// Perform Mouse Hover To The "Interaction" Feature
		actionobj.moveToElement(driver.findElement(By.partialLinkText("Interaction"))).perform();

		Thread.sleep(2000);
		// Perfrom Mouse Action To the "Drag And Drop" Feature
		actionobj.moveToElement(driver.findElement(By.partialLinkText("Drag"))).perform();

		Thread.sleep(2000);
		// Perfrom Mouse Action To the "Drag And Drop" Feature
		actionobj.moveToElement(driver.findElement(By.partialLinkText("Static"))).perform();
		// click On That "Static " Feature
		actionobj.click(driver.findElement(By.partialLinkText("Static"))).perform();
		
		Thread.sleep(3000);
		// Perform Drag ANd Drop ACtion
		WebElement src = driver.findElement(By.xpath("//img[@src='selenium.png']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		actionobj.dragAndDrop(src, dest).perform();
		
		actionobj.dragAndDrop(src, dest).perform();
		
		actionobj.dragAndDrop(src, dest).perform();

		}

}
