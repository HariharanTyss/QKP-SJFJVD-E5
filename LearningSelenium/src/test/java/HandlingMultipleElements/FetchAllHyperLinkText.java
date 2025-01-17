package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchAllHyperLinkText {

	public static void main(String[] args) {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("https://www.selenium.dev/");

		// Step3:Identify All the HyperLinks
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));

		int count = alllinks.size();
		System.out.println("Count of Hyperlinks Is: " + count);
		
		for (int i = 0; i < count; i++) 
		{
			String text = alllinks.get(i).getText();
			//System.out.println(i+1+">"+text);
			
		}
		
		
		for (WebElement webElement : alllinks) {
			System.out.println(webElement.getText());
		}

		// Step10:Close the Browser
		driver.close();

		// Execution log
		System.out.println("Execution Completed");

	}

}
