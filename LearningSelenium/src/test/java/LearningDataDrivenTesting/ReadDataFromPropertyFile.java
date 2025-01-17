package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {

	@Test
	public void Task1() throws IOException {

		//Steps To Fetch The Data From External Resources-PropertyFile
		//1.Convert the Physical File Into Java Understandable
		FileInputStream fis = new FileInputStream("./Data/commondata.properties");
		
		//2.Create An Object For Properties Class
		Properties propertyobj = new Properties();
		
		//3.Call The Non Static Method --To Load the Property
		propertyobj.load(fis);
		
		//4.Call The Non Static Method --To Fetch the Property Value----By Passing the Key/Property Name
		String data = propertyobj.getProperty("url");
		
		//print the data
		System.out.println(data);
		
		
		
		
	}
}
