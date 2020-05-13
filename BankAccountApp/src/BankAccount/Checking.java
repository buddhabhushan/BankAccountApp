package BankAccount;

public class Checking extends Account {
	// List properties specific to Checking account
	private long debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize properties
	public Checking(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		this.accNumber = 2 + this.accNumber;
		setDebitCard();
	}
	
	// List methods specific to Checking account
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNumber =  (long) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * 10000);
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println(
				"Your Checking Account Features: \n " +
				"Debit Card Number: " + debitCardNumber + "\n " +
				"Debit Card PIN: " + debitCardPIN 
				);
	}
}
