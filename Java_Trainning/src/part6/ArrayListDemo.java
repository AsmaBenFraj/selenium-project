package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

//	How to declare arraylist
		
		//ArrayList list = new ArrayList(); //We can store any type of element (String / Integer)
		
		//ArrayList<Integer> list = new ArrayList<Integer>(); // store Integer element
		ArrayList<String> list = new ArrayList<>(); //Store string element 
		
//	How to add element / values to arraylist
		list.add("Sawssen");
		list.add("Karim");
		list.add("Nejib");
		list.add("Ghada");
		list.add("Mouna");
		list.add("Zayneb");
		
		
		//list.add(100); Integer / Number
		//list.add('A'); Characters
		
		//Print all the value
		System.out.println(list);
		
//	Find size of arraylist
		System.out.println(list.size());
		System.out.println("Before removing element: " +list);
		
//		Remove element / value from arraylist
		list.remove(2);
		System.out.println(list.size());
		System.out.println("After removing element: " +list);
		
//		Insert a new element in the middle of arraylist
		list.add(3, "Nejib");
		System.out.println(list.size());
		System.out.println("After insert element: " +list);
	
//	Read value from arraylist

//		for(String s : list) {
//			System.out.println(s);
//		}
		
		// object we can store any type of value
		
		for(Object s : list) {
			System.out.println(s);
		}


	}

}
