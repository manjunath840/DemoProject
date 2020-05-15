package hmsERP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Pra 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe"); 
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.zomato.com/bangalore");
	Actions action =new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='tr-header-bttn']/span"))).perform();
	action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	}

}

