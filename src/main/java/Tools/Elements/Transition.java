package Tools.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class Transition {
    private final ElementsCollection pageMenu = $$("div.category-cards h5");
    private final ElementsCollection menuElements = $$("ul.menu-list li");
    private final String arg1;
    private final String arg2;
    public Transition(String arg1, String arg2){
        this.arg1=arg1;
        this.arg2=arg2;
    }
    public void transitionOne(){
        pageMenu.find(Condition.text(arg1)).click();
    }
    public void transitionTwo(){
        menuElements.find(Condition.text(arg2)).click();
    }
    public void transitionAll(){
        pageMenu.find(Condition.text(arg1)).click();
        menuElements.find(Condition.text(arg2)).click();
    }
    public void transitionAndScroll(String objectScrolling){
        pageMenu.find(Condition.text(arg1)).click();
        new Scrolling(objectScrolling).scrollToObject();
        menuElements.find(Condition.text(arg2)).click();
    }
}