package HandlingActionsClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseAction2 {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To The Application
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		// Mouse Action Steps
		// 1.Create An Object For Action Class
		Actions actionobj = new Actions(driver);

		// Identify Drag Element
		WebElement src1 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement src2 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement src3 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement src4 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement src5 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement src6 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement src7 = driver.findElement(By.xpath("//div[@id='box3']"));

		// Identify DragElement
		WebElement dest1 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement dest2 = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement dest3 = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement dest4 = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement dest5 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement dest6 = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement dest7 = driver.findElement(By.xpath("//div[@id='box103']"));

		// Perform Drag And Drop
		actionobj.dragAndDrop(src1, dest1).perform();
		actionobj.dragAndDrop(src2, dest2).perform();
		actionobj.dragAndDrop(src3, dest3).perform();
		actionobj.dragAndDrop(src4, dest4).perform();
		actionobj.dragAndDrop(src5, dest5).perform();
		actionobj.dragAndDrop(src6, dest6).perform();
		actionobj.dragAndDrop(src7, dest7).perform();

		// ========================================

		List<WebElement> alldragele = driver
				.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
		List<WebElement> alldropele = driver.findElements(By.xpath("//div[@id='countries']//div"));

		for (int i = 0; i < alldragele.size(); i++) {
			WebElement src = alldragele.get(i);
			WebElement dest = alldropele.get(i);
			Thread.sleep(2000);
			//actionobj.dragAndDrop(src, dest).perform();
		}

	}

}
