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

public class TestCards {

    // Переменные для вхда
    private  static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));
    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));


    //Переменые для тестирования "Карты"
    private SelenideElement cards  =$(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement operation =$(By.xpath("//a[.='Все операции']"));
    private SelenideElement calendar =$(By.xpath("//i[@class='icon-calendar']"));
    private SelenideElement nov_18_2022 =$(By.xpath("//td[.='18']"));
    private SelenideElement queryButton =$(By.xpath("//button[@class='btn btn-primary btn-query']"));


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
    public void testCards() {
        Assertions.assertEquals(cards.should(Condition.visible).getText(), "КАРТЫ");
        cards.should(Condition.visible).click();
        operation.should(Condition.visible).click();
        calendar.should(Condition.visible).click();
        nov_18_2022.should(Condition.visible).click();
        queryButton.should(Condition.visible).click();
    }
}
