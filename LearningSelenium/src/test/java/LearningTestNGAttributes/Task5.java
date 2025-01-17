package LearningTestNGAttributes;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task5 {

	@DataProvider
	public Object[][] details() {
		Object[][] data = new Object[3][3];

		data[0][0] = "RangaReddy";
		data[0][1] = 101;
		data[0][2] = "Testing Engineer";

		data[1][0] = "MallaReddy";
		data[1][1] = 102;
		data[1][2] = "Delopment Engineer";

		data[2][0] = "SangaReddy";
		data[2][1] = 103;
		data[2][2] = "Devops";
		return data;
	}
	@Test(dataProvider = "details")
	public void seleniumBatchList(String name,int id,String dept)
	{
		System.out.println("-------------------");
		Reporter.log("Name is :"+name,true);
		Reporter.log("Id is :"+id,true);
		Reporter.log("Dept is :"+dept,true);
		System.out.println("-------------------");


	}

}
