package Pratice.HYRTUTORIALS;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Browser.Chrome_Browser;

public class Selenium_Practice extends Chrome_Browser {

	@Test
	public void selenium() throws Exception
	{
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.getTitle();
		
		WebElement selenium = driver.findElement(By.partialLinkText("Practice"));

		System.out.println(selenium.getText());
		
		Actions action =new Actions(driver);
		action.moveToElement(selenium).perform();
		
		WebElement Broken_Link = driver.findElement(By.linkText("Broken Links"));
		
		System.out.println(Broken_Link.getText());
		Thread.sleep(2000);
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(Broken_Link).perform();
		
		WebElement Contact = driver.findElement(By.linkText("Contact"));
		System.out.println(Contact.getText());
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(Contact).perform();
		
		WebElement text = driver.findElement(By.id("news"));
		System.out.println(text.getText());
		
		
		
		Thread.sleep(3000);
		
	}

//	@Test
//	public void callbothcalss() throws Exception 
//	{
//		WebSite_Landing_Page landingpage =new WebSite_Landing_Page();
//		landingpage.driver = this.driver();		
//		landingpage.hvr();
//	
//		Youtube_Courses youtube  = new Youtube_Courses();
//		youtube.driver = this.driver();		
//		youtube.youtube_courses();
//		
//	}

	

}

