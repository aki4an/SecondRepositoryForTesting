package rubberDucksShopWebsite.pages;

import io.qameta.allure.Step;
import rubberDucksShopWebsite.elements.HeaderMenu;

import static com.codeborne.selenide.Selenide.$;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class CatalogPage {
    public HeaderMenu headerMenu;

    public CatalogPage() {
        headerMenu = new HeaderMenu();
    }

    @Step("Select yellow duck")
    public void selectYellowDuck() {
        $(getLocator("CatalogPage.yellowDuck")).click();
    }
}
