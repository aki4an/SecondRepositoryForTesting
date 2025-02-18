package rubberDucksShopWebsite;

import org.testng.annotations.Test;
import rubberDucksShopWebsite.helpers.TestBase;
import rubberDucksShopWebsite.pages.CatalogPage;

public class HeaderTest extends TestBase {
    @Test
    public void shouldGoToRubberDucksPage() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.headerMenu.clickRubberDucksPageButton();
        catalogPage.headerMenu.validateTitle("Rubber Ducks | My Store");
    }

    @Test
    public void shouldGoToOnlineStorePage() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.headerMenu.clickHomePageButton();
        catalogPage.headerMenu.validateTitle("Online Store | My Store");
    }

    @Test
    public void shouldGoToSubcategoryPage() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.headerMenu.clickSubcategoryPageButton();
        catalogPage.headerMenu.validateTitle("Subcategory | My Store");
    }
}
