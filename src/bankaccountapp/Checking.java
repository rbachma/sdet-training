package bankaccountapp;

public class Checking extends Account {
	//Properties specific to checking
	private int debitCardNumber;
	private int debitCardPin; 
	
	public Checking(String name, String ssn, double initDeposit){
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	//Constructor to initialize checking account properties
	
	//methods specific to checking account
	@Override
	public void setRate(){
		rate = getBaseRate() * .15;
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("Your Checking Account Features\n" + " DEBIT CARD #: " + 
		this.debitCardNumber + "\n DEBIT CARD PIN: " + this.debitCardPin + "\n");
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		

	}
}
