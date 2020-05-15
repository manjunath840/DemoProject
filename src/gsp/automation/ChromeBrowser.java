package gsp.automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the user name");
		String un = sc.nextLine();
		
		
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver f = new FirefoxDriver();
		f.get("https://accounts.google.com/");
		f.findElement(By.id("identifierId")).sendKeys(un);
		f.findElement(By.xpath("//span[.='Next']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("enter the password");
		String pwd = sc.nextLine();
		
		f.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		f.findElement(By.xpath("//span[.='Next']")).click();
		
		Thread.sleep(3000);
		f.close();
		
		
	}
	

}
