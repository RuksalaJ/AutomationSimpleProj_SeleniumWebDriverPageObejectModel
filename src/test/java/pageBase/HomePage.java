package pageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
		private static By inputEmailID = By.xpath("//input[@placeholder='Email'] ");

		private static By inputPasswrd = By.xpath("//input[@name='password'] ");
		//private static By submitBtn = By.xpath("//form[@method='POST']/div[3]/button[1]/span[1]");
		private static By submitBtn = By.xpath("//span[@class='ladda-label']//parent::button");
		
		
		private static By loginButton = By.xpath("//*[@id=\"breadcrumbs\"]/ul/li/div/a[1]");
		
		public static WebDriver driver;
		public static WebDriver getDriver() {

			return driver;
		}
		public static void login(WebDriver driver) {
			driver.findElement(loginButton).click();
			driver.findElement(By.name("username")).sendKeys ("AutomationUser");
			driver.findElement(loginButton).click();
			driver.findElement(By.name("password")).sendKeys ("zxcvbnm123!");
			driver.findElement(loginButton).click();
			driver.findElement(By.name("Report Issue")).click();
		}
	}


