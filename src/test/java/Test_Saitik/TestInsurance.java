package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestInsurance {


    private SelenideElement insurance =$(By.xpath("//a[@id='insurance-travel']"));
    private SelenideElement insuranceVehicle =$(By.xpath("//a[@id='insurance-vehicle']"));
    private SelenideElement insuranceTravel =$(By.xpath("//ul [@class = 'navigation-menu dropdown-menu']//a [@id ='insurance-travel']"));
    private SelenideElement insuranceLife =$(By.xpath("//a[@id='insurance-life']"));
    private SelenideElement insuranceFlight =$(By.xpath("//a[@id='insurance-flight']"));
    private SelenideElement insuranceEstate =$(By.xpath("//a[@id='insurance-estate']"));
    private SelenideElement insurancePension =$(By.xpath("//a[@id='insurance-pension']"));

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
