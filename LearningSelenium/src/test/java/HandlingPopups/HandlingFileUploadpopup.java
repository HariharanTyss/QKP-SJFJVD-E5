package HandlingPopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFileUploadpopup {

	public static void main(String[] args) {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Navigate To The Application
		driver.get("file:///C:/Users/Harry/Downloads/webpage%20(3).html");

		// Identify The Element
		WebElement choosefile = driver.findElement(By.name("photo"));

		// Create the File
		File filepath = new File("./TestScreeshot/FirstScreesnhot.png");

		// Fetch The Absolute Path of File
		String file = filepath.getAbsolutePath();

		// Pass the File or Data
		choosefile.sendKeys(file);

	}

}
