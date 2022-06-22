package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class googleTest extends baseTest {

	
	@Test(priority=1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority=2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

}
