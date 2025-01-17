package BasicSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMultipleBrowser {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		// Step1:Launch The Browser
		LaunchBrowser();

		// Step2:Navigate To The Application
		driver.get("https://www.selenium.dev/");

		// Step10:Close The Browser
		driver.close();

		// Execution Completed Log/Status
		System.out.println("<====Execution Completed===>");
	}

	public static void LaunchBrowser() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Browser Name");
		String browser = sc.next();

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser information u have Entered");
		}

	}

}
