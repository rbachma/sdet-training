package OOP;

public class LoanAccount implements IRate {
	@Override
	public void setRate(){
		System.out.println("Rate set");
		
	}
	@Override
	public void increaseRate(){
		System.out.println("Rate increased");
	}
	public void setTerm(int term){
		System.out.println("Setting the term to: " + term + "years");
		
	}
	public void setAmortSched(){
		System.out.println("Setting schedule of amort");
	}
}
