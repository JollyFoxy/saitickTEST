package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCards {


    private SelenideElement cards  =$(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement operation =$(By.xpath("//a[.='Все операции']"));
    private SelenideElement calendar =$(By.xpath("//i[@class='icon-calendar']"));
    private SelenideElement nov_18_2022 =$(By.xpath("//td[.='18']"));
    private SelenideElement queryButton =$(By.xpath("//button[@class='btn btn-primary btn-query']"));


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
