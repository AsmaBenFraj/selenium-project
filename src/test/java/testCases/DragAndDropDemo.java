package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable/");

		Actions actions = new Actions (driver);

		WebElement from = driver.findElement(By.id("draggable"));

		WebElement to = driver.findElement(By.id("droppable"));

		actions.dragAndDrop(from, to).build().perform();

		//Verify text change into dropped!

		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("pass: from is dropped to target as expected");



		} else {

			System.out.println("fail: from could not be dropped to target as expected");

		}

		driver.quit();
	}

}
