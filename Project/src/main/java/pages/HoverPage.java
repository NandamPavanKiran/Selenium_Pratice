package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;
    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public String hoverOverFirstImage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(By.className("figure")).get(0)).perform();
        return driver.findElements(By.className("figcaption")).get(0).getText();
    }
}
