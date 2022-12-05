package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TestDeposits {

    private static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));
    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));
    private SelenideElement deposits =$(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement btnShowRates =$(By.xpath("//a[@id='btn-show-rates']"));
    private static String opDeposUrl="https://idemo.bspb.ru/deposits/form/10162?days=367";
    private SelenideElement submitBtn =$(By.xpath("//button[@id='submit-button']"));
    private SelenideElement sumInput =$(By.xpath("//input[@id='amount']"));
    private SelenideElement newDeposCondCeckBtn=
            $(By.xpath("//input[@name='condition.newDepositConditions']"));
    private SelenideElement instantDeposCondCheckBtn=
            $(By.xpath("//input[@name='condition.instantDepositAgreement']"));
    private SelenideElement acceptInstantDepositAgreementButton =$(By.xpath("//a[@id='accept-instant-deposit-agreement-button']"));
    private SelenideElement confirm =$(By.xpath("//button[@id='confirm']"));

    private SelenideElement windowTable =$(By.xpath("//table[@class='table']"));




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
    public void testDepositsGetText() {
        Assertions.assertEquals(deposits.should(Condition.visible).getText(), "ВКЛАДЫ");
        deposits.should(Condition.visible).click();
        btnShowRates.should(Condition.visible).click();
        open(opDeposUrl);
        sumInput.should(Condition.visible).val("100000");
        sleep(1000);
        submitBtn.should(Condition.visible).click();
        newDeposCondCeckBtn.should(Condition.visible).click();
        instantDeposCondCheckBtn.should(Condition.visible).click();
        //windowTable.scrollIntoView(false);
        acceptInstantDepositAgreementButton.should(Condition.visible).click();
        confirm.should(Condition.visible).click();
    }
}
