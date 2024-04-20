package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadDemo2 {

	public WebDriver driver;
	public WebDriverWait wait; 
	private static String filePath = "F:\\Auto avec Zied\\note.txt";

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
@Test
	public void fileUploadTest() throws InterruptedException {
		WebElement btnUploadFile = driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button"));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
		btnUploadFile.click();
		uploadFileWithRobot(filePath);
		Thread.sleep(3000);

	}


	@AfterClass
	public void tearDown() {

		driver.quit();
	}
	//file upload by Robot class after (uploadFileWithRobot)create a class
	public void uploadFileWithRobot(String PathToFile) {

		StringSelection stringSelection = new StringSelection(PathToFile);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);

		Robot robot = null;

		try {
			robot = new Robot();

		}catch(AWTException e) {
			e.printStackTrace();
		}

		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(250);		
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}

