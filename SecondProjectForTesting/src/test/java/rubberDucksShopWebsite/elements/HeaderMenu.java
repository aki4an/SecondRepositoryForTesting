package rubberDucksShopWebsite.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class HeaderMenu {
    @Step("Go to Online Store page")
    public void clickHomePageButton() {
        $(getLocator("HeaderMenu.homePageButton")).click();
    }

    @Step("Go to Rubber Ducks page")
    public void clickRubberDucksPageButton() {
        $(getLocator("HeaderMenu.rubberDucksPageButton")).click();
    }

    @Step("Go to Subcategory page")
    public void clickSubcategoryPageButton() {
        actions().moveToElement($(getLocator("HeaderMenu.rubberDucksPageButton")))
                .click($(getLocator("HeaderMenu.subcategoryPageButton"))).perform();
    }

    @Step("Validate page title")
    public void validateTitle(String expectedTitle) {
        $(getLocator("HeaderMenu.pageTitle")).shouldBe(attribute("text", expectedTitle));
    }
}
