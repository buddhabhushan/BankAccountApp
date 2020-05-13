package BankAccount;

import java.util.Scanner;

public abstract class Account implements IBaseRate {
	// List common properties for Savings and Checking accounts
	
	private String name;
	private String SSN;
	private double accBalance;
	
	protected String accNumber;
	protected double rate;
	
	private static int id = 10000;
	
	
	// Constructor to initialize the base properties
	public Account(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		this.accBalance = initDeposit;
		
		// set account number
		this.accNumber = setAccNumber();
		
		// Set the rate
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccNumber() {
		int len = SSN.length();
		String lastTwoDigitsOfSSN = SSN.substring(len-2);
		id++;
		int  randomNumber = (int)(Math.random() * 1000);
		return lastTwoDigitsOfSSN + id + randomNumber;
		
	}

	public void compound() {
		double interest = (accBalance * rate)/100;
		accBalance += interest;
		printBalance();
	}
	
	// List common methods to Saving and Checking account
	public void deposit() {
		System.out.print("Enter the amount to deposit : $");
		Scanner scanner = new Scanner(System.in);
		double depositedAmount= scanner.nextDouble();
		accBalance = accBalance + depositedAmount;
		System.out.println("Deposited $" + depositedAmount);
		printBalance();
	}
	
	public void withdraw() {
		System.out.print("Enter the amount to withdraw : $");
		Scanner scanner = new Scanner(System.in);
		double withdrawnAmount= scanner.nextDouble();
		accBalance = accBalance - withdrawnAmount;
		System.out.println("Withdrawn $" + withdrawnAmount);
		printBalance();
	}
	
	public void transfer() {
		System.out.print("Enter the amount to transfer : $");
		Scanner scanner = new Scanner(System.in);
		double withdrawnAmount= scanner.nextDouble();
		accBalance = accBalance - withdrawnAmount;
		System.out.println("Transfered $" + withdrawnAmount);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Account Balance now is : $" + accBalance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME : " + name + "\n" + 
				"ACCOUNT NUMBER : " + accNumber + "\n" + 
				"BALANCE : " + accBalance + "\n" +
				"RATE : " + rate + "%"
				);
	}
	
}


