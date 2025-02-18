package rubberDucksShopWebsite;

import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.LoginPage;

public class LoginPageTest extends TestBase {
    private String regularUserEmail = "testduckshop@mail.ru";
    private String regularUserPassword = "234";
    private String regularUserFirstAndLastName = "Name Surname";
    private String incorrectPassword = "24";
    private String emptyPassword = "";

    @Test
    public void shouldLogInToAccount() {
        LoginPage loginPage = new LoginPage();
        loginPage.attemptLogin(regularUserEmail, regularUserPassword);
        loginPage.validateMessage(String.format("You are now logged in as %s.", regularUserFirstAndLastName));
    }

    @Test
    public void shouldAppearMessageAboutInvalidLoginDetails() {
        LoginPage loginPage = new LoginPage();
        loginPage.attemptLogin(regularUserEmail, incorrectPassword);
        loginPage.validateMessage("Wrong password or the account is disabled, or does not exist");
    }

    @Test
    public void shouldAppearMessageAboutUnenteredLoginDetails() {
        LoginPage loginPage = new LoginPage();
        loginPage.attemptLogin(regularUserEmail, emptyPassword);
        loginPage.validateMessage("You must provide both email address and password.");
    }
}