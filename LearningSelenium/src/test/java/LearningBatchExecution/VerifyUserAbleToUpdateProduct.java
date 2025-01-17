package LearningBatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyUserAbleToUpdateProduct extends BaseClass {

	
	@Test
	public void Apple() {
		Reporter.log("Apple",true);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void Orange() {
		Reporter.log("Orange",true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void PinaApple() {
		Reporter.log("PineApple",true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
