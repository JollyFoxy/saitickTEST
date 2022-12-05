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

public class TestAccounts {
    // Переменные для вхда
    private  static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));
    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));


    // Переменые для тестирования "Счета"
    private SelenideElement accounts  =$(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement statementsStatement =$(By.xpath("//a[@id='statements-statement']"));
    private SelenideElement accountsIndex =$(By.xpath("//ul[@class='navigation-menu dropdown-menu']//a[@id='accounts-index']"));
    private SelenideElement btnPrimary =$(By.xpath("//a[@class='btn btn-primary']"));
    private SelenideElement currencySelect =$(By.xpath("//select[@id='currencySelect']"));
    private SelenideElement USD =$(By.xpath("//option[@value='USD']"));
    private SelenideElement immuneRequiredCondition =$(By.xpath("//input[@class='immune required condition']"));
    private SelenideElement submit =$ (By.xpath("//button[@id='submit']"));

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
    public void testAccounts() {
        Assertions.assertEquals(accounts.should(Condition.visible).getText(), "СЧЕТА");
        accounts.should(Condition.visible).click();

        btnPrimary.should(Condition.visible).click();
        currencySelect.should(Condition.visible).click();
        USD.should(Condition.visible).click();
        immuneRequiredCondition.should(Condition.visible).click();
        submit.should(Condition.visible).click();
    }
    @Test
    public void testStatementsStatement() {
        accounts.hover();
        Assertions.assertEquals(statementsStatement.should(Condition.visible).getText(), "Выписка");
        statementsStatement.click();
    }
    @Test
    public void testAccountsIndex(){
        accounts.hover();
        Assertions.assertEquals(accountsIndex.should(Condition.visible).getText(),"Текущие");
        accountsIndex.click();
    }
}
