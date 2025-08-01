package Pratice.Demowebshop;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import browser.BrowserDemoshop;

public class ComputerLink extends BrowserDemoshop
{
	@Test
	public void computer() throws Exception 
	{
		driver.get("https://demowebshop.tricentis.com/");
		adds();
		
		
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		highlight(driver, computers);
		System.out.println(computers.getText());
					
		Actions action = new Actions(driver);
		action.moveToElement(computers).pause(Duration.ofSeconds(2)).perform();
		waittime();

		    WebElement desktop = driver.findElement(By.linkText("Desktops"));
		    WebElement notebook = driver.findElement(By.linkText("Notebooks"));
		    WebElement accessories = driver.findElement(By.linkText("Accessories"));
		    
		    highlight(driver, desktop);
		    Thread.sleep(3000);
		    highlight(driver, notebook);
		    Thread.sleep(3000);
		    highlight(driver, accessories);
		    Thread.sleep(3000);
		    System.out.println(desktop.getText());
		    System.out.println(notebook.getText());
		    System.out.println(accessories.getText());
		    Thread.sleep(3000);		
		    
		    try 
		    {
		    	desktop.click();
		    }
		    catch (StaleElementReferenceException e) 
		    {
		    	desktop = driver.findElement(By.linkText("Desktops"));
		    	desktop.click();
		    	
			}
		    WebElement desk = driver.findElement(By.xpath("//h1[contains(text(),'Desktops')]"));
		    System.out.println(desk.getText());
		    highlight(driver, desk);
		    driver.navigate().to("https://demowebshop.tricentis.com/");
		    Thread.sleep(3000);
		    driver.navigate().back();
		    Thread.sleep(3000);
		    
// This is for StaleElementReferenceException: stale element reference: stale element not found

		    
		    try 
		    {
		    	notebook.click();	
			} 
		    catch (StaleElementReferenceException e) 
		    {
		    	notebook = driver.findElement(By.linkText("Notebooks"));
		    	notebook.click();
			}
		    WebElement note = driver.findElement(By.xpath("//h1[contains(text(),'Notebooks')]"));
		    System.out.println(note.getText());
		    
		    Thread.sleep(3000);
		    highlight(driver, note);
		    
		    driver.navigate().to("https://demowebshop.tricentis.com/");
		    Thread.sleep(3000);
		    driver.navigate().back();
		
		    
		    try 
		    {
				accessories.click();
			} 
		    catch (StaleElementReferenceException e) 
		    {
		    	accessories = driver.findElement(By.linkText("Accessories"));
		    	Thread.sleep(2000);
		    	accessories.click();
			}
		    WebElement acc = driver.findElement(By.xpath("//h1[contains(text(),'Accessories')]"));
		    System.out.println(acc.getText()); 
		    highlight(driver, acc);
		    
		    driver.navigate().back();
		    
		    
		    
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		    By subMenu = By.xpath("//ul[@class='sublist firstLevel']/li/a");
//		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(subMenu));
//			
//		    try {
//		    	wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//			    subMenu = By.xpath("//ul[@class='sublist firstLevel']/li/a");
//			    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(subMenu));
//			    
//			} 
//		    catch (org.openqa.selenium.TimeoutException e) 
//		    {
//		    	System.out.println("Element not found within the timeline : " + e.getMessage());
//			}
//		    
//		    
//		    
//		    List<WebElement> subLinks = driver.findElements(subMenu);
//		    System.out.println("Sub-links under COMPUTERS:");
//
//		for (WebElement ele : subLinks) 
//		{
//			System.out.println(ele.getText());
//		}
//		
		
	}
}
