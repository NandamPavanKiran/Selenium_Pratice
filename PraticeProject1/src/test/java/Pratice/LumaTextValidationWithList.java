package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LumaTextValidationWithList {
    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the URL (from your image)
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @Test
    public void validateAllTexts() {
        // 1. Create New Customer Account
        WebElement title = driver.findElement(By.cssSelector("h1.page-title span"));
        Assert.assertEquals(title.getText().trim(), "Create New Customer Account");

        // 2. Personal Information
        WebElement personalInfo = driver.findElement(By.xpath("//div[contains(text(),'Personal Information')]"));
        Assert.assertEquals(personalInfo.getText().trim(), "Personal Information");

        // 3. First Name
        WebElement firstNameLabel = driver.findElement(By.xpath("//label[@for='firstname']"));
        Assert.assertEquals(firstNameLabel.getText().trim(), "First Name");

        // 4. Last Name
        WebElement lastNameLabel = driver.findElement(By.xpath("//label[@for='lastname']"));
        Assert.assertEquals(lastNameLabel.getText().trim(), "Last Name");

        // 5. Sign-in Information
        WebElement signInInfo = driver.findElement(By.xpath("//div[contains(text(),'Sign-in Information')]"));
        Assert.assertEquals(signInInfo.getText().trim(), "Sign-in Information");

        // 6. Email
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email_address']"));
        Assert.assertEquals(emailLabel.getText().trim(), "Email");

        // 7. Password
        WebElement passwordLabel = driver.findElement(By.xpath("//label[@for='password']"));
        Assert.assertEquals(passwordLabel.getText().trim(), "Password");

        // 8. Password Strength: No Password
        WebElement passwordStrength = driver.findElement(By.id("password-strength-meter-label"));
        Assert.assertEquals(passwordStrength.getText().trim(), "Password Strength: No Password");

        // 9. Confirm Password
        WebElement confirmPasswordLabel = driver.findElement(By.xpath("//label[@for='password-confirmation']"));
        Assert.assertEquals(confirmPasswordLabel.getText().trim(), "Confirm Password");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
