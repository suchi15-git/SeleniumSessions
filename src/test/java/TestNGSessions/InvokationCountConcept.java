package TestNGSessions;

import org.testng.annotations.Test;

public class InvokationCountConcept {

	@Test(invocationCount=10)
	public void createUser() {
		System.out.println("User creation..");
	}

}
