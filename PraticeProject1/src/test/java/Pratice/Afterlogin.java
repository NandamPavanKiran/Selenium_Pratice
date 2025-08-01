package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTestPratice;

public class Afterlogin extends BaseTestPratice{

	@Test
	public void login() throws Exception
	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jbXMvbm9yb3V0ZS9pbmRleC8%2C/");
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("pavankiran690@gmail.com");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Pass#123");
		Thread.sleep(2000);
		WebElement Submit = driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]"));
		Submit.click();
		Thread.sleep(5000);
		
	}
	
	
}
