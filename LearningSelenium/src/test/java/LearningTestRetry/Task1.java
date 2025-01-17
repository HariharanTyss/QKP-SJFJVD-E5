package LearningTestRetry;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task1 extends BaseClass
{
	@Test(retryAnalyzer = LearningTestRetry.RetryImplementation.class)
	public void m1() 
	{
		Reporter.log("M1 Executed..",true);
		Assert.fail();
		
		
	}

}
