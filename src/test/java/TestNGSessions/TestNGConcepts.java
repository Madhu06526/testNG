package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcepts {

	//global precondition
	//pre-conditions
	//test-steps
		//data
		//assert-- exp vs actual
	//post steps
	
	@BeforeSuite
	public void connectWithDB() {
	
		System.out.println("BS---connectWithDB()");
	}
	@BeforeTest
	public void createTestUser() {
	
		System.out.println("BT---createTestUser()");
	}
	@BeforeClass
	public void launchBrowser() {
	
		System.out.println("BC---launchBrowser()");
	}	
	@BeforeMethod
	public void longIn() {
	
		System.out.println("BM---longIn()");
	}	
	@Test
	public void searchTest() {
	
		System.out.println("Test---search_test()");
	}	
	@Test
	public void addToCartTest() {
	
		System.out.println("Test---addToCartTest()");
	}	
		
	@Test
	public void payment_Test() {
	
		System.out.println("Test---payment_Test()");
	}	
	@AfterMethod
	public void logout() {
		System.out.println("AM---logout()");
	}
	@AfterClass
	public void closeTheBrowser() {
		System.out.println("AC---closeTheBrowser()");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT---deleteUser()");
	}
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS---disconnectWithDB()");
		//System.out.println("AS---disconnectWithDB()");
	}
	
}
