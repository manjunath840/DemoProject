package Collections_methods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import 	 java.util.*;

public class List
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.cricbuzz.com/");
		 
		 // to count number of links
		 
		/* 
		 WebElement link = driver.findElement(By.linkText("qspiders"));
		 String name = link.getText();
		 System.out.println(name);
	
		 WebElement link1 = driver.findElement(By.linkText("jspiders"));
		 String name1 = link1.getText();
		 System.out.println(name1);
		*/
          
		 java.util.List<WebElement> links = driver.findElements(By.xpath("//a"));
		 int count = (links).size();
		 System.out.println(count);

		 for(int i=0;i<count;i++)
		 {
			 WebElement name = links.get(i);
	         String linkname = name.getText();
	         System.out.println(linkname);
	         
		 }
		 
         driver.close();
   	}

}
