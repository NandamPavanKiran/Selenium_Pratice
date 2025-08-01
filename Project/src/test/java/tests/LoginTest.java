package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.DataProviders;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void loginTest(String username, String password, String expected) {
        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage login = new LoginPage(driver);
        login.login(username, password);
        String message = login.getMessage();

        if (expected.equals("success")) {
            Assert.assertTrue(message.contains("secure area"));
        } else {
            Assert.assertTrue(message.contains("invalid"));
        }
    }
}