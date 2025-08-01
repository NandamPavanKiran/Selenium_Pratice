package com.SeleniumMavenProject;

import javax.swing.text.Highlighter.Highlight;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMavenHilighted {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.getTitle();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(2000);
		
		highlight(driver,driver.findElement(By.tagName("h1")));
		Thread.sleep(2000);
		
		highlight(driver,driver.findElement(By.id("login_field")));
	
		Thread.sleep(2000);

		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(2000);
		
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(2000);
		
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(2000);
		
		highlight(driver, driver.findElement(By.xpath("//input[@value='Sign in']")));
		Thread.sleep(2000);
		
		highlight(driver, driver.findElement(By.xpath("//*[@id=\"login\"]/div[5]/webauthn-subtle/p/button/span/span")));
		
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.linkText("Create an account")));
		Thread.sleep(2000);
//		WebElement u_name=driver.findElement(By.id("login_field"));
//		u_name.sendKeys("pavan");
//		WebElement pwd=driver.findElement(By.id("password"));
//		pwd.sendKeys("kiran");
		
		
		driver.close();
				
	}
	public static void highlight(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid green; background: skyblue;');", element);
	}


}
