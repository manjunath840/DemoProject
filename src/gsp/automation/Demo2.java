package gsp.automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
	}

	public static void main(String[] args)
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");

	}

}
