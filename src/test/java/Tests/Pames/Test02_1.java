package Tests.Pames;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Платежи переводы")
public class Test02_1 extends BaseTest {
    @Test
    @DisplayName("перевод между своими счетами")
    public void test2_1(){
        step1();
        step2();
        step3();
        step4("100000");
        step5("На бухло");
        step6();
    }
    @Step("Открытие страницы \"Запрос платежа\"")
    public void step1(){
        paymentsPage.paymentsForm.clickA();
    }
    @Step("Переход на страницу между своими")
    public void step2() {
        paymentsPage.paymentsPersonal.clickA();
    }
    @Step("Выбор даты")
    public void step3() {
        paymentsPage.asRecurrentLink.clickA();
    }
    @Step("Ввод суммы")
    public void step4(String sum) {
        paymentsPage.amount.setValueInput(sum);
    }
    @Step("Ввод коментария")
    public void step5(String text) {
        paymentsPage.paymentComment.setValueInput(text);
    }
    @Step("Нажатие кнопки \"подтвердить\"")
    public void step6() {
        paymentsPage.forward.clickBtn();
    }
}
