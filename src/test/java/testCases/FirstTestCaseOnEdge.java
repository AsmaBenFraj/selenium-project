package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCaseOnEdge {

	public static void main(String[] args) {
		
		// Open Edge Driver
    WebDriver driver = new EdgeDriver();
    
	driver.manage().window().maximize();
    
    driver.get("https://mvnrepository.com/");
    
    driver.quit();
    

	}

}
