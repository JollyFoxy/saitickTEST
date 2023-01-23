package Tests.Pames;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Платежи и переводы")
public class Test02 extends BaseTest {
    @Test
    @DisplayName("Создание запроса на перепвод")
    public void test2(){
        step1();
        step2();
        step3("75000");
        step4("На девок");
        step5();
    }

    @Step("Переход на страницу \"Платежи и переводы\"")
    private void step1(){
        paymentsPage.paymentsForm.clickA();
    }
    @Step("Открытие страницы \"Запрос платежа\"")
    private void step2(){
        paymentsPage.scrolling.scrollToObject();
        paymentsPage.transitionRequest.clickA();
    }
    @Step("Ввод суммы")
    private void step3(String sum){
        paymentsPage.moneySum.setValueInput(sum);
    }
    @Step("Ввод коментария")
    private void step4(String text){
        paymentsPage.description.setValueTextArea(text);
    }
    @Step("Нажатие кнопки \"подтвердить\"")
    private void step5(){
        paymentsPage.forward.clickBtn();
    }
}
