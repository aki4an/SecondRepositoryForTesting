package rubberDucksShopWebsite;

import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.CartPage;
import rubberDucksShopWebsite.pages.CatalogPage;
import rubberDucksShopWebsite.pages.DuckPage;

public class CartPageTest extends TestBase {
    @Test
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

    @Test
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

    @Test
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

    @Test
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

