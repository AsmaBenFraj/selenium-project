package myPackage;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Arithmetic operator --> + - * %
		System.out.println("------------------- Arithmetic operator -------------------");
		System.out.println("Sum of a and b is: " + (a + b));
		System.out.println("Diff of a and b is: " + (a - b));
		System.out.println("Diff of a and b is: " + (a % b));
		System.out.println("Diff of a and b is: " + (a * b));

		// Relational operator --> == <> <= >= !=
		// Always return boolean value
		System.out.println("------------------- Relational operator -------------------");
		System.out.println(a == b);// false
		System.out.println(a > b);// false
		System.out.println(a < b);// true
		System.out.println(a != b);// true

		// Logical operator --> && || !
		// works between boolean
		System.out.println("------------------- Logical operator -------------------");
		boolean x = true; 
		boolean y = false; 
		
		System.out.println(x && y);//false
		System.out.println(x || y);//true 
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		// Increment / Decrement operators ++ --
		System.out.println("------------------- Increment / Decrement operators -------------------");
		a = 10;
		a ++; //a = a+1;
		System.out.println(a);
		
		b = 30;
		b--; // b = b-1;
		System.out.println(b);

	}

}
