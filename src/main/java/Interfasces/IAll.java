package Interfasces;

import Page.LoginPage;
import Page.DepositPage;
import Page.PaymentsPage;

public interface IAll {
    String baseUrl = "https://idemo.bspb.ru/";
    LoginPage loginPage = new LoginPage();
    DepositPage depositPage = new DepositPage();
    PaymentsPage paymentsPage =new PaymentsPage();
}
