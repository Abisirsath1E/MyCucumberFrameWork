package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_elements 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='Email']") public WebElement email;
	@FindBy(xpath="//input[@id='Password']") public WebElement password;
	@FindBy(xpath="//button[@type='submit']") public WebElement loginButton;
	@FindBy(xpath="//input[@id='RememberMe']") public WebElement chebox;
	
	public LoginPage_elements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
