package framework.com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void first()
 {
	System.out.println("HEllow");
	System.out.println("HEllow2");
	System.out.println("HEllow3");
 }
 @BeforeSuite
	public void annotation()
	{
		System.out.println("i will execute first");
		System.out.println("i will execute first32");
		System.out.println("i will execute first3");
	}
 @BeforeMethod
 public void annotation2() 
 {
	 System.out.println("i will execute after every method");
 }
}
 