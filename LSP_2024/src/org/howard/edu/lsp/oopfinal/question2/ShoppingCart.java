package org.howard.edu.lsp.oopfinal.question2;

public class ShoppingCart {

    private PaymentStrategy payment;

    public void setPaymentStrategy(PaymentStrategy paymentI) {
        payment = paymentI;
    }

    public void checkout(double amount) {
        payment.pay(amount);
    }
}

