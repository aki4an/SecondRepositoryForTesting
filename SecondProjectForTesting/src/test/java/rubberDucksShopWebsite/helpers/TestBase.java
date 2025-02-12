package rubberDucksShopWebsite.helpers;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import rubberDucksShopWebsite.enums.Browser;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.EDGE;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeMethod
    protected void methodSetup() {
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));

        switch (browser) {
            case chrome -> Configuration.browser = CHROME;
            case edge -> Configuration.browser = EDGE;
        }

        Configuration.pageLoadTimeout = 5000;
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";

        open("https://litecart.stqa.ru/en/");
    }
}
