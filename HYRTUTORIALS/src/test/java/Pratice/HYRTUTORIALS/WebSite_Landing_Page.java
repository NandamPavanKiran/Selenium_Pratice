package Pratice.HYRTUTORIALS;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Browser.Chrome_Browser;

public class WebSite_Landing_Page extends Chrome_Browser
{
	@Test(priority = 1)
	public void hvr() throws InterruptedException 
	{
		//Go to WEBSITE
		
		driver.get("https://www.hyrtutorials.com/"); 
		System.out.println(driver.getTitle());
		
		//add() is calling from Chrome_Browser
		add();

		//Click on TECH News 
		WebElement TECHNews = driver.findElement(By.linkText("Tech News"));
		TECHNews.click();
		System.out.println(TECHNews.getText());
		
		
		//This is for to navigate back to home page
		driver.navigate().to("https://www.hyrtutorials.com/");
		driver.navigate().back();
		driver.navigate().forward(); 
		Thread.sleep(2000);
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Tutorials"))).perform();
		
		WebElement DotNet = driver.findElement(By.linkText("Dot Net"));
		System.out.println(DotNet.getText());
		
		WebElement SQL= driver.findElement(By.linkText("SQL"));
		System.out.println(SQL.getText());
		
		WebElement Java = driver.findElement(By.linkText("Java"));
		System.out.println(Java.getText());
		
		WebElement Testing= driver.findElement(By.linkText("Testing"));
		System.out.println(Testing.getText());
		
		Actions action1 = new Actions(driver);
		action.moveToElement(Testing).perform();
		
		WebElement Selenium = driver.findElement(By.partialLinkText("Selen"));
		System.out.println(Selenium.getText());
		
		WebElement AutomationTesting = driver.findElement(By.partialLinkText("Automation"));
		System.out.println(AutomationTesting.getText());
		
		WebElement Other = driver.findElement(By.linkText("Other"));
		System.out.println(Other.getText());
		
		
		
		Thread.sleep(2000);
		
	}
	
	
}
