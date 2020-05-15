package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class to_Ignore_testClass
{
	@Test
	public void registerUser()
	{
		Reporter.log("Hello", true);
	}

	@Test(enabled=false)
	public void deleteUser()
	{
		Reporter.log("deleteuser", true);
	}
}
