package LearningAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LearningSoftAssert {

	@Test
	public void Task() {

		SoftAssert softobj = new SoftAssert();

		String expcondition1 = "SELENIUM";
		String actualcondition1 = "lukyjthrgsd";

		softobj.assertEquals(expcondition1, actualcondition1);
		System.out.println("Dinga ");

		softobj.assertAll();
		System.out.println("Manga ");
		System.out.println("Penga ");

	}
}
