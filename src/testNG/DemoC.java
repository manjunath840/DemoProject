package testNG;

import org.testng.annotations.Test;
import org.testng.Reporter;


public class DemoC 
{
	@Test
	public void testC()
	{
		Reporter.log("hi..", true);
	}

}
