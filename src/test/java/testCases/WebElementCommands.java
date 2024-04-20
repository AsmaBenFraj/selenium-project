package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Maximize browser
		driver.manage().window().maximize();

		// Open url application

		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);

		//Clear field
		//how to stock it in a webelement
		WebElement email = driver.findElement(By.id("Email"));
		//driver.findElement(By.id("Email")).clear(); we change it to
		String attValue = email.getAttribute("value");
		System.out.println("The value attribute is : " + attValue);
		email.clear();

		// Fill email
		//driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com"); this will change to
		email.sendKeys("admin@yourstore.com");
		Dimension dimensions = email.getSize();
		System.out.println( "Height : " + dimensions.height);//height
		System.out.println( "Width : " + dimensions.width);// width

		//Clear field
		WebElement password = driver.findElement(By.id("Password"));
		String attValue2 = password.getAttribute("id");
		System.out.println("The id attribute is : " + attValue2);
		password.clear();

		// Fill password
		password.sendKeys("admin");
		Point point = password.getLocation();//location
		System.out.println("X coordinate " + point.x);
		System.out.println("Y coordinate " + point.y);
		
		
		// Click on login button

		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));

		String attValue3 = btnLogin.getAttribute("type");
		System.out.println("The type attribute is : " + attValue3);
		//btnLogin.click(); too soon we click and look?

		//verifier si le btn afficher vrai/faux (stockage fe boolean) just affiche
		boolean status = btnLogin.isDisplayed();
		System.out.println("Status is " + status);
		
		//verifier if tle btn activer frai/faux active
		boolean status1 = btnLogin.isEnabled();
		System.out.println("Status is " + status1);
		
		//verifier if tle btn existe frai/faux( maybe grey ab=nd you can't click it)
		List <WebElement> btnLogin1 = driver.findElements(By.xpath("//button[@type='submit']"));
		if(btnLogin1.size() !=0)
		{
			System.out.println("The Login button existe ");
			
		}
		else
		{
			System.out.println("The Login button does not existe ");
		}
		
		btnLogin.click();

		driver.quit();





	}

}
