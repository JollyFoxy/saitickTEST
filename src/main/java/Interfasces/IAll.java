package Interfasces;

import Page.LoginPage;
import Staps.DepositPage;

public interface IAll {
    String baseUrl = "https://idemo.bspb.ru/";
    LoginPage loginPage = new LoginPage();
    DepositPage depositPage = new DepositPage();
}
