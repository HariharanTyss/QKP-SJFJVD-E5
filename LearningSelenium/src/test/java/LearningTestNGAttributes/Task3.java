package LearningTestNGAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task3 {

	@Test(dependsOnMethods = "child")
	public void parent() {

		Reporter.log("Parent Method...!!!!!",true);
	}

	@Test(dependsOnMethods = "parent")
	public void child() {
		Reporter.log("Child Method...!!!!",true);

	}
}
