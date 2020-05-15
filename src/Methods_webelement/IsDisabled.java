package Methods_webelement;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
	}

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String url=driver.getCurrentUrl();
		
	System.out.println("current url ="+url);
	
	    String  title =driver.getTitle();
	    System.out.println("title ="+title);
	    
	    	   
	    driver.close();

	}

}
