package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {

    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login")
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public LoginPage enterUsername(String user) {
        username.sendKeys(user);
        return this;
    }

    public LoginPage enterPassword(String pass) {
        password.sendKeys(pass);
        return this;
    }

    public HomePage clickLogin() {
        loginBtn.click();
        return new HomePage();
    }
}