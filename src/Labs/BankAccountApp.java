package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("56766542", 1000);
		acc1.setName("Reid");
		System.out.println(acc1.getName());
		BankAccount acc2 = new BankAccount("098766542", 2000);
		BankAccount acc3 = new BankAccount("2567542", 3000);
		acc1.makeDeposit(3000);
		acc1.payBill(500); 
		acc1.accrue(); 
		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements iInterest {
	private String accountNumber;
	private static final String routingNumber = "827364673";
	private String name;
	private String ssn; 
	private double balance;
	private static int iD = 1000;
	
	public BankAccount(String ssn, double initDeposit){
		this.ssn = ssn; 
		iD++;
		setAccountNumber();
		System.out.println();
		balance = initDeposit; 
	}
	private void setAccountNumber(){
		int random = (int) (Math.random() * 100);
		accountNumber = iD + random + ssn.substring(0,2); 
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name; 
	}
	
	public void payBill(double amount){
		balance -= amount;
		showBalance();
		
	}
	public void makeDeposit(double amount){
		balance += amount;
		showBalance();
	}
	public void showBalance(){
		System.out.println("Your balance: $" + balance);
	}
	public void accrue(){
		balance *= (1 + rate/100);
		showBalance(); 
	}
	public String toString(){
		return "[Name " + name + "]\n[Account number " + accountNumber + "]\n[Routing number " + routingNumber + "]\n[Balance " + balance + "]";
		
	}
}

