package org.howard.edu.lsp.oopfinal.question2;

public class CreditCardPayment implements PaymentStrategy{
	
	private String CreditCardNumber;


	public CreditCardPayment(String CreditCardnumber) {
		CreditCardNumber = CreditCardnumber;
	}
	
	@Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Credit Card with number: " + CreditCardNumber);
    }
}
