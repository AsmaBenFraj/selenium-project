package part3;

class A{ // Parent

	int a;

	void display() {
		System.out.println(a);
	}
}

class B extends A { //B is child class, A is parent class

	int b;
	void print() {
		System.out.println();
	}

}

// Multilevel
class C extends B{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class InheritanceExamples {

	public static void main(String[] args) {

		//Single 
		A aobj = new A();
		aobj.a = 120;
		aobj.display();

		B bobj = new B();
		bobj.a = 200;
		bobj.b = 20;
		bobj.display();
		bobj.print();
		
		//Multilevel
		C cobj = new C();
		cobj.a = 10;
		cobj.b = 30;
		cobj.c = 60;
		
		cobj.display();
		cobj.print();
		cobj.show();

	}

}
