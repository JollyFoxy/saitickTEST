package Tools.Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class A {
    private final SelenideElement a;
    public A(String id){
        a = $(By.id(id));
    }
    public void hoverA(){
        a.hover();
    }
    public void clickA(){
        a.click();
    }

}
