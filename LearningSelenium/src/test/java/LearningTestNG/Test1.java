package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {


	@Test
	public void demoTest1() {

		Reporter.log("Demo Test 1 Exceuted!!!!", true);
	}

	@Test
	public void demoTest2() {

		Reporter.log("Demo Test 2 Exceuted!!!!", true);
	}

	@Test
	public void demoTest3() {

		Reporter.log("Demo Test 3 Exceuted!!!!", true);
	}
}
