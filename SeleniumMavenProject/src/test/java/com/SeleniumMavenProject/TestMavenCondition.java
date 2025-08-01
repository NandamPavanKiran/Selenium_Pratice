package com.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMavenCondition {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Sign in")).click();
		WebElement git_u_n=driver.findElement(By.id("login_field"));
		if(git_u_n.isDisplayed()) 
		{
			if(git_u_n.isEnabled())
			{
				git_u_n.sendKeys("nandampavankiran");
				System.out.println(git_u_n.getAttribute("value"));
				Thread.sleep(3000);
				git_u_n.clear();
			}else
			{
				 System.err.println("username is not enabled");
			}
		}
		else
		{
			System.err.println("username is not displayed");
		}
		
		driver.close();
		
	}

}
