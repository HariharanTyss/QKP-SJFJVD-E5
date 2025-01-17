package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageWindows {
	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Browser
		Options optionobj = driver.manage();
		Window windowobj = optionobj.window();
		windowobj.maximize();

		Thread.sleep(5000);
		// Optimized Code
		// Maximize the Browser
		driver.manage().window().maximize();

		Thread.sleep(5000);
		// Make Fullscreen Of The Browser
		driver.manage().window().fullscreen();

		Thread.sleep(5000);
		// Make Minimize The Browser
		//driver.manage().window().minimize();

		Thread.sleep(5000);
		// Customize The Browser Size
		Dimension size = new Dimension(500, 500);
		driver.manage().window().setSize(size);

		Thread.sleep(5000);
		// Customize The Browser Position
		Point position = new Point(200, 200);
		driver.manage().window().setPosition(position);

		// Close The Browser
		driver.close();

		// Execution Completed Log
		System.out.println("Execution Completed");

	}
}
