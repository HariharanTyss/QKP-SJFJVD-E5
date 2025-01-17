package HandlingScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTheScreenshot {

	public static void main(String[] args) throws IOException {

		// Configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:Launch the Browser
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate To URL
		driver.get("https://selenium.dev/");

		// Fetch the Time Stamp
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String res = sdf.format(date);
		System.out.println(res);

		// How To Take The Screenshot
		// 1.Perform Typecasting-From Webdriver Type To TakesScreenshotType
		TakesScreenshot tsobj = (TakesScreenshot) driver;

		// 2.Call the Method To Take the Screenshot
		// 3.Store the Captured Screentshot in Temp Path.
		File screenshot = tsobj.getScreenshotAs(OutputType.FILE);

		// 4.Create the Permanent Path To Store it.
		File destination = new File("./TestScreeshot/" + date + "Screesnhot.png");

		// 5.Copy The Captured screeshot from Temp to Permanent Path.
		FileHandler.copy(screenshot, destination);

	}

}
