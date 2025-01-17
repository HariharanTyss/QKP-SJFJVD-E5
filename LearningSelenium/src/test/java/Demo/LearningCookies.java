package Demo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningCookies {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Handle Cookies---Fetch the Cookies
		Set<Cookie> allcookie = driver.manage().getCookies();
		System.out.println(allcookie);

		// Add the Cookies
		Cookie newcookie = new Cookie("Cookie Name", "Cookie Value");
		driver.manage().addCookie(newcookie);

		// Delete the Cookies
		driver.manage().deleteCookie(newcookie);

		// Delete All Cookies
		driver.manage().deleteAllCookies();

	}
}
