package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CheckColor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Open URL
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		Color color1 = Color.fromString(color);
		String actualColor = color1.asHex();
		Assert.assertEquals("#007bff" , actualColor);
		
		System.out.println("The background color is : " + actualColor);
		driver.quit();
		
	}

}
