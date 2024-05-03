package org.howard.edu.lsp.oopfinal.question2;

public class PayPalPayment implements PaymentStrategy {
    private String emailaddress;

    public PayPalPayment(String email) {
        emailaddress = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal with email: " + emailaddress);
    }

}
