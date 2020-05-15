package popup;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PopUp_HiddenDivision_Cleartrip_CurrentDate
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//strong[.='Depart on']/../../..//input[@type='text']")).click();
	
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(2000);
	
	Date date = new Date();
	SimpleDateFormat s1=new SimpleDateFormat("d");
	String day = s1.format(date);
	
	SimpleDateFormat s2=new SimpleDateFormat("MMMM");
	String month= s2.format(date);
	
	// to select the current date
	driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
	Thread.sleep(2000);
	
	
	driver.close();
	
	
}
}

