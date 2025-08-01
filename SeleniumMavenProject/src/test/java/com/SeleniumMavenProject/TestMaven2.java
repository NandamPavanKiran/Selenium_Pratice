package com.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMaven2 {
 
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		Thread.sleep(5000);
//		WebElement git=driver.findElement(By.partialLinkText("Sign in"));
//		git.click();												//       method 1 initializing object for multiple use 
		driver.findElement(By.partialLinkText("Sign in")).click();//method 2 is direct when we use single operation
		Thread.sleep(2000);
		WebElement git=driver.findElement(By.id("login_field"));
		git.click();
		git.sendKeys("nandampavankiran@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pavan@703");
		Thread.sleep(5000);
		driver.close();
	}

}
