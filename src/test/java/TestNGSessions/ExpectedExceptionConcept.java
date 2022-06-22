package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name ="sucita";

	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void searchProductTest() {
		System.out.println("Macbook");
		int i = 9/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void TestingTest() {
		
	}
}
