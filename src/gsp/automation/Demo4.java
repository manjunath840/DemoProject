package gsp.automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username");
		String un= sc.nextLine();
		
		
	         
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
         WebDriver c =new ChromeDriver();
         c.get("https://accounts.google.com/");
         c.findElement(By.id("identifierId")).sendKeys(un);
         c.findElement(By.xpath("//span[.='Next']")).click();
         
         System.out.println("enter the username");
	 		String pwd = sc.nextLine();
         c.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
         c.findElement(By.xpath("//span[.='Next']")).click();

	}

}
