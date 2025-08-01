//package com.SeleniumMavenProject;
//
//import java.sql.Driver;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestMaven1 {
//
//	public static void main(String args[]) throws Exception 
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Selenium")).click();
//		WebElement popup = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[7]/a"));
//		popup.click();
//		popup.findElement(By.xpath("//*[@id=\"card\"]")).click();	
//		Thread.sleep(3500);
//		//driver.close();
//	}
//	
//}

package com.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMaven1 {

    public static void main(String args[]) throws Exception {
    	WebDriverManager.chromedriver().clearDriverCache().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");
        Thread.sleep(3000);
        
        // Remove advertisements using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var ads = document.querySelectorAll('[id*=google_ads], .adsbygoogle, .ad-banner, .advertisement'); ads.forEach(ad => ad.remove());");
        
        driver.findElement(By.partialLinkText("Selenium")).click();
        Thread.sleep(2000);
        
        WebElement popup = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[7]/a"));
        popup.click();
        Thread.sleep(2000);
        
        popup.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[7]/a")).click();    
        Thread.sleep(1500);
        
        highlight(driver, driver.findElement(By.xpath("//h1[@itemprop]")));
        Thread.sleep(2000);
        
        highlight(driver, driver.findElement(By.xpath("//h1[@align]")));
        Thread.sleep(2000);
        
        highlight(driver, driver.findElement(By.xpath("//div[contains(text(),'In HTML we have some basic controls')]")));
        Thread.sleep(2000);
        
        highlight(driver,driver.findElement(By.xpath("//*[contains(text(),'Textbox')]")));
        Thread.sleep(2000);
        
        highlight(driver,driver.findElement(By.xpath("//*[contains(text(),'Radiobutton')]")));
        Thread.sleep(2000);
        
        highlight(driver,driver.findElement(By.xpath("//*[contains(text(),'Checkbox')]")));
        Thread.sleep(2000);
        
        highlight(driver,driver.findElement(By.xpath("//*[contains(text(),'Link')]")));
        Thread.sleep(2000);
        
        highlight(driver,driver.findElement(By.xpath("//*[contains(text(),'Button')]")));
        Thread.sleep(2000);
        
        highlight(driver,driver.findElement(By.xpath("//*[contains(text(),'Label')]")));
        Thread.sleep(2000);
        
        //First Name
        highlight(driver, driver.findElement(By.xpath("//label[1]")));
        Thread.sleep(2000);
        
        WebElement txt = driver.findElement(By.className("bcTextBox"));
        highlight(driver, txt);
        //TestMaven1.highlight(driver, driver.findElement(By.className("bcTextBox")));
        txt.click();
        txt.sendKeys("pavan");
        
        //Second Name
        highlight(driver, driver.findElement(By.xpath("//label[2]")));
        Thread.sleep(2000);
        
        WebElement txt1 = driver.findElement(By.name("lName"));
        highlight(driver, txt1);
        txt1.click();
        txt1.sendKeys("kiran");
        
        //Gender
        highlight(driver, driver.findElement(By.xpath("//label[3]")));
        Thread.sleep(2000);
        
        WebElement txt2=driver.findElement(By.xpath("//input[@type='radio']"));
        highlight(driver, txt2);
        if(By.xpath("//*[@name='gender'][1]")!=null) 
        {
        	txt2.findElement(By.xpath("//*[@name='gender'][1]"));
        	
        }else if(By.xpath("//*[@name='gender'][2]")!=null)
        {
        	txt2.findElement(By.xpath("//*[@name='gender'][2]")).click();
        }
        else
        {
        	System.err.println("Please click on gender radio button");
        }
        
        txt2.click();
        
        highlight(driver, driver.findElement(By.xpath("//label[4]")));
        Thread.sleep(2000);
        
        highlight(driver, driver.findElement(By.xpath("//label[5]")));
        Thread.sleep(2000);
        
        highlight(driver, driver.findElement(By.xpath("//label[6]")));
        Thread.sleep(2000);
        
      //  highlight(driver, driver.findElement(By.xpath("")));
        driver.close();
    }
    public static void highlight(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid green; background: skyblue;');", element);
	}
}
