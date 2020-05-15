package gsp.automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args)
	{	
		
Scanner sc = new Scanner(System.in);
System.out.println("enter the username");
String un=sc.nextLine();

System.out.println("enter the password");
String pw=sc.nextLine();

WebDriver c =new ChromeDriver();
c.manage().window().maximize();
c.get("https://www.facebook.com/");

c.findElement(By.id("email")).sendKeys(un);
c.findElement(By.id("pass")).sendKeys(pw);
c.findElement(By.xpath("//input[@value='Log In']")). click();
		
	}

}
