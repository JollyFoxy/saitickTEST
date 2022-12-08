import Test_Saitik.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainTests {

    // Переменные для вхда
    private  static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));
    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));

    TestOverview overview=new TestOverview();
    TestPayments payments = new TestPayments();
    TestCards cards = new TestCards();
    TestDeposits deposits=new TestDeposits();
    TestLoans loans =new TestLoans();
    TestExternalTraderoom externalTraderoom =new TestExternalTraderoom();
    TestAccounts accounts =new TestAccounts();
    TestInsurance insurance = new TestInsurance();
    private SelenideElement logo =$(By.xpath("//a[@id='logo']"));

    //Мусор
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
        overview.testOverview();
    }

    @Test
    public void testAccounts() {
        accounts.testAccounts();
        accounts.testAccountsIndex();
        accounts.testStatementsStatement();
    }
    @Test
    public void testPayments() {
       payments.testPayments();
    }
    @Test
    public void testCards() {
       cards.testCards();
   }
    @Test
    public void testDeposits() {
       deposits.testDeposits();
   }
    @Test
    public void testLoans() {
      loans.testLoans();
   }
    @Test
    public void testExternalTraderoom() {
       externalTraderoom.testExternalTraderoom();
   }
    @Test
    public void testInsurance(){
        insurance.testInsurance();
    }
    @Test
    public void testLogo(){
        logo.should(Condition.visible).click();
    }

    @AfterEach
    public void after() {}
}