package part5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowKeyword {

	//FileNotFoundException changed by IOException because IOException is supper class
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr = null;
		fr = new FileReader("path tof file");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		Thread.sleep(3000);
	}

}
