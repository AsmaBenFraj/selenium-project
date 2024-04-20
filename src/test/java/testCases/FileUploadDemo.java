package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				//Maximize browser
				driver.manage().window().maximize();

				// Open url application

				String url = "http://demo.guru99.com/test/upload/";
				driver.get(url);
				
				//Choisir un file
				WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
				uploadFile.sendKeys("F:\\Auto avec Zied\\note.txt");
				
	}

}
