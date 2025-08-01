package Pratice.HYRTUTORIALS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Browser.Chrome_Browser;

public class Youtube_Courses extends Chrome_Browser{

	
	@Test(priority = 2)
	public void youtube_courses() throws Exception
	{
		driver.get("https://www.hyrtutorials.com/");
		driver.getTitle();
		add();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("YouTube Courses"))).perform();
		
		WebElement English = driver.findElement(By.linkText("English"));
		System.out.println(English.getText());
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(English).perform();
		
		WebElement Telugu = driver.findElement(By.linkText("Telugu"));
		System.out.println(Telugu.getText());
		
		Actions action2 = new Actions(driver);
		action1.moveToElement(Telugu).perform();
		
		Thread.sleep(2000);
	
	}
		
}
