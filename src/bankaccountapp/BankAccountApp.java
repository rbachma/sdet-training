package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		//Read a CSV File the create new accounts based on that data
		String file = "C:\\Users\\Reid Bachman\\Downloads\\NewBankAccounts.csv"; 
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders){
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")){
				accounts.add(new Savings(name, ssn, initDeposit));
			}
			else if (accountType.equals("Checking")){
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else{
				System.out.println("ERROR READING ACCOUNT");
			}

			
		}
		for (Account acc: accounts){
			acc.showInfo();
			System.out.println("**********************************");
		}	
	}
}
