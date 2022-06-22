package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;

public class OrangeHrmSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initialize_Driver("Chrome");
		
		brUtil.navigateURL("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//driver.findElement(By.id("Form_submitForm_subdomain"));
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(eUtil.getBy("id", "Form_submitForm_subdomain"), "naveen@gmail.com");
		eUtil.doSendKeys(eUtil.getBy("id", "Form_submitForm_Name"), "naveen");
		eUtil.doSendKeys(eUtil.getBy("id", "Form_submitForm_Email"), "naveen@gmail.com");
		eUtil.doSendKeys(eUtil.getBy("id", "Form_submitForm_Contact"), "9773086652");
		
		
		


	}

}
