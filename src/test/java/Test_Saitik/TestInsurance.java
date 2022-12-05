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

public class TestInsurance {

    // Переменные для вхда
    private  static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));
    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));


    //Переменые для тестирования "Страхования"
    private SelenideElement insurance =$(By.xpath("//a[@id='insurance-travel']"));
    private SelenideElement insuranceVehicle =$(By.xpath("//a[@id='insurance-vehicle']"));
    private SelenideElement insuranceTravel =$(By.xpath("//ul [@class = 'navigation-menu dropdown-menu']//a [@id ='insurance-travel']"));
    private SelenideElement insuranceLife =$(By.xpath("//a[@id='insurance-life']"));
    private SelenideElement insuranceFlight =$(By.xpath("//a[@id='insurance-flight']"));
    private SelenideElement insuranceEstate =$(By.xpath("//a[@id='insurance-estate']"));
    private SelenideElement insurancePension =$(By.xpath("//a[@id='insurance-pension']"));


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
}
