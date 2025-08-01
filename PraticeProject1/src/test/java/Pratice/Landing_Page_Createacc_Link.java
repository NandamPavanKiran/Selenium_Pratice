package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTestPratice;

public class Landing_Page_Createacc_Link extends BaseTestPratice {


@Test(priority = 2)
public void create_button() throws InterruptedException 
	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		WebElement click_createacc =driver.findElement(By.xpath("(//*[contains(text(),'Create')])[1]"));
		System.out.println(click_createacc.getText());
		click_createacc.click();
	
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

	
}
