package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTestPratice;

public class SignIn extends BaseTestPratice{

@Test(priority = 5)
public void sign_in() throws Exception
	{
		driver.get("https://magento.softwaretestingboard.com/");
		WebElement click_signin=driver.findElement(By.xpath("(//*[contains(text(),'Sign In')])[1]"));
		System.out.println(click_signin.getText());
		click_signin.click();
		Thread.sleep(4000);

		String[] adSelectors = {
	            "iframe",
	            ".ad",
	            ".adsbygoogle",
	            "#ad-banner",
	            ".sponsored",
	            ".popup", // generic popup class
	            ".newsletter" // newsletter popup
	        };

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        for (String selector : adSelectors) {
	            String script = "document.querySelectorAll('" + selector + "').forEach(e => e.remove());";
	            js.executeScript(script);
	        }

	        System.out.println("Ad elements (if any) have been removed.");
	}

@Test(priority = 0)
	public void loginvalidationwithloop() throws InterruptedException 
	{	
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		String[][] credentials =
				{
						{"",""},									// Without input
						{"pavankiran690gmail.com","Pass99897"},    //  Invalid Email 
						{"kiran810@gmail.com","pass*123"},			// Incorrect inputs
						{"pavankiran690@gmail.com","Pass@123"}		// Valid Inputs
				//		
				};
		for(int i=0; i< credentials.length;i++)
		{
			WebElement Email=driver.findElement(By.id("email"));
			WebElement Password = driver.findElement(By.id("pass"));
			WebElement Signin=driver.findElement(By.id("send2"));
			
			Email.clear();
			Password.clear();
			
			Email.sendKeys(credentials[i][0]);
			Password.sendKeys(credentials[i][1]);
			Signin.click();
			Thread.sleep(2000);
			
			System.out.println("Test Case" + (i+1)  + "||Email ->" + credentials[i][0]  + "||Password ->" + credentials[i][1] );
			
			if(credentials[i][0].isEmpty() && credentials[i][1].isEmpty()) 
			{
				WebElement email_error = driver.findElement(By.id("email-error"));
				WebElement pass_error= driver.findElement(By.id("pass-error"));
						
				Assert.assertEquals(email_error.getText(), "This is a required field.");
				Assert.assertEquals(pass_error.getText(), "This is a required field.");
				System.out.println("Validation passed : Empty fields");	
			}
			else if(!credentials[i][0].contains("@"))
			{
				WebElement email_error = driver.findElement(By.id("email-error"));
				Assert.assertEquals(email_error.getText(), "Please enter a valid email address (Ex: johndoe@domain.com).");
				System.out.println("Validation Passed: Invalid Email Id");
			}
//			else if(!credentials[i][1].contains("WrongUser")) 
//			{
//				WebElement err_message=driver.findElement(By.cssSelector("div.message-error div"));
//				Assert.assertFalse(err_message.getText().contains("The account signin was incorrect"));
//				Assert.assertTrue(err_message.getText().contains("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."));
//				System.out.println("Validation Passed: Invalid Credentails");
//			}
			else
			{
				WebElement login_message= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]"));
				Assert.assertTrue(login_message.isDisplayed(),"Login Success");
				Assert.assertFalse(login_message.getText().contains("Welcome"));
				System.out.println("Validation passed : Successful Login");
				break;
			}
			

            driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		}
	}

}