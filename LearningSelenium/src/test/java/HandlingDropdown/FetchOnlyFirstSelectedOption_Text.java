package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchOnlyFirstSelectedOption_Text {
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

		// Select The Option-Using Index
		selectobj.selectByIndex(4);

		// Select The Option-Using VisibleText
		selectobj.selectByVisibleText("AUSTRALIA");

		// Select The Option-Using Value
		selectobj.selectByValue("cnd");

		// Fetch All the Selected Option only
		List<WebElement> allselectedoption = selectobj.getAllSelectedOptions();

		// Print the Count
		int count = allselectedoption.size();
		System.out.println("Selected Options Count is: " + count);

		// print all The Selected Options Text
		for (int i = 0; i < count; i++) {
			String text = allselectedoption.get(i).getText();
			System.out.println(i + 1 + "> " + text);

		}

		// Fetch the First Selected Option_Text
		WebElement text = selectobj.getFirstSelectedOption();

		System.out.println(text.getText());

		driver.quit();
	}
}
