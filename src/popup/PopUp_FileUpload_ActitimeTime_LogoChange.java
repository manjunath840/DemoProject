package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp_FileUpload_ActitimeTime_LogoChange
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		
		//click on setting
		String xp ="//div[@class='popup_menu_label']/../../../..//div[@class='popup_menu_icon settings_icon']";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(2000);
		
		//click on logo and color scheme
		driver.findElement(By.xpath("//a[@href='/administration/customization.do']")).click();
		
		
		//select custom logo button
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		
		//To choose file
		//driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\MANJUNATH M R\\Desktop\\sample web.do");
		
		
		//click on browse
		driver.findElement(By.xpath("//span[.='Configure Logo for Interfaces']/../..//input[@type='file']")).sendKeys("C:\\Users\\MANJUNATH M R\\Pictures\\2005-01\\2d Projected Polylines.jpg");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		

	}

}
