package rubberDucksShopWebsite;

import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.CatalogPage;
import rubberDucksShopWebsite.pages.DuckPage;

public class CatalogPageTest extends TestBase {
    @Test
    public void yellowDuckShouldHaveAChoiceOfSize() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.checkIfSizeParametersAreVisible();
    }

    @Test
    public void yellowDuckShouldBeOnSale() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.checkIfSaleStickerIsVisible();
    }
}
