package rubberDucksShopWebsite.pages;

import rubberDucksShopWebsite.elements.HeaderMenu;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static rubberDucksShopWebsite.helpers.Locators.getLocator;

public class CartPage {
    public HeaderMenu headerMenu;

    public CartPage() {
        headerMenu = new HeaderMenu();
    }

    public void addDuckToCart() {
        $(getLocator("CartPage.addToCartButton")).click();
    }

    public void goToCart() {
        $(getLocator("CartPage.quantityForAddToCart")).shouldBe(text("1"));
        $(getLocator("CartPage.cartButton")).click();
    }

    public void validateSumValue(String expectedSum) {
        $(getLocator("CartPage.sumValueInCart")).shouldBe(text(expectedSum));
    }

    public void changeQuantity(Integer quantity) {
        $(getLocator("CartPage.quantityInCart")).clear();
        $(getLocator("CartPage.quantityInCart")).sendKeys(quantity.toString());
        $(getLocator("CartPage.updateCartButton")).click();
    }

    public void validateMessage(String expectedMessage) {
        $(getLocator("CartPage.message")).shouldBe(text(expectedMessage));
    }

    public void clearCart() {
        $(getLocator("CartPage.removeButton")).click();
    }

    public void validateInfo(String expectedInfo) {
        $(getLocator("CartPage.info")).shouldBe(text(expectedInfo));
    }
}
