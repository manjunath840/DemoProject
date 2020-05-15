package testNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest
{
	@Test
	public void registerUser()
	{
		Reporter.log("Hello", true);
	}

}
