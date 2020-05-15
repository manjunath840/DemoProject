package encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Mainpage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
				
		loginpage lp= new loginpage(driver);
		lp.getuserName("admin");
		lp.getpassword("manager");
		lp.Loginclick();
		lp.loginOutClick();
		
		
		Thread.sleep(1000);
		
		lp.getuserName("admin");
		lp.getpassword("managefr");
		lp.Loginclick();
		
		
	}

}
