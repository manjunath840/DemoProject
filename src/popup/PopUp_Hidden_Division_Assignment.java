package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Hidden_Division_Assignment 

{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(6000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		Thread.sleep(2000);
		
		WebElement buildaddress = driver.findElement(By.xpath("//span[.='(build 922_23)']"));
		String text = buildaddress.getText();
		System.out.println(text);
		Thread.sleep(2000);

}
}