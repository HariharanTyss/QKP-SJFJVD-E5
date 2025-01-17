package Assignment;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//a[@href='/login']"));
		
		boolean result=element.isDisplayed();
		if(result==true) {
			System.out.println(result+"element is verified");
		}
		else {
			System.out.println(result+"element is not verified");
		}
		element.click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SANDEEP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[text()='New User Signup!']/..//input[@name='email']")).sendKeys("SANDEEP@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[text()='New User Signup!']/..//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Title']/..//input[@id='id_gender1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sandeep123");
		Thread.sleep(1000);
		WebElement ele= driver.findElement(By.xpath("//select[@id='days']"));
		Select obj=new Select(ele);
		obj.selectByIndex(15);
		WebElement ele1= driver.findElement(By.xpath("//select[@id='months']"));
		Select obj1=new Select(ele1);
		obj1.selectByIndex(6);
		WebElement ele2= driver.findElement(By.xpath("//select[@id='years']"));
		Select obj2=new Select(ele2);
		obj2.selectByIndex(21);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	

}
