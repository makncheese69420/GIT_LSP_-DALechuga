package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {

    public static void main(String[] args) {
        // Create ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.00);

        // Use PayPal payment
        cart.setPaymentStrategy(new PayPalPayment("example@example.com"));
        cart.checkout(150.00);

        // Use Bitcoin payment
        cart.setPaymentStrategy(new BitconPayment("1NexAa7S6Rxe8Hc1PTojqtckVgp91tGxQz"));
        cart.checkout(200.00);
    }

}
