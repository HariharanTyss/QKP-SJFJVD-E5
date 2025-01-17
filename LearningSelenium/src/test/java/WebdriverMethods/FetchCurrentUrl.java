package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchCurrentUrl {

	public static void main(String[] args) {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To The Application Via URL
		driver.get("file:///C:/Users/Harry/Downloads/webpage%20(2).html");

		// Step3:Fetch The Current URL
		String url = driver.getCurrentUrl();

		// Step4:Print On Console
		System.out.println("The Current  URL is :"+url);

		// Step10:Close the Browser
		driver.close();

	}

}
