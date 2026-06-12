package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        new LoginPage(driver)
                .enterUsername("admin")
                .enterPassword("admin123")
                .clickLogin();
    }
}
