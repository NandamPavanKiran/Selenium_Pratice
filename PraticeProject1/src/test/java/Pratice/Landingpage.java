package Pratice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTestPratice;

public class Landingpage extends BaseTestPratice{




@Test (priority = 1)
public void verify_first_img_product() throws Exception
	{

		driver.get("https://magento.softwaretestingboard.com/");
		
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
		
		WebElement firstimg=driver.findElement(By.xpath("//img[@Src='https://magento.softwaretestingboard.com/pub/media/wysiwyg/home/home-main.jpg']"));
		assert firstimg.isDisplayed();
		firstimg.click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("First image is displaying");



	
		
		WebElement  product_text1 = driver.findElement(By.xpath("//*[contains(text(),'New Luma')]"));
		String actual1=product_text1.getText();
		String expected1="New Luma Yoga Collection";
		if(actual1.equals(expected1))
		{
			System.out.println("New Luma Yoga Collection : Text is matching");
		}
		else
		{
			System.out.println("New Luma Yoga Collection : Text is not matching");
		}
		Thread.sleep(2000);
		WebElement product_text2=driver.findElement(By.xpath("(//*[@class='title'])[1]"));
		String actual2=product_text2.getText();
		String expected2="Get fit and look fab in new seasonal styles";
		if(actual2.equals(expected2)) 
		{
			System.out.println("Get fit and look fab in new seasonal styles : Text is matching");
		}
		else
		{
			System.out.println("Get fit and look fab in new seasonal styles : Textis not matching");
		}
		
//		firstimg.click();
//		Thread.sleep(5000);
//		driver.navigate().back();
//		
//		Thread.sleep(1000);
//		product_text1.click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		product_text2.click();
//	
		
		
Thread.sleep(4000);
		

		String[] adSelectors1 = {
	            "iframe",
	            ".ad",
	            ".adsbygoogle",
	            "#ad-banner",
	            ".sponsored",
	            ".popup", // generic popup class
	            ".newsletter" // newsletter popup
	        };

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;

	        for (String selector : adSelectors) {
	            String script = "document.querySelectorAll('" + selector + "').forEach(e => e.remove());";
	            js.executeScript(script);
	        }

	        System.out.println("Ad elements (if any) have been removed.");
	}
	
}


//
//String mainWindow = driver.getWindowHandle();
//Set<String>allWindows = driver.getWindowHandles();
//
//for(String window : allWindows) 
//{
//	if(!window.equals(mainWindow)) 
//	{
//		driver.switchTo().window(window);
//		driver.close();
//	}
//	
//}
//driver.switchTo().window(mainWindow);