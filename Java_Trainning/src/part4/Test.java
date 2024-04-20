package part4;

interface A{
	
	int a = 20; //by default variables in interface are static and final
	void m1(); // Abstract method (without implementation of code), by default public
}

class B{
	int b;
}

public class Test extends B implements A {
	
	//here we implement the method
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// here we can access to the method
		Test test = new Test(); // Object
		test.m1();
		
		// Another way to invoke m1
		A a = new Test(); // create memory for the interface, because interface don't have a memory by default
		a.m1();

	}

}
