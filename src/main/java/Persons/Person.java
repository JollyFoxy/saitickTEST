package Persons;

import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private String lastName;
    private String password;
    private int age;
    @Step("Изменеие пользователя")
    public static void changePerson(String namePerson){
        $x("//span[.='Королёва Ольга']").click();
        $x("//span[.='"+namePerson+"']").click();
    }
}
