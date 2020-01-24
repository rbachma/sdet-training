package bankaccountapp;

//will not be creating classes from account class
public abstract class Account implements IRate{
	//Common properties of checking and savings
	private String name;
	private String ssn; 
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit){
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		this.accountNumber = setAccountNumber();
		index++;
		setRate();
	}
	//Common methods
	public abstract void setRate();
	
	public void deposit(double amount){
		balance += amount; 
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance -= amount; 
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String destination, double amount){
		balance -= amount;
		System.out.println("Transferring $" + amount + " to " + destination);	
		printBalance();
	}
	
	public void printBalance(){
		System.out.println("Your balance is now: $" + balance);
	}
	
	private String setAccountNumber(){
		String lastTwoSsn = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueId = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSsn + uniqueId + randomNumber; 
	}
	public void compound(){
		double accruedInterest = balance * (rate/100); 
		System.out.println("Accrued interest: $" + accruedInterest);
		balance = balance + accruedInterest;
		printBalance();
	}
	
	public void showInfo(){
		System.out.println(
				"Name: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance
				+ "\nRATE: " + rate + "%");
	}
	
}
