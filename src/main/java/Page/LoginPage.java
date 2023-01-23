package Page;

import Tools.Elements.Button;
import Tools.Elements.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final Input userName = new Input("username");
    private final Input userPassword = new Input("password");
//    password
    private final Button loginBtn = new Button($(By.cssSelector("#login-button")),"loginBtn");
    private final Input codeInput = new Input($x("//input[@id='otp-code']"));
    private final Button codeBtn = new  Button($(By.cssSelector("#login-otp-button")),"CodeBtn");

    @Step("")
    public void inputName(String name) {
        userName.setValueInput(name);
    }
    @Step("")
    public void inputPass(String pass){
        userPassword.setValueInput(pass);
    }
    @Step("")
    public void clickLoginBtn() {
        loginBtn.clickBtn();
    }
    @Step("")
    public void inputCode(String code){
        codeInput.setValueInput(code);
    }
    @Step
    public void clickCodeBtn(){
        codeBtn.clickBtn();
    }
}
