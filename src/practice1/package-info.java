/**
 * 
 */
/**
 * @author MANJUNATH M R
 *
 */
package practice1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class browser
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name:");
		String name=sc.nextLine();	
		
		WebDriver driver=null;
		if(name.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(name.equals("firefox"))
		{
			driver =new FirefoxDriver(); 
		}
		
		driver.close();
	}
	
}