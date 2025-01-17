package LearningBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyUserAbleToAddProduct extends BaseClass {

	@Test(groups = { "FT", "RT" }, priority = -1)
	public void addFirstProduct() {

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//String expTitle = "";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(expTitle, actualTitle);

		// Click on Product Name
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Backpack')]"));
		Assert.assertTrue(ele.isDisplayed()&&ele.isEnabled());
		ele.click();

		// Click on "Add to Cart" Button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		// Test log
		Reporter.log("1st Product Added", true);
		}

	@Test(groups = { "IT", "RT" }, priority = 2)
	public void addSecondProduct() {
		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on Product Name
		driver.findElement(By.xpath("//div[contains(text(),'T-Shirt')]")).click();

		// Click on "Add to Cart" Button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		Reporter.log("2nd Product Added", true);
	}

	@Test(groups = { "ST", "RT" }, priority = 0)
	public void addThirdProduct() {
		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on Product Name
		driver.findElement(By.xpath("//div[contains(text(),'Jacket')]")).click();

		// Click on "Add to Cart" Button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		Reporter.log("3rd Product Added", true);

	}

}
