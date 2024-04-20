package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		// Switching to the Frame
		driver.switchTo().frame("a077aa5e");
		
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		System.out.println("we are switching to the right frame");
		image.click();
		System.out.println("we are done");
		//driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
