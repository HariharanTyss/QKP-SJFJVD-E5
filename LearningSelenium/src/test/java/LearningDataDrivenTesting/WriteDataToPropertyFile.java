package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteDataToPropertyFile {

	@Test
	public void Task1() throws IOException {

		// Steps To Write The Data To External Resources-PropertyFile
		// 1.Convert the Physical File Into Java Understandable
		FileInputStream fis = new FileInputStream("./Data/commondata.properties");

		// 2.Create An Object For Properties Class
		Properties propertyobj = new Properties();

		// 3.Call The Non Static Method --To Load the Property
		propertyobj.load(fis);

		// 4.Call The Non Static Method --To Write the Property Key And Value
		propertyobj.put("browsername", "opera");

		// 5.Convert the Java Understandable Data To Physical File Data
		FileOutputStream fos = new FileOutputStream("./Data/commondata.properties");

		//6.Save The PropertyFile
		propertyobj.store(fos,"Updated Latest Data.!!!!!!!!!");

		
		System.out.println("Execution completed...");
	}
}
