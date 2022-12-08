package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TestDeposits {

    private SelenideElement deposits =$(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement btnShowRates =$(By.xpath("//a[@id='btn-show-rates']"));
    private static String opDeposUrl="https://idemo.bspb.ru/deposits/form/10162?days=367";
    private SelenideElement submitBtn =$(By.xpath("//button[@id='submit-button']"));
    private SelenideElement sumInput =$(By.xpath("//input[@id='amount']"));
    private SelenideElement newDeposCondCeckBtn=
            $(By.xpath("//input[@name='condition.newDepositConditions']"));
    private SelenideElement instantDeposCondCheckBtn=
            $(By.xpath("//input[@name='condition.instantDepositAgreement']"));
    private SelenideElement acceptInstantDepositAgreementButton =$(By.xpath("//a[@id='accept-instant-deposit-agreement-button']"));
    private SelenideElement confirm =$(By.xpath("//button[@id='confirm']"));

    private SelenideElement body =$(By.xpath("//td[.='10. Способ обмена информацией между банком и вкладчиком']"));




    @Test
    public void testDeposits() {
        Assertions.assertEquals(deposits.should(Condition.visible).getText(), "ВКЛАДЫ");
        deposits.should(Condition.visible).click();
        btnShowRates.should(Condition.visible).click();
        open(opDeposUrl);
        sumInput.should(Condition.visible).val("100000");
        sleep(1000);
        submitBtn.should(Condition.visible).click();
        newDeposCondCeckBtn.should(Condition.visible).click();
        instantDeposCondCheckBtn.should(Condition.visible).click();
        body.scrollIntoView(true);
        acceptInstantDepositAgreementButton.should(Condition.visible).click();
        confirm.should(Condition.visible).click();
    }
}
