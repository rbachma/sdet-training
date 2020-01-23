package basics;

public class NumbersCalc {
	
	public static void main(String[] args){
		System.out.println("Program is starting");
		printName();
		
		addNumbers(10, 20);
		
		multiplyNumbers(2, 4);
	}
	static void printName(){
		System.out.println("My name is Reid.");
	}
	static void addNumbers(int a, int b){
		int sum = a + b;
		System.out.println("The sum of integer " + a + " and integer " + b + " is " + sum + ".");
	}
	static int multiplyNumbers(int a, int b){
		int product = a * b;
		System.out.println("The product of " + a + " and " + b + " is " + product + ".");
		return product;
	}
}
