package pageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	
	public static void waitForAlert(WebDriver driver) {
		String expectedTitle = "Login Successfully";
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
		} else {
		System.out.println("Test Failed");
		}

		
		driver.getCurrentUrl();
		driver.navigate().to("https://demo.guru99.com/test/newtours/login_sucess.php");
		
		driver.navigate().refresh();
}
}