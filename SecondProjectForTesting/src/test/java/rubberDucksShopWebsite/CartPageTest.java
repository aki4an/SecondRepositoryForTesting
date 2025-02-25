package rubberDucksShopWebsite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.CartPage;
import rubberDucksShopWebsite.pages.CatalogPage;
import rubberDucksShopWebsite.pages.DuckPage;

@Feature("Adding a yellow duck to the cart and performing actions with it")
public class CartPageTest extends TestBase {
    @Story("Add yellow duck to cart")
    @Description("Attempt adding yellow duck to cart: this duck should be added to the cart")
    @Test(description = "Duck should be added to the cart")
    public void duckShouldBeAddedToTheCart() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.selectSmallSize();
        CartPage cartPage = new CartPage();
        cartPage.addDuckToCart();
        cartPage.goToCart();
        cartPage.validateSumValue("$18.00");
    }

    @Story("Changing the total price of the cart")
    @Description("Attempt adding yellow duck to cart and change quantity: the total price in the cart should change")
    @Test(description = "Total price should change in the cart")
    public void totalPriceShouldChangeInTheCart() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.selectSmallSize();
        CartPage cartPage = new CartPage();
        cartPage.addDuckToCart();
        cartPage.goToCart();
        cartPage.changeQuantity(2);
        cartPage.validateSumValue("$36.00");
    }

    @Story("Clear cart")
    @Description("Attempt adding yellow duck to cart and click Remove button: a message about an empty cart will appear")
    @Test(description = "Cart should be cleared")
    public void cartShouldBeCleared() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.selectSmallSize();
        CartPage cartPage = new CartPage();
        cartPage.addDuckToCart();
        cartPage.goToCart();
        cartPage.clearCart();
        cartPage.validateInfo("There are no items in your cart.");
    }

    @Story("Exceed quantity limit")
    @Description("Attempt adding yellow duck to cart and change quantity to large: " +
            "a message will appear stating that there are not enough products of the selected option")
    @Test(description = "Should appear message in cart about quantity limit")
    public void shouldAppearMessageInCartAboutQuantityLimit() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.selectSmallSize();
        CartPage cartPage = new CartPage();
        cartPage.addDuckToCart();
        cartPage.goToCart();
        cartPage.changeQuantity(11);
        cartPage.validateMessage("There are not enough products of the selected option in stock. (10)");
    }
}

