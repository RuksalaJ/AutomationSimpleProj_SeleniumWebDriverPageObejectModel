import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;
public class check2 {
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
    	
        String baseUrl = "https://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
    
	    }
    }