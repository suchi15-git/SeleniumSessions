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

public class TestNGAnnotations {
	
	//global pre-conditions
	// login
	//registration
	// expected vs actual
	//logout
	//close browser
	
	@BeforeSuite	
	public static void connectWithDB() {
		System.out.println("Connect with DB- before suite annotation");
	}
	
	@BeforeTest
	public static void createUser() {
		System.out.println("Create new user before Test annotation");
	}

	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Launch browser before class");
	}
	
	@BeforeMethod
	public static void loginToApp() {
		System.out.println("Loggin to application before method");
	}
	
	@Test
	public static void homePageTitle() {
		System.out.println("Test- Home page");
	}
	
	@Test
	public static void homePageURL() {
		System.out.println("Test- Home page url");
	}
	
	@Test
	public static void isUserLoggedInTest() {
		System.out.println("Test-user logged in test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("User is logged out- AM");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed- AC");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("Delete user- AT");
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("Close the DB- AS");
	}
}
