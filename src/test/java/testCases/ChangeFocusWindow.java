package testCases;

import java.util.Set;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChangeFocusWindow {

	public static void main(String[] args) {
		// https://demo.guru99.com/test/guru99home/
		//lel page elli ba3ed w tenzel ay button

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		WebElement slider = driver.findElement(By.id("interstitial"));
		Actions actions = new Actions(driver);
		actions.moveToElement(slider, 65, 0).click().build().perform();
		driver.switchTo().frame("a077aa5e");
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		//pass a window handle to another
		for(String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);

		}
		WebElement btnTesting = driver.findElement(By.id("menu-item-3173"));
		btnTesting.click();
		// to click on one of the options appearing
		//driver.findElement(By.id("menu-item-4572")).click();

		//If I want to go back to the original tab( first we need For , if)
		//driver.switchTo().window(handles);


		//String text = driver.findElement(By.className("nav-drop-title-wrap")).getText();
		//Assert.assertEquals(text, "You have clicked on btn Testing in another Tab");

	}

}
