package HandlingFrame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningIFrame {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step2:Navigate To The Application
		driver.get("https://demo.automationtesting.in/Frames.html");

		Thread.sleep(3000);
		// Step3:click on The "Button"
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		// Step4:Switch the control From Mainpage To Frame
		driver.switchTo().frame(1).switchTo().frame(0);

		Thread.sleep(3000);
		// Step5:Enter the Data Inside The TextField
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RangaReddy/Malla Reddy");

		// Step6:Switch Back The Control From Frame To Immediate Parent Frame
		driver.switchTo().parentFrame();

		// Step7:Fetch The Text And Print
		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);

		// step8:Switch Back To Main Page
		driver.switchTo().defaultContent();

		// Step9:Fetch The Text From MainPage And Print
		System.out.println(driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText());

		// Step10:Close the Browser
		//driver.quit();

		System.out.println("Execution Done!!!!!!!!!");
	}
}
