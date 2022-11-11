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
    private SelenideElement overview =$(By.xpath("//a[@id='bank-overview']"));
    private SelenideElement accounts  =$(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement payments  =$(By.xpath("//a[@id='payments-form']"));
    private SelenideElement cards  =$(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement deposits =$(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement loans =$(By.xpath("//a[@id='loans-index']"));
    private SelenideElement externalTraderoom =$(By.xpath("//a[@id='externaltraderoom-index']"));
    private SelenideElement insurance =$(By.xpath("//a[@id='insurance-travel']"));
    private SelenideElement logo =$(By.xpath("//a[@id='logo']"));
    private SelenideElement statementsStatement =$(By.xpath("//a[@id='statements-statement']"));
    private SelenideElement accountsIndex =$(By.xpath("//ul[@class='navigation-menu dropdown-menu']//a[@id='accounts-index']"));
    private SelenideElement insuranceVehicle =$(By.xpath("//a[@id='insurance-vehicle']"));
    private SelenideElement insuranceTravel =$(By.xpath("//ul [@class = 'navigation-menu dropdown-menu']//a [@id ='insurance-travel']"));
    private SelenideElement insuranceLife =$(By.xpath("//a[@id='insurance-life']"));
    private SelenideElement insuranceFlight =$(By.xpath("//a[@id='insurance-flight']"));
    private SelenideElement insuranceEstate =$(By.xpath("//a[@id='insurance-estate']"));
    private SelenideElement insurancePension =$(By.xpath("//a[@id='insurance-pension']"));
// //ul[@class='navigation-menu dropdown-menu']//a[@id='accounts-index']
    // //a[.='Текущие']
// //ul [@class = 'navigation-menu dropdown-menu']//a [@id ='insurance-travel']
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
    public void testOverview() {
        Assertions.assertEquals(overview.should(Condition.visible).getText(),"ОБЗОР");
        overview.should(Condition.visible).click();
    }
   @Test
   public void testAccounts() {
       Assertions.assertEquals(accounts.should(Condition.visible).getText(), "СЧЕТА");
       accounts.should(Condition.visible).click();

       accounts.hover();
       Assertions.assertEquals(statementsStatement.should(Condition.visible).getText(), "Выписка");
       statementsStatement.click();

       accounts.hover();
       Assertions.assertEquals(accountsIndex.should(Condition.visible).getText(),"Текущие");
       accountsIndex.click();
   }
   @Test
   public void testPayments() {
       Assertions.assertEquals(payments.should(Condition.visible).getText(), "ПЛАТЕЖИ И ПЕРЕВОДЫ");
       payments.should(Condition.visible).click();
    }

   @Test
   public void testCards() {
       Assertions.assertEquals(cards.should(Condition.visible).getText(), "КАРТЫ");
       cards.should(Condition.visible).click();
   }

   @Test
   public void testDeposits() {
       Assertions.assertEquals(deposits.should(Condition.visible).getText(), "ВКЛАДЫ");
       deposits.should(Condition.visible).click();
   }
   @Test
   public void testLoans() {
       Assertions.assertEquals(loans.should(Condition.visible).getText(), "КРЕДИТЫ");
       loans.should(Condition.visible).click();
   }
   @Test
   public void testExternalTraderoom() {
       Assertions.assertEquals(externalTraderoom.should(Condition.visible).getText(), "ВАЛЮТА");
       externalTraderoom.should(Condition.visible).click();
   }
   @Test
   public void testInsurance(){
        Assertions.assertEquals(insurance.should(Condition.visible).getText(),"СТРАХОВАНИЕ");
        insurance.should(Condition.visible).click();

        insurance.hover();
        Assertions.assertEquals(insuranceVehicle.should(Condition.visible).getText(),"Страхование автомобиля");
        insuranceVehicle.click();

        insurance.hover();
        Assertions.assertEquals(insuranceTravel.should(Condition.visible).getText(),"Страхование путешественников");
        insuranceTravel.click();

        insurance.hover();
        Assertions.assertEquals(insuranceLife.should(Condition.visible).getText(),"Страхование жизни, здоровья и спорта");
        insuranceLife.click();

        insurance.hover();
        Assertions.assertEquals(insuranceFlight.should(Condition.visible).getText(),"Защита от задержки или отмены рейса");
        insuranceFlight.click();

        insurance.hover();
        Assertions.assertEquals(insuranceEstate.should(Condition.visible).getText(),"Страхование недвижимости");
        insuranceEstate.click();

        insurance.hover();
        Assertions.assertEquals(insurancePension.should(Condition.visible).getText(),"Пенсионное обеспечение");
        insurancePension.click();

        //sleep(100000);
    }
    @Test
    public void testLogo(){
        logo.should(Condition.visible).click();
    }

    @AfterEach
    public void after() {

    }

}
