package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


public class Button {
    private final SelenideElement button;

    public Button(String id){
        button = $(By.cssSelector("button#"+id));
    }
    public void clickBtn(){
        button.click();
    }
    public void doubleClickBtn(){
        button.doubleClick();
    }
    public void rightClickBtn(){
        button.contextClick();
    }
    public void checkVisibleAndTimeoutClickBtn(int seconds){
        button.should(Condition.visible, Duration.ofSeconds(seconds)).click();
    }
    public void checkEnabledAndTimeoutClickBtn(int seconds){
        button.shouldBe(Condition.enabled,Duration.ofSeconds(seconds)).click();
    }
    public void checkColorBtn(String css_rgba,int seconds){
        button.should(Condition.cssValue("color","rgba("+css_rgba+")"),Duration.ofSeconds(seconds)).click();
    }
    public void checkVisibleBtn(){
        button.should(Condition.visible).click();
    }
}