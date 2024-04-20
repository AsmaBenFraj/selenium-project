package myPackage;

public class StringMethods {

	public static void main(String[] args) {

		String s = "welcome";
		String s1 = "to java";
		
		//Length of a string
		System.out.println(s.length());
		
		//Joining of a string
		System.out.println(s.concat(s1));
		
		//Trimming the string
		s = "         welcome          ";
		System.out.println("Before trimming string is: " +s);
		
		//Remove space
		System.out.println("After trimming string is: " +s.trim());
		
		//chartAt()
		s = "welcome";
		System.out.println(s.charAt(4));
		
		//contains() ==> 
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		
		//Comparing string equals()
		System.out.println(s.equals("welcome"));//true
		System.out.println(s.equals("Welcome"));//false
		System.out.println(s.equals("welc ome"));//false
		
		//replacing characters  
		s = "welcome to java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java", "selenium"));
		
		//extracting substring from the main string
		s = "welcome";
		System.out.println(s.substring(0, 4));
		
		//converting case 
		s = "WELCOME";
		System.out.println(s.toLowerCase());
		
		s = "welcome";
		System.out.println(s.toUpperCase());
		

	}

}
