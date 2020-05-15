package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Invocation 
{
	@Test(invocationCount=5)
	public void testC()
	{
		Reporter.log("hi..", true);
	}

}
