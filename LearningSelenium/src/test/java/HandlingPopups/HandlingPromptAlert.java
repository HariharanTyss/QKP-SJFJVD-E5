package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPromptAlert {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Click On The Button Which Gives Popup---Prompt Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		// Explicit Wait Condition To Check The Alert Is Present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());

		// Switch The Driver Control From MainPage To Alert
		// Fetch the Alert Title and Print
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		Thread.sleep(4000);
		// Enter The Data in Alert TextField
		driver.switchTo().alert().sendKeys("Learning Selenium");

		// Click On Ok Button
		driver.switchTo().alert().accept();

		// Click On Cancel Button
		//driver.switchTo().alert().dismiss();

		// Close the Browser
		//driver.quit();
	}

}
