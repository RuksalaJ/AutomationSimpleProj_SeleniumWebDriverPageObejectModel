package pageBase;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.io.FileHandler;
import java.io.IOException;

public class FightBook {
	public static void bookingFight(WebDriver driver) {

		//driver.findElement(By.name("Flights")).click();
		// Java syntax
		driver.findElement(By.linkText("Flights")).click();

		
//		String expectedTitle = "Flight Details";
//        String actualTitle = driver.getTitle();

        // Approach A: Exact Match Validation
        //Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch failure!");

        // Approach B: Partial Match Validation
        //Assert.assertTrue(actualTitle.contains("Details"), "Title does not contain keyword!");

        WebElement dropdownElement1 = driver.findElement(By.name("passCount"));
        Select dropdown = new Select(dropdownElement1);
        
        dropdown.selectByIndex(1); 
        
        WebElement dropdownElementON = driver.findElement(By.name("fromMonth"));
        Select dropdown1 = new Select(dropdownElementON);
        
        dropdown1.selectByIndex(5); 
        
        
        WebElement dropdownElementday = driver.findElement(By.name("fromDay"));
        Select dropdown11 = new Select(dropdownElementday);
        
        dropdown11.selectByIndex(7); 
        
        WebElement dropdownElement = driver.findElement(By.name("toPort"));
        Select countrySelect = new Select(dropdownElement);
        countrySelect.selectByVisibleText("London");
        
        
        WebElement dropdownElementRE = driver.findElement(By.name("toDay"));
        Select dropdown111 = new Select(dropdownElementRE);
        
        dropdown111.selectByIndex(7); 
        
        // radio button
        
     // Java example to select a radio button by matching its value attribute dynamically
//        List<WebElement> options = driver.findElements(By.name("servClass"));
//        for (WebElement option : options) {
//            if (option.getAttribute("Business").equals("Business class")) {
//                option.click();
//                break;
//            }
//        }
//        WebElement button=driver.findElement(By.xpath(("//input[name='servClass'])[1]"));
//
//        		button.click();
//        		
        		
        		WebElement radioBtn = driver.findElement(By.xpath("//input[@name='servClass'][2]"));
        		radioBtn.click();

        		// Verify if the button is selected
        		boolean isChecked = radioBtn.isSelected();

    	//driver.findElement(By.linkText("findFlights")).click();
        		
        		// Screenshot 

        		 File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        	        File destFile = new File("C:\\Users\\DELL\\Downloads\\page object model-Automation Framework\\src\\main\\resources\\screenshots\\step_success.png");
        	        try {
						FileUtils.copyFile(srcFile, destFile);
						System.out.println("Screenshot successfully saved!");
					} catch (IOException e) {
						 System.out.println("Failed to save screenshot: " + e.getMessage());
						
					}
        	        
        	        
        	  
        	        
        	        
        		// checking purpose 
        		try {
        		    // Your risky automation code
        			driver.findElement(By.name("findFlights")).click();
        		} catch (Exception e) {
        		    // 1. Cast WebDriver to TakesScreenshot
        		    TakesScreenshot ts = (TakesScreenshot) driver;
        		    
        		    // 2. Capture the file
        		    File source = ts.getScreenshotAs(OutputType.FILE);
        		    
        		    // 3. Save to destination
        		    try {
        		        FileHandler.copy(source, new File("./screenshots/error_screenshot.png"));
        		    } catch (IOException ioException) {
        		        ioException.printStackTrace();
        		    }
        		    throw e; // Rethrow the exception so the test report accurately marks it as failed
        		}
    	//impo
    	//driver.findElement(By.name("findFlights")).click();
        
//			driver.findElement(By.name("userName")).sendKeys ("tutorial");
//			driver.findElement (By.name("password")).sendKeys("password");
//			driver.findElement(By.name("submit")).click();
//			
//		
//		WebElement radioButton = driver.findElement(By.name("oneway"));
//		radioButton.click();
//   String captured_text ="After flight finder - No Seats Avaialble";
//		
//    	if (captured_text = driver.find_element(By.ID, "After flight finder - No Seats Avaialble").text) {
//    		driver.findElement(By.name("findFlights")).click();
//    	} else {
//    	    // Code to execute if condition is false
//    	}
        		
        		
      
        			 
        			
	}}
