package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//size implicitly defined
		String[] cities = {"NYC", "SF", "Miami", "DFW"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);

		
		String[] countries;
		countries = new String[3];
		
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		
		System.out.println("*******************");
		String[] states = new String[5];
		states[0] = "CA";
		states[1] = "Ohio";
		states[2] = "NJ";
		states[3] = "TX";
		states[4] = "UT";
		
		int i = 0;
		do {
			System.out.println("State " + i + " is " + states[i]);
			i++; 
		} while (i < 5);
		
		int n = 0;
		boolean found = false;
		while (!found){
			String state = states[n];
			System.out.println(state);
			if (state == "TX"){
				System.out.println("STATE FOUND!");
				found = true; 
			}
			n++;
			
		}
	
	}
}

