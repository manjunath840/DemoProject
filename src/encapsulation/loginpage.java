package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage
{
	//declaration 
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginTB;
	
	@FindBy(id="logoutLink")
	private WebElement logoutTB;
	
	//initialization
	public loginpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getuserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void getpassword(String pw)
	{
		pwTB.sendKeys(pw);
	}

	public void Loginclick()
	{
		loginTB.click();
	}
	
	public void loginOutClick()
	{
		logoutTB.click();
	}
	
	
	
}
