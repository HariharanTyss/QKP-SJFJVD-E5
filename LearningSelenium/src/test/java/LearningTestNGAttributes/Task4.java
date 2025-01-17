package LearningTestNGAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task4 {

	@Test(enabled = false)
	public void farzana() {
		Reporter.log("Farzana", true);
	}

	@Test(enabled=true)
	public void mallaReddy() {
		Reporter.log("MallaReddy", true);
	}
}
