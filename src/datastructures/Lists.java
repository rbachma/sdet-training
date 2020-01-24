package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");

		for (String city : cities){
			System.out.println(city);
		}
		int size = cities.size();
		System.out.println("There are " + size + " elements in the collection");
	
	
	}

}
