package Methods_webelement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String url=driver.getCurrentUrl();
		
	System.out.println("current url ="+url);
	
	    String  title =driver.getTitle();
	    System.out.println("title ="+title);
	    
	    Thread.sleep(2000);
	    
	    driver.manage().deleteAllCookies();
	  	

	}

}
