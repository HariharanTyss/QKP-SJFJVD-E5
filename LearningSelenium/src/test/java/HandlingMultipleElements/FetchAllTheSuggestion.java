package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchAllTheSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// configure teh Browser
		WebDriverManager.chromedriver().setup();

		// launch The Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Navigate to The Application via URL
		driver.get("https://www.google.com/");

		// Identify The Element-Search Text Field
		WebElement searchtextfield = driver.findElement(By.xpath("//textarea[contains(@name,'q')]"));

		// Perform Action -Enter The Dynamic Data
		String data="aaa";
		searchtextfield.sendKeys(data);
		Thread.sleep(5000);
		
		// Fetch all the Suggestion and Store it
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[contains(text(),'"+data+"')]"));

		// And Fetch the count of Suggestion and Print
		int count = allsuggestions.size();
		System.out.println("The Count is : " + count);

		// Print The Text Of The Suggestion
		for (int i = 0; i < count; i++) {
			String text = allsuggestions.get(i).getText();
			System.out.println(i + 1 + ">" + text);
		}
		// Close The Browser
		driver.quit();

		// Execution Log
		System.out.println("Execution Completed");

	}

}
