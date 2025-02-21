package rubberDucksShopWebsite.pages;

import io.qameta.allure.Step;
import rubberDucksShopWebsite.elements.HeaderMenu;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class CartPage {
    public HeaderMenu headerMenu;

    public CartPage() {
        headerMenu = new HeaderMenu();
    }

    @Step("Add duck to cart")
    public void addDuckToCart() {
        $(getLocator("CartPage.addToCartButton")).click();
    }

    @Step("Go to cart")
    public void goToCart() {
        $(getLocator("CartPage.quantityForAddToCart")).shouldBe(text("1"));
        $(getLocator("CartPage.cartButton")).click();
    }

    @Step("Validate total sum value")
    public void validateSumValue(String expectedSum) {
        $(getLocator("CartPage.sumValueInCart")).shouldBe(text(expectedSum));
    }

    @Step("Change quantity")
    public void changeQuantity(Integer quantity) {
        $(getLocator("CartPage.quantityInCart")).clear();
        $(getLocator("CartPage.quantityInCart")).sendKeys(quantity.toString());
        $(getLocator("CartPage.updateCartButton")).click();
    }

    @Step("Validate message")
    public void validateMessage(String expectedMessage) {
        $(getLocator("CartPage.message")).shouldBe(text(expectedMessage));
    }

    @Step("Clear cart")
    public void clearCart() {
        $(getLocator("CartPage.removeButton")).click();
    }

    @Step("Validate info")
    public void validateInfo(String expectedInfo) {
        $(getLocator("CartPage.info")).shouldBe(text(expectedInfo));
    }
}
