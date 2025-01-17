package learningPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Decalaration-WebElement
	@FindBy(css = ".login_logo")
	private WebElement logo;

	@FindBy(id = "user-name")
	private WebElement usernametextfield;

	@FindBy(name = "password")
	private WebElement passwordtextfield;

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginbutton;

	// Intilization--WebElement
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	//Utilization--WebElement
	public WebElement getLogo() {
		return logo;
	}

	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
