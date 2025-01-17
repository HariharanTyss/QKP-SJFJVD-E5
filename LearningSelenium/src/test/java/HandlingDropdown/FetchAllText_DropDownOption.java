package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchAllText_DropDownOption {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("file:///C:/Users/Harry/git/EpsonDoms/com.Epsondoms/src/main/resources/Softwares/webpage.html");

		// Steps To Handle DropDown

		// Identify The Dropdown
		WebElement dropdown1 = driver.findElement(By.name("country1"));
		WebElement dropdown2 = driver.findElement(By.name("country2"));

		// Create An Object For Select Class
		Select selectobj = new Select(dropdown2);

		// Validate The Dropdown-It is Single or Multiple
		boolean result = selectobj.isMultiple();

		// Test Log
		if (result) {
			System.out.println("Dropdown Verified: It Is Muliple Select Dropdown");
		} else {
			System.out.println("Dropdown Verified: It Is Single Select Dropdown");
		}

		Thread.sleep(5000);
		// Select The Option-Using Index
		selectobj.selectByIndex(0);

		Thread.sleep(5000);
		// Select The Option-Using VisibleText
		selectobj.selectByVisibleText("AUSTRALIA");

		Thread.sleep(5000);
		// Select The Option-Using Value
		selectobj.selectByValue("cnd");

		//Thread.sleep(5000);
		// Deselect the Option
		// selectobj.deselectAll();

		Thread.sleep(3000);
		// Deselect By Index
		selectobj.deselectByIndex(0);
		
		Thread.sleep(3000);
		// Deselct By Value
		selectobj.deselectByValue("cnd");
		
		Thread.sleep(3000);
		// Deselect By Visible Text
		selectobj.deselectByVisibleText("AUSTRALIA");

		// Fetch All Option And Store It
		List<WebElement> alloptions = selectobj.getOptions();

		// Count The Options and Print
		int count = alloptions.size();
		System.out.println("Count Is :" + count);

		// Fetch Text of The Options One By One And Print
		for (WebElement webElement : alloptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("------------------------------------------");
		
		//Fetch the Text Of My Options----Alternate Method
		WebElement alloption_alternate = selectobj.getWrappedElement();
		
		//Print On Console
		String text_alternate = alloption_alternate.getText();
		System.out.println(text_alternate);
		

		// Close The Browser
		driver.quit();

		// Execution Log
		System.out.println("Execution Completed");

	}

}
