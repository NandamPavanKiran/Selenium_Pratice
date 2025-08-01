package Pratice.Demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import browser.BrowserDemoshop;

public class Electronics extends BrowserDemoshop
{
	@Test
	public void electronic() throws Exception 
	{
		driver.get("https://demowebshop.tricentis.com/");
		adds();
		
		WebElement ele = driver.findElement(By.linkText("Electronics"));
		highlight(driver, ele);
		System.out.println(ele.getText());
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

		Thread.sleep(2000);
		
//		WebElement cam_pho = driver.findElement(By.linkText("Camera, photo"));
//		System.out.println(cam_pho.getText());
		
		try 
		{
			WebElement cam_pho = driver.findElement(By.linkText("Camera, photo"));
		} catch (NoSuchElementException e) {
			System.out.println("Error Message displaying as :" + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
//	//	WebElement cam_phot = driver.findElement(By.linkText("Camera, photo"));
//		WebElement cam_pho = driver.findElement(By.linkText("Camera, photo"));
//
//		System.out.println(cam_pho.getText());
//		highlight(driver, cam_pho);
//		
//		
//		try 
//		{
//			cam_pho = driver.findElement(By.linkText("Camera, photo"));
//			cam_pho.click();
//		
//		} catch (NoSuchElementException e) 
//		{
//			System.out.println("No such element exception : " + e.getMessage());
//		}
//
//		
//		
//		WebElement cam_pho = driver.findElement(By.linkText("Camera,photos"));
//		WebElement cell_phn = driver.findElement(By.linkText("Cell phones"));
//		
//		System.out.println(cam_pho.getText());
//		System.out.println(cell_phn.getText());
//		
//		highlight(driver, cam_pho);
//		highlight(driver, cell_phn);
//		
//		try {
//			cam_pho.click();
//		} catch (StaleElementReferenceException e) {
//			driver.findElement(By.xpath("//a[contains(text(),'Camera, photo')]"));
//			cam_pho.click();
//		}
//		WebElement cam = driver.findElement(By.xpath("//h1[contains(text(),'Camera, photo')]"));
//		highlight(driver,cam);
//		System.out.println(cam.getText());
//		
//		
//		try {
//			cell_phn.click();
//		} catch (StaleElementReferenceException e) {
//			driver.findElement(By.xpath("//a[contains(text(),' Cell phones')]"));
//			cell_phn.click();
//		}
//		
//		
	} 
}
