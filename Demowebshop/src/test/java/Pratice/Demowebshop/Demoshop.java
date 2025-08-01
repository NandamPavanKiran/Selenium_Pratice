package Pratice.Demowebshop;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import browser.BrowserDemoshop;

public class Demoshop extends BrowserDemoshop {

	@Test
	public void demowebshop() throws Exception 
	{
		adds();
		waittime();
		time();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement book =driver.findElement(By.linkText("BOOKS"));
		highlight(driver, book);
		System.out.println(book.getText());
		book.click();

		WebElement sort = driver.findElement(By.xpath("//span[contains(text(),'Sort by')]"));
		System.out.println(sort.getText());
		highlight(driver, sort);
		
		Thread.sleep(2000);
		driver.get(driver.getCurrentUrl());
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-orderby")));

		
		
		WebElement position = driver.findElement(By.id("products-orderby"));
	//  position.click();
		Select booksortdropdown = new Select(position);
		Thread.sleep(2000);
		
		
		List<WebElement> booksortdropdownkoption = booksortdropdown.getOptions();
		for (WebElement booksortoptions : booksortdropdownkoption) 
		{
			System.out.println(booksortoptions.getText());
		}
		
		booksortdropdown.selectByIndex(1);
		Thread.sleep(4000);
//	Getting error as 	stale element reference: stale element not found

		
//		booksortdropdown.selectByValue("Price: Low to High");
//		Thread.sleep(4000);
//		booksortdropdown.selectByVisibleText("Name: Z to A");
//		Thread.sleep(4000);
//		booksortdropdown.selectByVisibleText("Price: Low to High");
//		Thread.sleep(4000);
//		booksortdropdown.selectByIndex(5);
//		Thread.sleep(4000);
		
		
		
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		highlight(driver, computers);
		System.out.println(computers.getText());
					
		Actions action = new Actions(driver);
		action.moveToElement(computers).pause(Duration.ofSeconds(2)).perform();
		
	    WebElement desktop = driver.findElement(By.linkText("Desktops"));
	    WebElement notebook = driver.findElement(By.linkText("Notebooks"));
	    WebElement accessories = driver.findElement(By.linkText("Accessories"));
	    
	    highlight(driver, desktop);
	    highlight(driver, notebook);
	    highlight(driver, accessories);
	    
	    System.out.println(desktop.getText());
	    System.out.println(notebook.getText());
	    System.out.println(accessories.getText());
		
		WebElement electronics = driver.findElement(By.linkText("ELECTRONICS"));
		highlight(driver, electronics);
		System.out.println(electronics.getText());
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(electronics).perform();
	
		WebElement cam_pho = driver.findElement(By.linkText("Camera, photo"));
		WebElement cell_phone = driver.findElement(By.linkText("Cell phones"));
		
		highlight(driver, cam_pho);
		highlight(driver, cell_phone);
		
		System.out.println(cam_pho.getText());
		System.out.println(cell_phone.getText());
		
		WebElement app_shoe = driver.findElement(By.partialLinkText("APPAREL"));
		WebElement digidown = driver.findElement(By.partialLinkText("DIGITAL"));
		WebElement jewel = driver.findElement(By.partialLinkText("JEWE"));
		WebElement giftcard = driver.findElement(By.partialLinkText("GIFT"));
		
		highlight(driver,digidown);
		highlight(driver, jewel);
		highlight(driver, app_shoe);
		highlight(driver, giftcard);
		
		System.out.println(digidown.getText());
		System.out.println(jewel.getText());
		System.out.println(app_shoe.getText());
		System.out.println(giftcard.getText());
		
		WebElement Category = driver.findElement(By.xpath("//strong[contains(text(),'Categories')]"));
		System.out.println(Category.getText());
		highlight(driver, Category);
		
		
	}	    
}
