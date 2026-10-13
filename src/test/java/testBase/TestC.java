//package testBase;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//
//import pageBase.LoginPage;
//
//public class TestC ex {
//	
//	@Test
//	public void Test() throws Exception{
//		
		
		        
		 
//	ExtentTest test4 = extent.createTest("start the chrome", "login....");
//	driver .get("https://www.phptravels.net/login");
//	test4. pass ("open browser..........");
//	//creates a toggle for the given test, adds all log events under it
//	ExtentTest = extent.createTest ("FightLogin", "testcase ...");
//	//log(status, details)
//	test.1og(Status. INFO, "This step shows usage of log(status, details");
//	// info(details)
//	test. info("This step shows usage of info(details)");
//	// log with snapshot
//	test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png"). build ());
//	//test with snapshot
//	test. addScreenCaptureFromPath("screenshot.png");
//	ExtentTest test1 = extent. createTest ("loginPage", "login....");
//	LoginPage = new LoginPage() ;
//	LoginPage.Login(driver);
//	//ginPage.clickBtn() ;
//
//
//
//	fightPage = new FightPage();
//	fightPage.findFight (driver);
//	fightBookingPage = new FightBookingPage();
//	fightBookingPage.booking(driver);
//	
//	@AfterTest
//	public void closeChrome() {
//	ExtentTest test5 = extent.createTest("close the chrome", "login... ");
//	driver.quit();
//	test5. pass("close browser");
//	
//	}
//	@AfterSuite
//	public void closeM(){
//
//	Extent.flush();
//	}}
