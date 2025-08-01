package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdownSelect() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        DropdownPage dropdown = new DropdownPage(driver);
        dropdown.selectOption("Option 2");

        Assert.assertEquals(dropdown.getSelectedOption(), "Option 2");
    }
}
