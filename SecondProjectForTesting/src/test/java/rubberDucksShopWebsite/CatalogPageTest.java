package rubberDucksShopWebsite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.CatalogPage;
import rubberDucksShopWebsite.pages.DuckPage;

@Feature("Visibility of items in the catalog")
public class CatalogPageTest extends TestBase {
    @Story("The size selection option is displayed")
    @Description("Attempt click on the yellow duck: this duck should have size selection option")
    @Test(description = "Yellow duck should have a choice of size")
    public void yellowDuckShouldHaveAChoiceOfSize() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.checkIfSizeParametersAreVisible();
    }

    @Story("Sale sticker displayed")
    @Description("Attempt click on the yellow duck: this duck should have sale sticker")
    @Test(description = "Yellow duck should be on sale")
    public void yellowDuckShouldBeOnSale() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectYellowDuck();
        DuckPage duckPage = new DuckPage();
        duckPage.checkIfSaleStickerIsVisible();
    }
}
