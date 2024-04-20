package part3;

class Bike{
	
	final void run() { //add final - we cannot override this method in child class
		System.out.println("Running ..............");
	}
}

class Honda extends Bike{
	void run() {
		System.out.println("Started ................");
	}
}
public class FinalMethodDemo {

	public static void main(String[] args) {

	}

}
