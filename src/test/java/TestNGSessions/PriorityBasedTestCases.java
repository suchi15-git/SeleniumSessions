package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityBasedTestCases {

@Test(priority=-1)
public void aTest() {
	System.out.println("A Test");
}

@Test(priority=0, enabled=false)
public void bTest() {
	System.out.println("b Test");
}

@Test(priority=-3 ,enabled=false)
public void cTest() {
	System.out.println("c Test");
}

@Test(priority=1)
public void dTest() {
	System.out.println("d Test");
}

@Test(priority=4)
public void eTest() {
	System.out.println("e Test");
}

}
