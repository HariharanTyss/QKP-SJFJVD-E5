package LearningBatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// Declaration
	public WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeClass
	public void browserSetup(String browsername,String url) {
		System.out.println(url);
		System.out.println("Browser Set Up ");

		// Browser Configure and launch

		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else {
			System.out.println("Please Enter Valid Browser Name!!!!!!!");
			System.out.println("So Execute Default Browser");
			
		}

		// navigate to application
		driver.get(url);

	}

	@Parameters({"url","username","Password"})
	@BeforeMethod
	public void login(String url,String uname,String pswd) {
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pswd);

		// Enter User Name
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);

		// Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pswd);

		// Click on login button
		driver.findElement(By.cssSelector("#login-button")).click();

		System.out.println("Login");

	}

	@AfterMethod
	public void logout() {

		// Click on Details
		driver.findElement(By.xpath("//div[@class='bm-burger-button']/button")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Click on Logout
		driver.findElement(By.xpath("//a[contains(@id,'logout')]")).click();

		System.out.println("logout");

	}

	@AfterClass
	public void browserTerminate() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
		System.out.println("Browser Terminated");

	}

}
