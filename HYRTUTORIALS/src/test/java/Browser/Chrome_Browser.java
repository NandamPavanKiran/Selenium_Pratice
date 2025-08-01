package Browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v136.page.model.NavigatedWithinDocument;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Chrome_Browser {

	public WebDriver driver;
	@BeforeTest
	public void brower()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void add() 
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

	
	
	
	@AfterTest
	public void tear()
	{
		driver.quit();
	}
	 
}
