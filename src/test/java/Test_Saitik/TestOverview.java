package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestOverview {
    private SelenideElement overview =$(By.xpath("//a[@id='bank-overview']"));

    @Test
    public void testOverview() {
        Assertions.assertEquals(overview.should(Condition.visible).getText(),"ОБЗОР");
        overview.should(Condition.visible).click();
    }
}
