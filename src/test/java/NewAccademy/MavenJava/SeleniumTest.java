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
}
