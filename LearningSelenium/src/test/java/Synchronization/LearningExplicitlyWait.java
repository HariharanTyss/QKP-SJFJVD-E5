package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Exlpicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Navigate To The Application
		driver.navigate().to("https://www.shoppersstack.com/");

		// Explicit Wait Condition
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='loginBtn']"))));

		wait.until(ExpectedConditions.alertIsPresent());

		wait.until(ExpectedConditions.attributeContains(By.xpath(""), "", ""));
		
		wait.until(ExpectedConditions.attributeToBe(By.xpath(""), "", ""));

		wait.until(ExpectedConditions.titleContains(""));
		
		wait.until(ExpectedConditions.titleIs(""));
		

		// Perform Action
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		Thread.sleep(2000);
		driver.close();

	}

}
