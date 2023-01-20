package Page;

import Tools.Elements.Button;
import Tools.Elements.Input;
import io.qameta.allure.Step;

public class LoginPage {
    private final Input userName = new Input("username",true);
    private final Input userPassword = new Input("password",true);
    private final Button loginBtn = new Button("login-button");
    private final Input codeInput = new Input("otp-code");
    private final Button codeBtn = new Button("login-otp-button");

    @Step("")
    public void inputName() {
        userName.setValueInput("demo");
    }
    @Step("")
    public void inputPass(){
        userPassword.setValueInput("demo");
    }
    @Step("")
    public void clickLoginBtn() {
        loginBtn.clickBtn();
    }
    @Step("")
    public void inputCode(){
        codeInput.setValueInput("0000");
    }
    @Step
    public void clickCodeBtn(){
        codeBtn.clickBtn();
    }
}
