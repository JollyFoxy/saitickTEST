package Tests;

import Interfasces.IAll;
import Tools.WebDrivers.WebDriver;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll {


    @BeforeAll
    static void beforeConfig() {
        Configuration.browser= WebDriver.class.getName();
        Configuration.timeout = 10000;
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
    @Step
    public void login(){
        loginPage.inputName();
        loginPage.inputPass();
        loginPage.clickLoginBtn();
        loginPage.inputCode();
        loginPage.inputCode();
    }
    @AfterEach
    public void after() {}
}
