package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		mapUtil(hMap);
	} 
	
	public static void mapUtil(Map<Integer, String> map){
		map.put(101,  "Steve");
		map.put(502,  "Roger");
		map.put(22,  "Jennifer");
		map.put(315,  "Mika");
		map.put(750,  "Kelly");

		System.out.println("See all kays: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);


	}

}
