package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement list = driver.findElement(By.id("oldSelectMenu"));
		Select dropDownList = new Select(list);
		
		// Select by index
		dropDownList.selectByIndex(3);
		// Select by value
		dropDownList.selectByValue("6");
		// Select by visibletext
		dropDownList.selectByVisibleText("Indigo");
		
		
		
		
	}

}
