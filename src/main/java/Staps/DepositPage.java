package Staps;

import Tools.Elements.A;
import Tools.Elements.Button;
import Tools.Elements.Input;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DepositPage {
    private final A deposits =new A("deposits-index");
    private final A btnShowRates =new A("btn-show-rates");
    private final SelenideElement opDepos =$(By.cssSelector("a.btn btn-primary"));
    private final Button submitBtn =new Button("submit-button");
    private final Input sumInput =new Input("amount");
    private final Input newDeposCondCheckBtn = new Input("condition.newDepositConditions",true);
    private final Input instantDeposCondCheckBtn= new Input("condition.instantDepositAgreement",true);
    private final A acceptInstantDepositAgreementButton =new A("accept-instant-deposit-agreement-button");
    private final Button confirm =new Button("confirm");
    private final SelenideElement body =$(By.xpath("//td[.='10. Способ обмена информацией между банком и вкладчиком']"));

    @Step
    public void testDeposits() {
        deposits.clickA();
        btnShowRates.clickA();
        opDepos.click();
        sumInput.setValueInput("100000");
        submitBtn.clickBtn();
        newDeposCondCheckBtn.clickInput();
        instantDeposCondCheckBtn.clickInput();
        body.scrollIntoView(true);
        acceptInstantDepositAgreementButton.clickA();
        confirm.clickBtn();
    }
}