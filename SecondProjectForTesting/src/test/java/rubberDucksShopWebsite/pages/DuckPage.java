package rubberDucksShopWebsite.pages;

import rubberDucksShopWebsite.elements.HeaderMenu;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class DuckPage {
    public HeaderMenu headerMenu;

    public DuckPage() {
        headerMenu = new HeaderMenu();
    }

    public void checkIfSizeParametersAreVisible() {
        $(getLocator("DuckPage.optionsSize")).shouldBe(visible);
    }

    public void checkIfSaleStickerIsVisible() {
        $(getLocator("DuckPage.stickerSale")).shouldBe(visible);
    }

    public void selectSmallSize() {
        $(getLocator("DuckPage.optionsSize")).selectOption("Small");
    }
}
