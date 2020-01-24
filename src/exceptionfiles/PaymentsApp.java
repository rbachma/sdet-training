 package exceptionfiles;

import java.util.Scanner;

public class PaymentsApp {

	//Take a payment from the user
	public static void main(String[] args) {
		double payment = 0;
		boolean posPayment = true;
		//1. Ask user for input
		
		do {
			System.out.print("Enter the payment amount: ");
			//2. Get amount and test value
			Scanner in = new Scanner(System.in);
			try {
				payment = in.nextDouble();
				if (payment < 0){
					throw new NegativePaymentException(payment);
				}
				else {
					posPayment = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				posPayment = false;
			}
		} while (!posPayment);
		System.out.println("Thank you for your payment of : $" + payment);
		//3. Handle exceptions
		//4. Print confirmation
	}

}
