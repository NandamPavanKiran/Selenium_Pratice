package browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserDemoshop {
	public WebDriver driver;
		
	@BeforeTest
	public void browser() {
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public void adds()
	{
		String[] adSelectors = {
	            "iframe",
	            ".ad",
	            ".adsbygoogle",
	            "#ad-banner",
	            ".sponsored",
	            ".popup", // generic popup class
	            ".newsletter" // newsletter popup
	        };

			
		
			JavascriptExecutor js = (JavascriptExecutor) driver;

	        for (String selector : adSelectors) {
	            String script = "document.querySelectorAll('" + selector + "').forEach(e => e.remove());";
	            js.executeScript(script);
	        }

	        System.out.println("Ad elements (if any) have been removed.");
	        
	        
	        
	}

	
	public void time() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void waittime() throws Exception {
		Thread.sleep(3000);
	}
	
	public static void highlight(WebDriver driver, WebElement element) 
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid green; background: blue;');", element);
	}
	
	
	@AfterTest
	public void close() {
	
		driver.quit();
	}
}
