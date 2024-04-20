package part1;

public class Calculation {
	
	int x = 20;
	int y = 10;
	
//	1/ case - 1:  Not taking parameters and also not returned any value
	
//	void sum() {
//		//body
//		System.out.println(x+y);
//	}
	
//	2/ case - 2 : Not taking parameters but returning value
	
//	int sum() {
//		return (x+y);
//	}
	
//	3/ case - 3 : Taking parameters but not returned a value
	
//	void sum(int a, int b) {
//		System.out.println(a+b);
//	}

	
//	4/ case - 4 : Taking parameters and also returning a value
	int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		//cal.sum(); // case 1
		
//		int res = cal.sum(); // case 2
//		System.out.println(res);
		
		//cal.sum(50, 20); // case 3
		
		System.out.println(cal.sum(20, 30)); // case 4

		
	}

}
