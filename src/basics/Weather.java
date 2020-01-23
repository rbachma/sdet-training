package basics;

public class Weather {
	
	public static void main(String[] args){
		//gives suggestions what to wear based on temperature
		int temp = 45; 
		String sunCondition = "Overcast";
		
		if (temp > 80){
			System.out.println("It's pleasant. Wear shorts and a t-shirt");
		}
		else if (temp > 60 && sunCondition == "Sunny"){
			System.out.println("It's a little cooler. Perhaps wear jeans");
			System.out.println("Also, wear a hat.");
		}
		else if (temp > 50 || sunCondition == "Overcast"){
			System.out.println("This is a cool day. Wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day! Wear a jacket.");
		}
		System.out.println("The program is ending.");
	}
}
