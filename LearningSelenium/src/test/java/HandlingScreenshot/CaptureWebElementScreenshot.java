package HandlingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureWebElementScreenshot {

	public static void main(String[] args) throws IOException {
		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("https://selenium.dev/");

		// Step To Capture The Screenshot

		// 1. Identify the WebElement and Store It
		WebElement element = driver.findElement(By.xpath("(//*[name()='svg'])[4]"));

		// 2.Call the Screenshot Method and Capture the Screenshot
		// 3.Strore it in the Temp Path
		File src = element.getScreenshotAs(OutputType.FILE);
		
		//4.Create The Permanent Path To Store the Screenshot
		File destination = new File("./TestScreeshot/fourthWebelementShot.png");

		//5.Copy the Screenshot From Src to Destination
		FileHandler.copy(src, destination);

		//Close The Browser
		driver.quit();
	}

}
