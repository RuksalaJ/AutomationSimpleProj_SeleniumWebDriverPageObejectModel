package pageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static void submitForm(WebDriver driver) {
	driver.findElement(By.name("userName")).sendKeys ("tutorial");
	driver.findElement (By.name("password")).sendKeys("password");
	driver.findElement(By.name("submit")).click();
	
}}
//	private static By inputEmailID = By.xpath("//input[@placeholder='Email'] ");
//
//	private static By inputPasswrd = By.xpath("//input[@name='password'] ");
//	//private static By submitBtn = By.xpath("//form[@method='POST']/div[3]/button[1]/span[1]");
//	private static By submitBtn = By.xpath("//span[@class='ladda-label']//parent::button");
//	private static By clickFight = By.xpath("//a[text()='flights']");
//	
//	public static WebDriver driver;
//	public static WebDriver getDriver() {
//
//		return driver;
//	}
//	public static void login(WebDriver driver) {
//		driver.findElement(inputEmailID).sendKeys ("user@phptravels.com");
//		driver.findElement(inputPasswrd).sendKeys ("demouser");
//		driver.findElement(submitBtn).submit(); //driver.findElement(submitBtn).click(); driver.findElement(clickFight).click();
//	}
//}
