package part2;

public class MethodOverloading {
	
	//same name of method - different parameters 
	
	void add(int a, int b) {
		
		System.out.println(a + b);
	}
	
	void add(int a, double b) {
		
		System.out.println(a + b);
	}
	
	void add(double a, double b) {
		
		System.out.println(a + b);
	}
	
	void add(int a, int b, int c) {
		
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20);//1
		mo.add(10, 20.5); //2
		mo.add(20.5, 30.25); //3
		mo.add(10, 20, 30); //4

	}

}
