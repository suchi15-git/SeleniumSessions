package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil {
	static WebDriver driver;
	

	public  JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//remove webdriver implements webdriver and javascriptexecutor
	public  String getTitleByJS() {
		JavascriptExecutor Js =  (JavascriptExecutor) driver;
		return Js.executeScript("return document.title").toString();
	}
	
	public void refreshpageByJS() {
		JavascriptExecutor Js =  (JavascriptExecutor) driver;
		Js.executeScript("history.go(0)");
	}
	
	public void navigateTobackpage() {
		JavascriptExecutor Js =  (JavascriptExecutor) driver;
		Js.executeScript("history.go(-1)");
	}
	
	public void navigateTonextpage() {
		JavascriptExecutor Js =  (JavascriptExecutor) driver;
		Js.executeScript("history.go(1)");
	}
	
	public void generateAlertByJS(String message) {
		JavascriptExecutor Js =  (JavascriptExecutor) driver;
		Js.executeScript("alert('" + message + "')");
	}
}
