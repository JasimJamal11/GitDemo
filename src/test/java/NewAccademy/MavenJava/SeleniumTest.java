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
}
