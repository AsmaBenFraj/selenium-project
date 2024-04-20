package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTestCase {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Maximize browser
		driver.manage().window().maximize();

		// Open url application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		//Delete cookies
		driver.manage().deleteAllCookies();

		//Clear field
		driver.findElement(By.id("Email")).clear();

		// Fill email
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		//Clear field
		driver.findElement(By.id("Password")).clear();

		// Fill password
		driver.findElement(By.id("Password")).sendKeys("admin");

		// Click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click on login button with exmplicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		btnLogin.click();

		//Validation enter on home page
		String text = driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		Assert.assertEquals(text, "Dashboard");
		// Close browser
		driver.close();
		//Kill session // Kill browsers
		driver.quit();
	}

}
