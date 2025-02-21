package rubberDucksShopWebsite;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.CatalogPage;

@Feature("Navigate through header menu tabs")
public class HeaderTest extends TestBase {
    @Story("Go to Rubber Ducks page")
    @Description("Attempt click on the Rubber Ducks button: this page should open")
    @Test(description = "Should go to Rubber Ducks page")
    public void shouldGoToRubberDucksPage() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.headerMenu.clickRubberDucksPageButton();
        catalogPage.headerMenu.validateTitle("Rubber Ducks | My Store");
    }

    @Story("Go to Online Store page")
    @Description("Attempt click on the Online Store button: this page should open")
    @Test(description = "Should go to Online Store page")
    public void shouldGoToOnlineStorePage() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.headerMenu.clickHomePageButton();
        catalogPage.headerMenu.validateTitle("Online Store | My Store");
    }

    @Story("Go to Subcategory page")
    @Description("Attempt click on the Subcategory button: this page should open")
    @Test(description = "Should go to Subcategory page")
    public void shouldGoToSubcategoryPage() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.headerMenu.clickSubcategoryPageButton();
        catalogPage.headerMenu.validateTitle("Subcategory | My Store");
    }
}
