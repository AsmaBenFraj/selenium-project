package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Open URL
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);

		//Get the text
		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();
		System.out.println("Title of the page is: " + titlePage);
		System.out.println("Length of the page is: " + titleLength);


		// Get current URL
		String actualUrl = driver.getCurrentUrl();

		//Verify if we got the right URL
		if(actualUrl.equals(url)) {
			System.out.println("sucessfull verification - The correct url is opened");

		}else System.out.println("Verfication failed - an uncorrect url is opened");

		System.out.println("Actual url is : " +actualUrl);
		System.out.println("Expected url is : " +url);

		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();
		System.out.println("Lenght of the source page is: " + lengthSourcePage);
		
		driver.quit();
	}

}
