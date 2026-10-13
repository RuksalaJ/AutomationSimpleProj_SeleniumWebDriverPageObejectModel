import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;
public class check3 {
	WebDriver driver;
@Test

	public  void openBrowser() {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.">driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.">driver","G:\\chromedriver.exe");
		
		
		
		//WebDriver driver;


				System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\page object model-Automation Framework\\src\\main\\resources\\driver\\chromedriver-win64\\chromedriver.exe");
				//EdgeDriver driver;
				 driver = new ChromeDriver();
				 
				 
					
					
							driver.get("https://mantisbt.org/bugs/view_all_bug_page.php");
							driver.manage().window().maximize();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//							String expectedTitle = " MantisBT ";
//							String actualTitle = driver.getTitle();
//							if (actualTitle.contentEquals(expectedTitle)){
//							System.out.println("Test Passed!");
//							} else {
//							System.out.println("Test Failed");
//							}
//							driver.findElement(By.name("userName")).sendKeys ("tutorial");
//							driver.findElement (By.name("password")).sendKeys("password");
							driver.findElement(By.name("Login")).click();
							driver.findElement(By.name("username")).sendKeys ("AutomationUser");
							driver.findElement(By.name("Login")).click();
							driver.findElement(By.name("password")).sendKeys ("zxcvbnm123!");
							driver.findElement(By.name("Login")).click();
							driver.findElement(By.name("Report Issue")).click();
							 
							driver.close();
					// TODO Auto-generated method stub

}}	
