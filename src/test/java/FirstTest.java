import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    private static String baseUrl = "https://idemo.bspb.ru/";

    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));

    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));

    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));

    //Переменные для Пашеных потуг
    private SelenideElement overview =$(By.xpath("//a[@id='bank-overview']"));
    private SelenideElement accounts  =$(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement payments  =$(By.xpath("//a[@id='payments-form']"));
    private SelenideElement cards  =$(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement deposits =$(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement loans =$(By.xpath("//a[@id='loans-index']"));
    private SelenideElement externalTraderoom =$(By.xpath("//a[@id='externaltraderoom-index']"));
    private SelenideElement insurance =$(By.xpath("//a[@id='insurance-travel']"));
    private SelenideElement logo =$(By.xpath("//a[@id='logo']"));

    /*  private SelenideElement statementsStatement =$(By.xpath("//a[@id='statements-statement']"));
    private SelenideElement accountsIndex =$(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement insuranceVehicle =$(By.xpath("//a[@id='insurance-vehicle']"));
    private SelenideElement insuranceTravel =$(By.xpath("//a[@id='insurance-travel']"));
    private SelenideElement insuranceLife =$(By.xpath("//a[@id='insurance-life']"));
    private SelenideElement insuranceFlight =$(By.xpath("//a[@id='insurance-flight']"));
    private SelenideElement insuranceEstate =$(By.xpath("//a[@id='insurance-estate']"));
    private SelenideElement insurancePension =$(By.xpath("//a[@id='insurance-pension']"));*/

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1920x1080"; // Умно
    }


    @BeforeEach
    public void before() {
        open(baseUrl);
    }

    @Test
    public void test() {


        loginInput.should(Condition.visible).val("demo");
        passwordInput.should(Condition.visible).val("demo");
        loginBtn.should(Condition.visible).click();

        codeInput.should(Condition.visible).val("0000");
        codeBtn.should(Condition.visible).click();

        //Проверка текства
        Assertions.assertEquals(overview.should(Condition.visible).getText(),"ОБЗОР");
        Assertions.assertEquals(accounts.should(Condition.visible).getText(),"СЧЕТА");
        Assertions.assertEquals(payments.should(Condition.visible).getText(),"ПЛАТЕЖИ И ПЕРЕВОДЫ");
        Assertions.assertEquals(cards.should(Condition.visible).getText(),"КАРТЫ");
        Assertions.assertEquals(deposits.should(Condition.visible).getText(),"ВКЛАДЫ");
        Assertions.assertEquals(loans.should(Condition.visible).getText(),"КРЕДИТЫ");
        Assertions.assertEquals(externalTraderoom.should(Condition.visible).getText(),"ВАЛЮТА");
        Assertions.assertEquals(insurance.should(Condition.visible).getText(),"СТРАХОВАНИЕ");

        overview.should(Condition.visible).click();
        accounts.should(Condition.visible).click();
        payments.should(Condition.visible).click();
        cards.should(Condition.visible).click();
        deposits.should(Condition.visible).click();
        loans.should(Condition.visible).click();
        externalTraderoom.should(Condition.visible).click();
        insurance.should(Condition.visible).click();

        logo.should(Condition.visible).click();

        //sleep(100000);
    }

    @AfterEach
    public void after() {

    }

}
