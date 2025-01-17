package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchAlltextFromWebTable {

	public static void main(String[] args) {

		//

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Identify All the Text inside the WebTable (One Complete Column-City)
		List<WebElement> alltext = driver
				.findElements(By.xpath("// div[@class='tableFixHead']/descendant::tbody/tr/td[3]\r\n" + ""));

		// Count The Elemnts
		int count = alltext.size();

		// Fetch All The Text ANd Print
		for (int i = 0; i < count; i++) {
			String text = alltext.get(i).getText();
			System.out.println(i + 1 + " >" + text);

		}
		// -----------------------------------------------------------------------------------
		System.out.println("===============");
		// Identify All the Text inside the WebTable (One Complete Column-City)
		List<WebElement> alltext1 = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[4]/td" + ""));

		// Count The Elemnts
		int count1 = alltext1.size();

		// Fetch All The Text And Print
		for (int i = 0; i < count1; i++) {
			String text = alltext1.get(i).getText();
			System.out.println(i + 1 + " >" + text);

		}

		driver.close();
	}

}
