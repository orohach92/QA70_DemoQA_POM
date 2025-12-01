package com.demoqa.pages.bookstore;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "userName")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    public LoginPage enterUserData(String name, String passwort) {
        type(userNameInput,name);
        type(passwordInput,passwort);
        return this;
    }
@FindBy(id = "login")
WebElement loginButton;
    public ProfilePage clickOnLoginButton() {
        click(loginButton);
        return new ProfilePage(driver);
    }
}
