package actions;

import org.openqa.selenium.WebDriver;

import elements.LoginPage_elements;
import steps.commonActions;

public class LoginPage_actions 
{
	WebDriver driver;
	LoginPage_elements LP_elements;	
	//commonActions ca = new commonActions();
	public LoginPage_actions (commonActions ca)
	{
		this.driver=ca.getDriver();
		LP_elements = new LoginPage_elements(driver);
	}
	
	public void enterEmail(String Email) throws InterruptedException
	{
		LP_elements.email.clear();
		Thread.sleep(2000);
		LP_elements.email.sendKeys(Email);
	}
	public void enetrPasword(String pwd) throws InterruptedException
	{
		LP_elements.password.clear();
		Thread.sleep(2000);
		LP_elements.password.sendKeys(pwd);
	}
	public void clickSigninBtn()
	{
		LP_elements.loginButton.click();
	}
	public boolean verifycheckbox()
	{
		boolean checkboxStatus = LP_elements.chebox.isSelected();
		return checkboxStatus;
	}
	public void clickCheckbox()
	{
		LP_elements.chebox.click();
	}
	public String getCurrentUrl()
	{
		String CurrentURL = driver.getCurrentUrl();
		return CurrentURL;
	}
	
}
