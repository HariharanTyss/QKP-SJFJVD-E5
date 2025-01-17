package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		if (driver.getCurrentUrl().equals("https://www.globalsqa.com/demo-site/select-dropdown-menu/")) {
			System.out.println("Yes , lanched Application :)");
		} else {
			System.out.println("Not ,lached Application:(");
		}
		WebElement dropdown = driver.findElement(By.id("select"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option[104]"));
		driver.quit();
	}
}
