package OOP;

public class BankAccount implements IRate {
	//define attributes
	String accountNumber;
	private static final String routingNum = "123456";
	private String name;
	private String SSN; 
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	String accountType; 
	double balance = 0;
	//static belongs to class not object instance, final cannot be altered
	//constructors are implicit, called automatically
	//have same name as class and no return type
	BankAccount(){
		System.out.println("New account created!");
	}
	//polymorphism through overriding
	BankAccount(String accountType){
		System.out.println("New " + accountType + " created.");
		
	}
	BankAccount(String accountType, double initDeposit){
		String Msg = null;
		if (initDeposit<1000){
			Msg = "Error. Minimum deposit must be at least $1000";
		}
		else{
			Msg = "Thank you for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance += initDeposit;
	}
	
	public void setName(String name){
		this.name = name; 
	}
	public String getName(){
		return name;
	}
	public void deposit(double amount){
		balance += amount;
		showActivity("DEPOSIT");
	}
	private void showActivity(String activity){
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: " + balance);
		
	}
	void withdraw(double withdrawal){
		balance -= withdrawal; 
		showActivity("WITHDRAWAL");
	}
	void checkBal(){
		System.out.println("Balance is " + balance);
		
	}
	void getStatus(){
		
	}
	@Override
	public String toString(){
		return "[Name " + name + ". " + accountNumber + ". Routing # " + routingNum + ". BALANCE: $" + balance + " ]";
	}
	
	//				INTERFACE METHODS
	public void setRate(){
		System.out.println("Setting rate");
		
	}
	public void increaseRate(){
		System.out.println("Increasing rate");
	}
}
