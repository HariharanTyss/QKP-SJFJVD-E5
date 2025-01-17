package LearningTestNGAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task1 {

	@Test(priority = -3)
	public void Orange() {
		Reporter.log("Orange...!!!!", true);
	}

	@Test(priority = -3)
	public void Mango() {
		Reporter.log("Mango...!!!!", true);
	}

	@Test(priority = 0)
	public void Banana() {
		Reporter.log("Banana...!!!!", true);
	}

	@Test(priority = 0)
	public void Apple() {
		Reporter.log("Apple...!!!!", true);
	}

	@Test(priority = -3)
	public void Grapes() {
		Reporter.log("Grapes...!!!!", true);
	}

}
