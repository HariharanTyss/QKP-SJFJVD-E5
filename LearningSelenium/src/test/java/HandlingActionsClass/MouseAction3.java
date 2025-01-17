package HandlingActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction3 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions actionobj = new Actions(driver);

		WebElement src = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='box104']"));

		actionobj.clickAndHold(src).build().perform();

		actionobj.release(dest).build().perform();

	}
}	
