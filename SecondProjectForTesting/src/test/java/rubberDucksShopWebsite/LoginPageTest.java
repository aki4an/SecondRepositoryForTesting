package rubberDucksShopWebsite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.LoginPage;

@Feature("User login with credentials")
public class LoginPageTest extends TestBase {
    private String regularUserEmail = "testduckshop@mail.ru";
    private String regularUserPassword = "234";
    private String regularUserFirstAndLastName = "Name Surname";
    private String incorrectPassword = "24";
    private String emptyPassword = "";

    @Story("Login with correct credentials")
    @Description("Attempt to login with correct credentials: success message should appear")
    @Test(description = "Should log in to account")
    public void shouldLogInToAccount() {
        LoginPage loginPage = new LoginPage();
        loginPage.attemptLogin(regularUserEmail, regularUserPassword);
        loginPage.validateMessage(String.format("You are now logged in as %s.", regularUserFirstAndLastName));
    }

    @Story("Login with incorrect credentials")
    @Description("Attempt to login with incorrect credentials: error message should appear")
    @Test(description = "Should appear message about invalid login details")
    public void shouldAppearMessageAboutInvalidLoginDetails() {
        LoginPage loginPage = new LoginPage();
        loginPage.attemptLogin(regularUserEmail, incorrectPassword);
        loginPage.validateMessage("Wrong password or the account is disabled, or does not exist");
    }

    @Story("Login with empty credentials")
    @Description("Attempt to login with incorrect credentials: error message should appear")
    @Test(description = "Should appear message about unentered login details")
    public void shouldAppearMessageAboutUnenteredLoginDetails() {
        LoginPage loginPage = new LoginPage();
        loginPage.attemptLogin(regularUserEmail, emptyPassword);
        loginPage.validateMessage("You must provide both email address and password.");
    }
}