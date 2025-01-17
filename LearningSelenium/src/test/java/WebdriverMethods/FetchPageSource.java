package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPageSource {

	public static void main(String[] args) 
	{
		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To The Application Via URL
		driver.get("file:///C:/Users/Harry/Downloads/webpage%20(2).html");

		//Step3:Fetch The SourceCode Of WebPage.
		String pagesource = driver.getPageSource();
		
		//Print On Console
		System.out.println(pagesource);
		
		//Step10:Close the Browser
		driver.close();
	}

}
