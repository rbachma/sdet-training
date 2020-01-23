package basics;

public class SalaryCalculator {

		public static void main(String[] args){
			//declaring a variable
			String career;
			System.out.println("Program is starting");
			//defining a variable
			career= "Software Developer";
			System.out.println("MY career: " + career);
			
			int hoursPerWeek = 40;
			int weeksPerYear = 50;
			double rate = 42.50;
			
			double salary = (hoursPerWeek * rate) * weeksPerYear;
			System.out.print("My salary as a " + career + " at the rate of " + rate + " per hour is " + salary + " per year.");
		}
}
