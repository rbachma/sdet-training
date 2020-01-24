package bankaccountapp;

public class Savings extends Account {
	private int safetyDepositBoxId;
	private int safetyDepositBoxCode;
	
	public Savings(String name, String ssn, double initDeposit){
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Your Savings Account Features" + 
		"\n Safety Deposit Box ID: " + safetyDepositBoxId + 
		"\n Safety Deposit Box Code: " + safetyDepositBoxCode + "\n");
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxCode = (int) (Math.random() * Math.pow(10, 4));	
	}


	
}
