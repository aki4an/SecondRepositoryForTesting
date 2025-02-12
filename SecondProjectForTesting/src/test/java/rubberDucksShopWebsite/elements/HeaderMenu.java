package rubberDucksShopWebsite.elements;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class HeaderMenu {
    public void clickHomePageButton() {
        $(getLocator("HeaderMenu.homePageButton")).click();
    }

    public void clickRubberDucksPageButton() {
        $(getLocator("HeaderMenu.rubberDucksPageButton")).click();
    }

    public void clickSubcategoryPageButton() {
        actions().moveToElement($(getLocator("HeaderMenu.rubberDucksPageButton")))
                .click($(getLocator("HeaderMenu.subcategoryPageButton"))).perform();
    }

    public void validateTitle(String expectedTitle) {
        $(getLocator("HeaderMenu.pageTitle")).shouldBe(attribute("text", expectedTitle));
    }
}
