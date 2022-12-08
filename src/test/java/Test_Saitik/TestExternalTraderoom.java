package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestExternalTraderoom {

    private SelenideElement externalTraderoom =$(By.xpath("//a[@id='externaltraderoom-index']"));
    @Test
    public void testExternalTraderoom() {
        Assertions.assertEquals(externalTraderoom.should(Condition.visible).getText(), "ВАЛЮТА");
        externalTraderoom.should(Condition.visible).click();
    }
}
