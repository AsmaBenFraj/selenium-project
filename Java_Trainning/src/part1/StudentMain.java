package part1;

public class StudentMain {

	public static void main(String[] args) {

		//Object ==> instance of a class
		Student stu1 = new Student(10556, "Ghada", 'A');
		
		// 1 Assign values to variables by using reference variable
		stu1.sid = 10101;
		stu1.sname = "Asma";
		stu1.grade = 'A';
		stu1.display();
		
		// 2 Assign values to variables by using method
		stu1.getValues(10235, "Nejib", 'A');
		stu1.display();
		
		// 3 Assign values to variables by using constructor
		stu1.display();

	}

}
