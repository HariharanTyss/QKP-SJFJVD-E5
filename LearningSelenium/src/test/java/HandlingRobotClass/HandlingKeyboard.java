package HandlingRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyboard {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		// Using Robot Class--Perform KeyBoard Action

		// 1.Create An Object
		Robot alexa = new Robot();

		// Call The NonStatic Method---Press the Key
		alexa.keyPress(KeyEvent.VK_SHIFT);

		// Call The NonStatic Method---Press the Key		alexa.keyPress(KeyEvent.VK_R);

		// Call the Non Static Method---Release The Key
		alexa.keyRelease(KeyEvent.VK_R);

		// Call the Non Static Method---Release The Key
		alexa.keyRelease(KeyEvent.VK_DOWN);
		
	}

}
