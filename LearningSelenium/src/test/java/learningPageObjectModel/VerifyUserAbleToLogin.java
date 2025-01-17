package learningPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUserAbleToLogin {

	@Test
	public void verifyWithValidInput() {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To the Application Via URL
		driver.get("https://www.saucedemo.com/");

		// 1.Create An Object For Specfic Pom Class-LoginPage
		LoginPage loginpage = new LoginPage(driver);

		// Step3:Enter UserName In the Name TextField
		loginpage.getUsernametextfield().sendKeys("standard_user");

		// Step4:Enter Password In the Password TextField
		loginpage.getPasswordtextfield().sendKeys("secret_sauce");

		// Step5:Fettch the LogoText And Print
		System.out.println(loginpage.getLogo().getText());

		// Step6:Click On Login Button.
		loginpage.getLoginbutton().click();
		
		//Close the Browser
		driver.quit();
	}
}
