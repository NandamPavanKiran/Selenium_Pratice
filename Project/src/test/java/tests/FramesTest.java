package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FramesPage;

public class FramesTest extends BaseTest {

    @Test
    public void testFrameText() {
        driver.get("https://the-internet.herokuapp.com/iframe");

        FramesPage frame = new FramesPage(driver);	
        String text = frame.getIFrameText();

        Assert.assertTrue(text.contains("Your content"));
    }
}
