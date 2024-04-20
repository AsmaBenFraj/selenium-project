package part1;

public class Empl {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}

	public static void main(String[] args) {
		
		//Creating object 1
		Empl emp1 = new Empl();
		emp1.eid = 101;
		emp1.ename = "Karim";
		emp1.job = "Test automation";
		emp1.sal = 80.00;
		emp1.deptno = 13;
		emp1.display();
		
		//Creating object 2
		Empl emp2 = new Empl();
		emp2.eid = 102;
		emp2.ename = "Sawssen";
		emp2.job = "Test manager manual";
		emp2.sal = 85.00;
		emp2.deptno = 10;
		emp2.display();
	}

}
