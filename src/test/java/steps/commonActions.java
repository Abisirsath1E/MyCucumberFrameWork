package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class commonActions //Hook class
{
	WebDriver driver;
	@Before 
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Oct22\\driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 //cooking clear
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	public WebDriver getDriver()
	{
		return driver;
	}
}
