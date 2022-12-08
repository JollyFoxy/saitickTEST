package Test_Saitik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class TestAccounts {

    private SelenideElement accounts  =$(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement statementsStatement =$(By.xpath("//a[@id='statements-statement']"));
    private SelenideElement accountsIndex =$(By.xpath("//ul[@class='navigation-menu dropdown-menu']//a[@id='accounts-index']"));
    private SelenideElement btnPrimary =$(By.xpath("//a[@class='btn btn-primary']"));
    private SelenideElement currencySelect =$(By.xpath("//select[@id='currencySelect']"));
    private SelenideElement USD =$(By.xpath("//option[@value='USD']"));
    private SelenideElement immuneRequiredCondition =$(By.xpath("//input[@class='immune required condition']"));
    private SelenideElement submit =$ (By.xpath("//button[@id='submit']"));


    @Test
    public void testAccounts() {
        Assertions.assertEquals(accounts.should(Condition.visible).getText(), "СЧЕТА");
        accounts.should(Condition.visible).click();

        btnPrimary.should(Condition.visible).click();
        currencySelect.should(Condition.visible).click();
        USD.should(Condition.visible).click();
        immuneRequiredCondition.should(Condition.visible).click();
        submit.should(Condition.visible).click();
    }
    @Test
    public void testStatementsStatement() {
        accounts.hover();
        Assertions.assertEquals(statementsStatement.should(Condition.visible).getText(), "Выписка");
        statementsStatement.click();
    }
    @Test
    public void testAccountsIndex(){
        accounts.hover();
        Assertions.assertEquals(accountsIndex.should(Condition.visible).getText(),"Текущие");
        accountsIndex.click();
    }
}
