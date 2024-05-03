package org.howard.edu.lsp.oopfinal.question2;

public class BitconPayment implements PaymentStrategy {
	
	private String bitcoinAddress;
	
	public BitconPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " via Bitcoin with address: " + bitcoinAddress);
		
	}
	
	

	
}
