package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_FileUpload_naukri 
{
	static
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		}
	
	   public static void main(String[] args) throws InterruptedException
	   {
		     WebDriver driver= new FirefoxDriver();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.get("https://www.naukri.com/");
		     String pWH = driver.getWindowHandle();
		 	Set<String> allWH = driver.getWindowHandles();
			allWH.remove(pWH);
			for(String wh:allWH)
			{
				driver.switchTo().window(wh);
				driver.close();
			}
		     driver.switchTo().window(pWH);
		     
			//click on upload button
	        driver.findElement(By.id("input_resumeParser")).sendKeys("D:\\Resumes n cover ltr\\Resume\\Manjunath_2.docx");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//input[@maxlength='35']")).sendKeys("Manu");
	        Thread.sleep(1000);
	        driver.findElement(By.id("bd_email")).sendKeys("mrmanjunatha@gmail.com");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@minlength='10']")).sendKeys("1234567890");
	        Thread.sleep(3000);
	        WebElement yr = driver.findElement(By.id("bd_adv_workExp_year"));
	        JavascriptExecutor j = (JavascriptExecutor) driver;
	        j.executeScript("arguments[0].click()", yr);
	        Thread.sleep(1000);
	        driver.findElement(By.id("2")).click();
	        
	        driver.findElement(By.id("bd_adv_workExp_month")).click();
	        driver.findElement(By.id("3")).click();
	        
	       
	        	   
	        Thread.sleep(1000);
	        //driver.quit();
	   }
	 	  
}
