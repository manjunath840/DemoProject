package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo07 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
		
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	Thread.sleep(2000);
	
	String t= driver.getTitle();
	System.out.println("t");
	
	WebElement un = driver.findElement(By.id("username"));
	un.sendKeys("admin");
	
	WebElement pwd = driver.findElement(By.name("pwd"));
	pwd.sendKeys("manager");
	
	
	WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
	
	login.click();		
	
	
	WebElement logout = driver.findElement(By.id("logoutLink"));
	logout.click();
	

	}

}
