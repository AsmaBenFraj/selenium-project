package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillFieldUsingJavaScriptExecutor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)","");

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("document.getElementBy.Id('userName').value = 'test';");
		executor.executeScript("document.getElementBy.Id('userEmail').value = 'ahmedbnh01@gmail.com';");
		executor.executeScript("document.getElementBy.Id('currentAddress').value = 'Ennaser Ariana';");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement currentAddress;
		currentAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAddress")));
		
		WebElement permanentAddress;
		permanentAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("permanentAddress")));
		
		
		//execute Script Javascript to perform the actions crtl A ctrl c Ctrl v
		
		executor.executeScript("arguments[0].select();", currentAddress);
		executor.executeScript("document.execCommand('copy');");
		executor.executeScript("arguments[1].focus();arguments[0].select();", permanentAddress,permanentAddress);
		executor.executeScript("document.execCommand('paste');");
	}

}
