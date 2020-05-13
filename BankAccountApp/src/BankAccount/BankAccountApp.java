package BankAccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		//Read the csv file and create the accounts
		String file = "C:\\Users\\ADMIN\\Downloads\\original.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, SSN, initDeposit));
			}
			else {
				System.out.println("ERROR IN ACCOUNT TYPE !!");
			}
		}
		
		for(Account account : accounts) {
			account.showInfo();
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

	}

}
