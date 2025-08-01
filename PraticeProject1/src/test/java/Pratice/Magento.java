package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTestPratice;

public class Magento extends BaseTestPratice{
	
@Test(priority = 0) 
public void magento_landing_page() throws Exception 
	{
	driver.get("https://magento.softwaretestingboard.com/");
	System.out.println(driver.getTitle());
	WebElement logo = driver.findElement(By.xpath("//a[@class='logo']"));
	boolean isDisplayed=logo.isDisplayed();
	
	if(isDisplayed)
	{
		System.out.println("Logo has been displaying");
	}
	else
	{
		System.out.println("Logo is not displaying");
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


}