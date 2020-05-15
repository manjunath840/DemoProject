package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;


public class To_getStatus_Name 
{
	@Test
	public void testA()
	{
		Reporter.log("hi..", true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("hi..", true);
		Assert.fail();
	}
	
		@AfterMethod
		public Void  postCondition(ITestResult res)
		{
			
			
			
		}
		
	}


