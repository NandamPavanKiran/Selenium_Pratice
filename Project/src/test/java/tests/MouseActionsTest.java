package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HoverPage;

public class MouseActionsTest extends BaseTest {

    @Test
    public void testHoverAction() {
        driver.get("https://the-internet.herokuapp.com/hovers");

        HoverPage hover = new HoverPage(driver);
        String caption = hover.hoverOverFirstImage();

        Assert.assertTrue(caption.contains("user1"));
    }
}