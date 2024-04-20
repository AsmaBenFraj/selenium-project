package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		//store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		WebElement btnNewWindow = driver.findElement(By.id("messageWindowButton"));
		btnNewWindow.click();

		//store and print the name of all the windows opened
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		//pass a window handle to another
		for(String handle1 : driver.getWindowHandles()) {
			
			driver.switchTo().window(handle1);
			System.out.println(handle1);
			
		}
		
		
	}

}
