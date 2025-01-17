package LearningBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyUserAbleToRemoveProduct extends BaseClass {

	@Test(groups = {"FT","RT"})
	public void removeFirstProduct() {

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on Product Name
		driver.findElement(By.xpath("//div[contains(text(),'Backpack')]")).click();

		// Click on "Add to Cart" Button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click On "Remove Button" Button
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

		Reporter.log(" 1st Product Removed",true);
	}

	@Test(groups = {"IT","RT"})
	public void removeSecondProduct() {

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on Product Name
		driver.findElement(By.xpath("//div[contains(text(),'T-Shirt')]")).click();

		// Click on "Add to Cart" Button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click On "Remove Button" Button
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

		Reporter.log(" 2nd Product Removed",true);

	}

	@Test(groups = {"ST","RT"})
	public void removeThirdProduct() {

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Click on Product Name
		driver.findElement(By.xpath("//div[contains(text(),'Jacket')]")).click();

		// Click on "Add to Cart" Button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click On "Remove Button" Button
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

		
		Reporter.log(" 3rd Product Removed",true);
	}
}
