package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAuthenticationpopups {

	public static void main(String[] args) {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		// Handle The Authentication Popups
		String username="admin";
		
		String password="admin";

		//Customize the URL Using Valid SignUp Credential
		String url = "https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";

		// Step2:Navigate To URL
		driver.get(url);

	}

}
