package rubberDucksShopWebsite.helpers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import rubberDucksShopWebsite.enums.Browser;
import rubberDucksShopWebsite.enums.PlatformType;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.EDGE;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeMethod
    protected void methodSetup() {
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        PlatformType platform = PlatformType.valueOf(System.getProperty("platform", "win11"));

        DesiredCapabilities caps = new DesiredCapabilities();

        switch (browser) {
            case chrome -> Configuration.browser = CHROME;
            case edge -> Configuration.browser = EDGE;
        }
        switch (platform) {
            case win11 -> caps.setPlatform(Platform.WIN11);
            case linux -> caps.setPlatform(Platform.LINUX);
        }

        Configuration.remote = "http://192.168.100.9:4444/wd/hub";
        Configuration.browserCapabilities = caps;

        Configuration.pageLoadTimeout = 5000;
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";

        open("https://litecart.stqa.ru/en/");
    }
}
