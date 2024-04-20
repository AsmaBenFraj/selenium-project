package part5;

public class ExceptionExamples {

	public static void main(String[] args) {
		
//		ArithmeticException
		int a = 100;
		try {
		System.out.println(a/0);
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Entred into catch block");
		}
		
		
//		NullPointerException
		String s = null;
		
		try {
		System.out.println(s.length());
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Entred into catch block");
		}
		
		//NumberFormatExcpetion
		String x = "abc";
		int i = Integer.parseInt(x);
		
//		ArrayIndexOutPutOfBundException
		int arr[] = new int[5];
		arr[10] = 100;


	}

}
