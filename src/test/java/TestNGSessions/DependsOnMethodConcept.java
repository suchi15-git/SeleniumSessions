package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	//AAA- test should be written independently

	@Test(enabled=true)
	public void HomePageTest() {
		System.out.println("HP Test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="HomePageTest")
	public void searchTest( ) {
		System.out.println("Search Test");
	}
	
	@Test(dependsOnMethods="HomePageTest")
	public void addToCartTest() {
		System.out.println("Add to cart test");
	}
	
}
