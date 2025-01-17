package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {

	@BeforeClass
	public void BC() {
		System.out.println("Before CLASS");
	}
	
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before METHOD ");
	}
	
	
	@Test
	public void demo1() {
		System.out.println("Hello..!!!!");
	}
	
	
	@Test
	public void demo2() {
		System.out.println("How Are You..!!!!!");
	}
	
	
	@Test
	public void demo3() {
		System.out.println("Bye Gd Night..!!!!");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("After METHOD");
		
	}
	
	
	
	
	@AfterClass
	public void AC() {
		System.out.println("After CLASS");
	}
}
