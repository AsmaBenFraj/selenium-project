package part3;

public class Animal {
	
	//1
	String color = "White";
	
	//2
	void eating() {
		System.out.println("Eating.....................");
	}
	
	//3
	Animal(){
		System.out.println("Animal is created");
	}

}

class Dog extends Animal{
	
	//we can also call this overriding - different body
	String color = "Black";
	
	Dog(){
		super();
		System.out.println("Dog is created");
		
	}
	
    void display() {
    	System.out.println(color); // Black
    	System.out.println(super.color); // White  - When add super - in test super we print black and white
    }
    
    void eating() {
    	System.out.println("Eating bread.................");
    	super.eating(); 
    }
}
