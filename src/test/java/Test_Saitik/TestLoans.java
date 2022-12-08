package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestLoans {

    private SelenideElement loans =$(By.xpath("//a[@id='loans-index']"));

    @Test
    public void testLoans() {
        Assertions.assertEquals(loans.should(Condition.visible).getText(), "КРЕДИТЫ");
        loans.should(Condition.visible).click();
    }
}
