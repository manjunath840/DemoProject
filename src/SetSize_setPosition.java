import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSize_setPosition 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) 
	{

		 FirefoxDriver driver = new FirefoxDriver();
		Dimension d= new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p= new Point(250, 250);
		driver.manage().window().setPosition(p);
		
		
		
		
		

	}

}
