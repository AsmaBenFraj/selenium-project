package part2;

public class StaticExamples {

	static int a = 10; //static variable
	int b = 20; // non static variable

	static void m1() {

		System.out.println("This is m1  - static method");

		//Access to variable b directly
		//Create object
		StaticExamples se = new StaticExamples();
		System.out.println(se.b);
	}

	void m2() {
		System.out.println("This is m2 - non static method");
	}

	void m3() {
		System.out.println("This is m3 - non static method");
		
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
		
	}

	public static void main(String[] args) {
		
		// 1/ static method can access only static stuff (directly) ==> without create an object
		System.out.println(a);
		System.out.println(StaticExamples.a); // by class name
		
		m1();
		StaticExamples.m1(); // by class name
		
		//System.out.println(b);  //incorrect, because b is non static variable
		//m2(); //incorrect, because m2 is non static method
		
		// 2/ static method can also access non static stuff but through object
		StaticExamples se = new StaticExamples();
		System.out.println(se.b);
		
		se.m2();
		se.m3();
	}

}
