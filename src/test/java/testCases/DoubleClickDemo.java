package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize browser
		driver.manage().window().maximize();

		// Open url application
		driver.get("https://demoqa.com/buttons");

		//instantiate Action class
		Actions actions = new Actions (driver);

		//retrieve webelement to perform double click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));


		//Double click on the button
		actions.doubleClick(btnDoubleClick).perform();

		//Validation enter on home page
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(text, "You have done a double click");

		//Kill session // 
		//driver.quit();

	}

}
