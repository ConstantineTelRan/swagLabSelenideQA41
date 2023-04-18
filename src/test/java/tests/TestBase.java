package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.reportsFolder = "test-result/reports";
        ScreenShooter.captureSuccessfulTests = true;
        Configuration.browserCapabilities = new ChromeOptions().addArguments("-remote-allow-origins=*");
        open("https://www.saucedemo.com");
    }

}
