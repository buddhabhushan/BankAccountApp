package BankAccount;

public class Savings extends Account {
	// List properties specific to Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize properties
	public Savings(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		this.accNumber = 1 + this.accNumber;
		setSafetyDeposit();
	}
		
	// List methods specific to Savings account
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDeposit() {
		safetyDepositBoxID = (int) (Math.random() * 1000);
		safetyDepositBoxKey = (int) (Math.random() * 10000);
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				"Your Safety Account Features :" + "\n " +
				"Safety Deposit Box ID: " + safetyDepositBoxID + "\n " +
				"Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}
}
