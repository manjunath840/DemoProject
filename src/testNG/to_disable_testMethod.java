package testNG;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


@Ignore
public class to_disable_testMethod
{
	@Test
	public void registerUser()
	{
		Reporter.log("Hello", true);
	}

}
