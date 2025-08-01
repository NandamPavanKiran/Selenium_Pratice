package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTestPratice;




public class Create_New_Account_Link extends BaseTestPratice {

	
	//Highlighted Text code
	
	public static void highlight(WebDriver driver, WebElement element) 
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid yellow; background: skyblue;');", element);
	}
	
	public static void highlight1(WebDriver driver, WebElement element) 
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid green; background: blue;');", element);
	}
	
	@Test(priority = 4)
	public void create_acc_page() throws Exception  
		{
			driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		
	//Create New Customer Account Text		
			
			String actual = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
			String expected ="Create New Customer Account";
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")));
			Thread.sleep(1000);
			
			

			if(actual.equals(expected))
			{
				System.out.println("Create New Customer Account Text is matched !");
			}
			else 
			{
				System.out.println("Create New Customer Account Text is not matched");
			}
			
			
			
//  Personal Information Text
			
			WebElement Personal_info=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[1]/legend/span"));	
			Assert.assertEquals(Personal_info.getText(), "Personal Information");
			if(Personal_info.equals(Personal_info))
			{
				System.out.println("Personal Information");
			}
			Thread.sleep(1000);

// Highlighted text
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[1]/legend/span")));
			Thread.sleep(1000);
			
//First Name text

			WebElement F_Name=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[1]/div[1]/label/span"));
			Assert.assertTrue(F_Name.isDisplayed(), "First Name");
			if(F_Name.equals(F_Name))
			{
				System.out.println("First Name is displaying");
			}		
			
// Highlighted text

			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[1]/div[1]/label/span")));
			Thread.sleep(1000);
			
//First Name Input Text 
			
			WebElement F_Name_Text = driver.findElement(By.id("firstname"));
			F_Name_Text.sendKeys("Sai");
			System.out.println("Entered First Name :" + F_Name_Text.getAttribute("value"));

// Highlighted text			
			
			highlight1(driver,driver.findElement(By.id("firstname")));
			Thread.sleep(1000);
			
//Last Name text 

			WebElement L_Name=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[1]/div[2]/label/span"));
			Assert.assertTrue(L_Name.isDisplayed(), "Last Name");
			if(L_Name.equals(L_Name))
			{
				System.out.println("Last Name is displaying");
			}
			
// Highlighted Text 
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[1]/div[2]/label/span")));
			Thread.sleep(1000);
			
// Last Name Input Text
			
			WebElement L_Name_Text=driver.findElement(By.id("lastname"));
			L_Name_Text.sendKeys("Pandu");
			System.out.println("Entered Last Name :" + L_Name_Text.getAttribute("value"));
			
// Highlighted Text			
			
			highlight1(driver,driver.findElement(By.id("lastname")));
			Thread.sleep(1000);
			
//Sign-in Information text 
			
			WebElement SignInfo_Text =driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/legend/span"));
			Assert.assertTrue(SignInfo_Text.isDisplayed(),"Sign-in Information");
			if(SignInfo_Text.equals(SignInfo_Text)) 
			{
				System.out.println("Sign-in Information");
			}
			
// Highlighted Text	for Sign-in		
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/legend/span")));
			Thread.sleep(1000);
			
//Email with Text
			
			WebElement Email_id= driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[1]/label/span"));
			Assert.assertTrue(Email_id.equals(Email_id));
			System.out.println("Email id : " + Email_id.getText());
			
// Highlighted Text	for Email Text		
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[1]/label/span")));
			Thread.sleep(1000);
			
// Email Input Text			
			
			WebElement Email_id_Text=driver.findElement(By.id("email_address"));
			Email_id_Text.sendKeys("pavankiran690@gmail.com");
			Assert.assertTrue(Email_id_Text.equals(Email_id_Text));
			Assert.assertFalse(driver.findElement(By.xpath("//input[@id='email_address']")).getText().contains("*"));
			System.out.println("Entered email id :" + Email_id_Text.getAttribute("value"));
			
// Highlighted Text	for Email Input Text			
			
			highlight1(driver,driver.findElement(By.id("email_address")));
			Thread.sleep(1000);
			
//Password Text and password input text
			String actual2=	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[2]/label/span")).getText();
			String expected2="Password";
			if(actual2.equals(expected2))
			{
				System.out.println("Password text is matched");
			}else
			{
				System.out.println("Password is not matched");
			}
			
// Highlighted Text for Password Text
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[2]/label/span")));
			Thread.sleep(1000);
			
			
			WebElement pass_Text=driver.findElement(By.id("password"));
			pass_Text.sendKeys("Pass@123");
			Assert.assertTrue(pass_Text.equals(pass_Text));
			System.out.println("Entered password :" + pass_Text.getAttribute("value"));
			
// Highlighted Text for Password Input Text			
			
			highlight1(driver,driver.findElement(By.id("password")));
			Thread.sleep(1000);
			
			
			WebElement disp_pwd_strength = driver.findElement(By.id("password-strength-meter"));
			//WebElement disp_pwd_text = driver.findElement(By.id("password-strength-meter-label"));
			disp_pwd_strength.isDisplayed();
			//disp_pwd_text.isDisplayed();
			
			System.out.println("Password Strength :"+ disp_pwd_strength.getText());
			//System.out.println("Pwd Text :" + disp_pwd_text.getText());
			
// Highlighted Text for Password Error Text Message			
			
			highlight(driver,driver.findElement(By.id("password-strength-meter")));
			Thread.sleep(1000);
			
			
			
// Confirm password Text
			
			WebElement Cnf_pwd = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[3]/label/span"));
			Cnf_pwd.isDisplayed();
			Assert.assertTrue(Cnf_pwd.equals(Cnf_pwd));
			System.out.println("Confirm Pwd :" + Cnf_pwd.getText());
			
// Highlighted Text for Confirm Password			
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[3]/label/span")));
			Thread.sleep(1000);
			
			
			WebElement cnf_pwd_input =driver.findElement(By.id("password-confirmation"));
			cnf_pwd_input.sendKeys("Pass@123");
			cnf_pwd_input.isDisplayed();
			System.out.println("Entered text is:" + cnf_pwd_input.getAttribute("value"));
			
// Highlighted text for Confirm Password input text			
			
			highlight1(driver,driver.findElement(By.id("password-confirmation")));
			Thread.sleep(1000);
			
// Create button 			
			
			WebElement Create_btn= driver.findElement(By.xpath("//button[@class='action submit primary']"));
			Assert.assertTrue(Create_btn.isDisplayed(),"Create Account button should be visiable");
			Assert.assertEquals(Create_btn.getText().trim(),"Create an Account" );
			System.out.println("Create button : " + Create_btn.getText());
	
// Create button Text 			
			
			highlight(driver,driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")));
			Thread.sleep(1000);
			
			
			Create_btn.click();
			
			
			
// Confirm Password error message
			WebElement Created_account = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"));
			System.out.println(Created_account.getText());
			
			
			WebElement Cnf_error_msg = driver.findElement(By.xpath("//*[@id=\"password-confirmation-error\"]"));
			//Assert.assertTrue(Cnf_error_msg.isDisplayed(),"Please enter the same value again.");
			//Assert.assertEquals(Cnf_error_msg.getText().trim(), "Please enter the same value again.");
			System.out.println("Error Message :" + Cnf_error_msg.getAttribute("value"));
			
			highlight(driver,driver.findElement(By.id("password-confirmation-error")));
			Thread.sleep(2000);
			
			
			if(pass_Text==cnf_pwd_input)
			{
				System.out.println("Password is matched");
			}
			else 
			{
				System.out.println("Password is not matched");
			}
			
			
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
	

	//This is for to test error messages
	
	@Test(priority = 3)
	public void create_error() throws InterruptedException 

	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		WebElement Create_button_click = driver.findElement(By.xpath("//button[@class='action submit primary']"));
		Create_button_click.click();
		Thread.sleep(3000);
		
		String[][] errorfields= {
				 	{"firstname-error", "This is a required field."},
			        {"lastname-error", "This is a required field."},
			        {"email_address-error", "This is a required field."},
			        {"password-error", "This is a required field."},
			        {"password-confirmation-error", "This is a required field."}
		};
		for(String[] 	error:errorfields) {
			WebElement errorelement =driver.findElement(By.id(error[0]));
			Assert.assertTrue(errorelement.isDisplayed(),error[0]+"should be displayed");
			Assert.assertEquals(errorelement.getText().trim(),error[1],error[0] +"Text should match" );
			System.out.println("Error validated for field :"  + error[0] + "->"+ errorelement.getText());
		}
	}
	
}





