package rubberDucksShopWebsite.pages;

import io.qameta.allure.Step;
import rubberDucksShopWebsite.elements.HeaderMenu;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class DuckPage {
    public HeaderMenu headerMenu;

    public DuckPage() {
        headerMenu = new HeaderMenu();
    }

    @Step("Check if size parameters are visible")
    public void checkIfSizeParametersAreVisible() {
        $(getLocator("DuckPage.optionsSize")).shouldBe(visible);
    }

    @Step("Check if sale sticker is visible")
    public void checkIfSaleStickerIsVisible() {
        $(getLocator("DuckPage.stickerSale")).shouldBe(visible);
    }

    @Step("Select small size")
    public void selectSmallSize() {
        $(getLocator("DuckPage.optionsSize")).selectOption("Small");
    }
}
