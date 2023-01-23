package Tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class Test01 extends BaseTest{
    @Test
    public void t01(){
        step_1();
        step_2();
        step_3();
        step_4("100000");
        step_5("13 272.33 ₽");
        step_6();
        step_7();
        step_8();
        step_9();
        step_10();
    }

    @Step
    public void step_1(){
        depositPage.deposits.clickA();
    }
    @Step
    public void step_2(){
        depositPage.btnShowRates.clickA();
    }
    @Step
    public void step_3(){
        depositPage.opDepos.clickA();
    }
    @Step
    public void step_4(String value){
        depositPage.sumInput.setValueInput(value);
    }
    @Step
    public void step_5(String value){
        depositPage.income.checkTextSpan(value);
    }
    @Step
    public void step_6(){
        depositPage.submitBtn.clickBtn();
    }
    @Step
    public void step_7(){
        depositPage.scrolling.scrollToObject();
        depositPage.newDeposCondCheckBtn.clickInput();
    }
    @Step
    public void step_8() {
        depositPage.instantDeposCondCheckBtn.clickInput();
    }
    @Step
    public void step_9() {
        depositPage.body.scrollIntoView(true);
        depositPage.acceptInstantDepositAgreementButton.clickA();
    }
    @Step
    public void step_10(){
        depositPage.confirm.clickBtn();
    }
}