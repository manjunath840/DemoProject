package popup;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_ChildBrowser_NaukriApp
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		
		//to get the address of all the windows
		Set<String> alladress = driver.getWindowHandles();
		
		for(String s:alladress)
		{
		System.out.println(s);
		}
		
		
		// address of individaul window
		driver.switchTo().window(s);

	}

}
