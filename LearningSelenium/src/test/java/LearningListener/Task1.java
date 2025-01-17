package LearningListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(LearningListener.ListenerImplementation.class)
public class Task1 extends BaseTest {

	@Test
	public void m1() {
		
		Reporter.log("Checking The Listener Implementation", true);
		Assert.fail();

	}
}
