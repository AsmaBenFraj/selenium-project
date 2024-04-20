package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//Declare Hashmap
		//HashMap hm = new HashMap(); // Declaration 1
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Add element to hashmap
		hm.put(101, "Ghada");
		hm.put(102, "Seddik");
		hm.put(103, "Ahmed");
		hm.put(104, "Rabeb");
		
		System.out.println(hm);
		
		//Remove element from hashmap
		hm.remove(103);
		System.out.println("After removing a pair: "+hm);
		
		
		//Read pairs from hashmap
		for(Map.Entry  m : hm.entrySet()) {
			System.out.println(m.getKey()+ "" + m.getValue());
		}
		

	}

}
