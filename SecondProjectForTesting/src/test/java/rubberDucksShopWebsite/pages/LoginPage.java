package rubberDucksShopWebsite.pages;

import io.qameta.allure.Step;
import rubberDucksShopWebsite.elements.HeaderMenu;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class LoginPage {
    public HeaderMenu headerMenu;

    public LoginPage() {
        headerMenu = new HeaderMenu();
    }

    @Step("Login with credentials")
    public void attemptLogin(String email, String password) {
        $(getLocator("LoginPage.emailInput")).sendKeys(email);
        $(getLocator("LoginPage.passwordInput")).sendKeys(password);
        $(getLocator("LoginPage.loginButton")).click();
    }

    @Step("Validate login result message")
    public void validateMessage(String expectedMessage) {
        $(getLocator("LoginPage.message")).shouldBe(text(expectedMessage));
    }
}