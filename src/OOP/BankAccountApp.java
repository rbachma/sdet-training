package OOP;

public class BankAccountApp {
	
	public static void main(String[] args){
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Checking Account");
		
		acc1.setRate();
		acc1.increaseRate();
		acc1.setName("Reid");
		System.out.println(acc1.getName());
		acc1.accountNumber = "2389398";
		acc1.balance = 1200202; 
		acc1.setSSN("234567543");
		System.out.println("SSN is: " + acc1.getSSN());
		System.out.println(acc1.toString());
		acc1.accountNumber = "1134567";
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.withdraw(500);

		acc2.accountNumber="9876543";
		
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000); 
		acc3.accountNumber = "234565432";
		acc3.checkBal();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 1000;
		
		cd1.accountType = "Savings";
		System.out.println(cd1.toString());
	}

}
