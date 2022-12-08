package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestPayments {
    private SelenideElement payments  =$(By.xpath("//a[@id='payments-form']"));

    @Test
    public void testPayments() {
        Assertions.assertEquals(payments.should(Condition.visible).getText(), "ПЛАТЕЖИ И ПЕРЕВОДЫ");
        payments.should(Condition.visible).click();
    }
}
