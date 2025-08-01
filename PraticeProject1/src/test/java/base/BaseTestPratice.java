package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTestPratice {
	protected WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	
	
	@AfterMethod
	public void close_browser()
	{
		driver.quit();
	}
}
