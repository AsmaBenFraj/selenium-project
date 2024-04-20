package part2;

public class OverloadingMainMethod {
	
	public void main(int x) {
		System.out.println(x);
	}
	
	public void main(int x, int y) {
		
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		
		OverloadingMainMethod om = new OverloadingMainMethod();
		om.main(100);
		om.main(10, 30);
	}

}
