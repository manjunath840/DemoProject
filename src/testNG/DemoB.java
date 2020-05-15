package testNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB
{
	@Test 
	public void register()
	{
		Reporter.log("Manjunath", true);
	}
	
	@Test (dependsOnMethods=("register"))
	public void editUser()
	{
		Reporter.log("mmmmm", false);
	}

	@Test (dependsOnMethods= {"register","editUser"})
	public void man()
	{
		Reporter.log("rrrrrr", true);
	}
}
