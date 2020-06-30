package NewAccademy.MavenJava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void Browser()
	{
		System.out.println("Enter Browser Name");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("HAi");
	}
	
	@Test
	public void Browser2()
	{
		System.out.println("Enter Browser Name2	");
		
	}
	
	@Test
	public void Browserr()
	{
		System.out.println("Enter Browser Namet");
	}
	
	public void Browserrdevelo()
	{
		System.out.println("Enter Browser Name develop");
	}
	
	public void Browserrdevelop()
	{
		System.out.println("Enter Browser Name developcal");
	}
	
	public void Browserrdevelopnewdate()
	{
		System.out.println("Enter Browser Name developcalnewdate");
	}
}
