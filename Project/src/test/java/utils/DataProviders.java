package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"tomsmith", "SuperSecretPassword!", "success"},
            {"tomsmith", "wrongpass", "fail"},
        };
    }
}
