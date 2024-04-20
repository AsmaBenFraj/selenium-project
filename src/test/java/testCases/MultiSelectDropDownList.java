package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement multiSelect = driver.findElement(By.id("cars"));
		WebElement slider = driver.findElement(By.id("fixedban"));
		Actions actions = new Actions(driver);
		actions.moveToElement(slider, 45, 0).click().build().perform();
		Select multiplelist = new Select(multiSelect);
		multiplelist.selectByValue("audi");
		multiplelist.selectByValue("opel");
		
		
		// all the searches found are related multiselect
		//for (WebElement option : options) {
            //if (option.getText().equals("Option 1") || option.getText().equals("Option 2")) {
               // option.click();
	}

}
