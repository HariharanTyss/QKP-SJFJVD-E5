package LearningAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningHardAssert {

	@Test
	public void Task() {

		String expcondition1 = "SELENIUM";
		String actualcondition1 = "SELENIUM";

		// Hard Assert--Used For High priotized Validation
		// Using Hard Assert

		if (expcondition1.equals(actualcondition1)) {
			System.out.println("Test Pass...!!!!");
		}

		else {
			System.out.println("Test Fails...!!!!");

		}

		// Assert.assertEquals(expcondition1, actualcondition1);
		// Assert.assertNotEquals(expcondition1, actualcondition1);
		// Assert.assertTrue(false);
		// Assert.assertFalse(true);

		System.out.println("Ranga Reddy");
		Assert.fail();
		System.out.println("Malla Reddy");

	}
}
