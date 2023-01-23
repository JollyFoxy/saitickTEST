package Page;

import Tools.Elements.*;

import static com.codeborne.selenide.Selenide.$x;

public class PaymentsPage {
    public final A paymentsForm= new A($x("//a[@id='payments-form']"));
    public final Button forward = new Button($x("//button[@id='forward']"));
//    -----------------------запрос на перевод-----------------------
    public final Scrolling scrolling =new Scrolling("#contentbar");
    public final A transitionRequest= new A($x("//a[@href='/card-payment-requests']"));
    public final Input moneySum = new Input($x("//input[@name='cardPaymentRequest.amount']"));
    public final TextArea description =new TextArea($x("//textArea[@name='cardPaymentRequest.details']"));

//    -----------------------между своими-----------------------
    public final A paymentsPersonal =new A($x("//a[@href='/payments/personal']"));
    public final A asRecurrentLink = new A($x("//a[@id='as-recurrent-link']"));
    public final Input amount= new Input($x("//input[@id='amount']"));
    public final Input paymentComment = new Input("payment.comment");
}
