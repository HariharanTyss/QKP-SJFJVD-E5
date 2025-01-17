package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {

	public static void main(String[] args)
	{
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate To The Application Via URL
		driver.get("https://www.selenium.dev/");

	}

}
