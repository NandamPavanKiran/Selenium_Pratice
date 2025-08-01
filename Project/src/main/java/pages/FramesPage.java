package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver;
    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getIFrameText() {
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.id("tinymce")).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}
