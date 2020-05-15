package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;


public class BaseTest 
{
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("beforeMethod", true);
	}
	@AfterMethod
	public void aftereMethod()
	{
		Reporter.log("afterMethod", true);
	}
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("beforeclass", true);
	}

	@AfterClass
	public void afterclass()
	{
		Reporter.log("afterclass", true);
	}

	@BeforeTest
	public void beforetest()
	{
		Reporter.log("beforetest", true);
	}
	
		@AfterTest
		public void aftertest()
		{
			Reporter.log("aftertest", true);
		}
		
	
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("beforesuite", true);
	}
	
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("aftersuite", true);
	}
}
