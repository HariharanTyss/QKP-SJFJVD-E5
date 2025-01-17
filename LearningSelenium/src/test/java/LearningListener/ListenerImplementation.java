package LearningListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		// Fetch the Test Method Method Name
		String methodname = result.getName();

		// Provide Implementation For Taking Screenshot

		// 1.perfom Typecating
		TakesScreenshot ts = (TakesScreenshot) BaseTest.staticdriver;

		// 2.Call the Screenshot Method
		// 3.Store the Screenshot In Temp Path
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Use TimeStamp
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());

		// 4.Create the Permanent Path
		File destination = new File("./TestScreeshot/" + methodname + timestamp + ".png");

		// 5.Copy the Screesnhot From Temp To Permanent Path
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Reporter.log("Test Failure Method Executed--------Screenshot Taken", true);
	}

}
