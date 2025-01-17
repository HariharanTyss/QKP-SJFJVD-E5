package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchTitle {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To The Application Via URL
		driver.get("file:///C:/Users/Harry/Downloads/webpage%20(2).html");
		
		Thread.sleep(5000);
		// Step3:Fetch The Title Of The WebPage
		String title = driver.getTitle();

		// Print The Title
		System.out.println("The Title Is : "+title);

	

		// Step10:Close the Browser
		driver.close();
	}

}
