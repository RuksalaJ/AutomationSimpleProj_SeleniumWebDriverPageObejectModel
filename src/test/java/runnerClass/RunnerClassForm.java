package runnerClass;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageBase.ConfirmationPage;
import pageBase.FightBook;
import pageBase.LoginPage;

public class RunnerClassForm {
    @Test

	public static void test () {

		//EdgeDriver driver=null;
		
		WebDriver driver=null;
		LoginPage loginPage=null;
		ConfirmationPage confirmationPage=null;
		FightBook fightBook=null;
		
		
		//try {

				//EdgeDriver driver=null;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\page object model-Automation Framework\\src\\main\\resources\\driver\\chromedriver-win64\\chromedriver.exe");
		

				 driver =new ChromeDriver();
				 driver.get("https://demo.guru99.com/test/newtours/");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//					String expectedTitle = "Demo Site";
//					String actualTitle = driver.getTitle();
//					if (actualTitle.contentEquals(expectedTitle)){
//					System.out.println("Test Passed!");
//					} else {
//					System.out.println("Test Failed");
//					}
//				String expectedTitle = " MantisBT ";
//				String actualTitle = driver.getTitle();
//				if (actualTitle.contentEquals(expectedTitle)){
//				System.out.println("Test Passed!");
//				} else {
//				System.out.println("Test Failed");
//				}
//				driver.findElement(By.name("userName")).sendKeys ("tutorial");
//				driver.findElement (By.name("password")).sendKeys("password");
					
				loginPage=new LoginPage();
				loginPage.submitForm(driver);
				
				confirmationPage=new ConfirmationPage();
				confirmationPage.waitForAlert(driver);
		
				
				fightBook=new FightBook();
				fightBook.bookingFight(driver);
				
				
				ChromeOptions options = new ChromeOptions();
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("change your password", false);
				options.setExperimentalOption("prefs", prefs);
				 driver = new ChromeDriver(options);
				 
//				 // 1. Cast WebDriver to TakesScreenshot
//			        TakesScreenshot scrShot = ((TakesScreenshot) driver);
//
//			        // 2. Call getScreenshotAs method to create a temporary image file
//			        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
//
//			        // 3. Move the file to your desired destination
//			        File destFile = new File("path/to/screenshots/screenshot.png");
//			        FileUtils.copyFile(srcFile, destFile);


//				
//		}
//		
//		
//		catch(Exception e) {
//			e.printStackTrace();
//			
//		}
//		
//		finally{
		//driver.quit();
		

		}
//				
//				driver.findElement(By.name("Login")).click();
//				driver.findElement(By.name("username")).sendKeys ("AutomationUser");
//				driver.findElement(By.name("Login")).click();
//				driver.findElement(By.name("password")).sendKeys ("zxcvbnm123!");
//				driver.findElement(By.name("Login")).click();
//				driver.findElement(By.name("Report Issue")).click();
//				 
//				driver.close();
		// TODO Auto-generated method stub

	}
		
		


