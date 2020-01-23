package OOP;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LoanAccount la = new LoanAccount(); 
			la.increaseRate();
			la.setRate();
			la.setTerm(20);
			la.setAmortSched();
			
			//polymorphism changes where pointing
			IRate account1 = new LoanAccount();
			account1.setRate();
	}
	

}
