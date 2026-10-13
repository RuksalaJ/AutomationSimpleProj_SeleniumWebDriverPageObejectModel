import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;
public class check {

	@Test
	public static void test () {
		//EdgeDriver driver=null;
		//Logger.getLogger("org.openqa.selenium.devtools.CdpVersionFinder").setLevel(Level.OFF);

		EdgeDriver driver;

		//EdgeDriver driver=null;
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\RJEGATHEESAR\\Music\\eclipe works for practice\\simple\\driver2\");
		 driver =new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedTitle = "Demo Site";
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
		} else {
		System.out.println("Test Failed");
		}
		driver.findElement(By.name("userName")).sendKeys ("tutorial");
		driver.findElement (By.name("password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		driver.close();
		}}