import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
 public static void main(String[] args) throws InterruptedException 
 {
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(2000);
	
	driver.navigate().to("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);

	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.close();
	
}
	

}
