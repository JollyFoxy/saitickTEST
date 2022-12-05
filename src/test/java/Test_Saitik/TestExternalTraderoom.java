package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestExternalTraderoom {

    // Переменные для вхда
    private  static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));
    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));


    //Переменные для тестированиея "Валюты"
    private SelenideElement externalTraderoom =$(By.xpath("//a[@id='externaltraderoom-index']"));


    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1620x1080"; // Умно

    }


    @BeforeEach
    public void before() {

        open(baseUrl);

        loginInput.should(Condition.visible).val("demo");
        passwordInput.should(Condition.visible).val("demo");
        loginBtn.should(Condition.visible).click();

        codeInput.should(Condition.visible).val("0000");
        codeBtn.should(Condition.visible).click();
    }

    @Test
    public void testExternalTraderoom() {
        Assertions.assertEquals(externalTraderoom.should(Condition.visible).getText(), "ВАЛЮТА");
        externalTraderoom.should(Condition.visible).click();
    }
}
