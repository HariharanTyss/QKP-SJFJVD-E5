package WebdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformNavigation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2.1:Navigate To The Application
		driver.get("https://www.swiggy.com/");

		// Step2.2:Navigate To The Application
		driver.navigate().to("https://pistahouse.in/");

		// Step2.3:Navigate To The Application
		driver.navigate().to(new URL("https://www.olacabs.com/"));

		Thread.sleep(3000);
		// Step3:Perform BackWard Navigation
		driver.navigate().back();

		Thread.sleep(3000);
		// Step4:perform BackWard Navigation
		driver.navigate().back();

		Thread.sleep(3000);
		// Step5:perform Forward Navigation
		driver.navigate().forward();

		Thread.sleep(3000);
		// Step6:perform Forward Navigation
		driver.navigate().forward();

		Thread.sleep(3000);
		// step7:Perform Refresh Navigation
		driver.navigate().refresh();

		Thread.sleep(3000);
		// Step8:Close The Browser
		driver.quit();

		// Execution Completed Log
		System.out.println("Execution Completed");
	}

}
