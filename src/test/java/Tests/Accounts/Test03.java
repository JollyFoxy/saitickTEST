package Tests.Accounts;

import Persons.Person;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Счета")
public class Test03 extends BaseTest {

    @Test
    @DisplayName("Создание кассы")
    public void test3(){
        step1();
        step2();
        step3();
        step4();
        step5("5100");
        step6();
        step7();
    }
    @Step("Изменмение аккаунта")
    public void step1(){
        Person.changePerson("ИП \"Морозов Павел Изяславович\"");
    }
    @Step("Закрытие модального окна")
    public void step2(){
        accountsPage.close.clickA();
    }
    @Step("Открытие \"Касса\"")
    public void step3(){
        accountsPage.findAccounts();
        accountsPage.cash.clickLi();
    }
    @Step("Нажатие \"Новая заявка\"")
    public void step4(){
        accountsPage.newCashApplication.clickA();
    }
    @Step("Ввод суммы")
    public void step5(String sum){
        accountsPage.amount.setValueInput(sum);
    }
    @Step("Нажатие \"Сохранить\"")
    public void step6(){
        accountsPage.saveBtn.clickBtn();
    }
    @Step("Смкена пользователя назад")
    public void step7(){
        Person.changePerson("Королёва Ольга");
    }
}
