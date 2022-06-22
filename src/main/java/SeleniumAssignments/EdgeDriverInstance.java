package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EdgeDriverInstance {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.google.com/";
		
		System.out.println(actualURL);
		
		if(actualURL.equals(expectedURL)) {
			//System.out.println(driver.getTitle());
			System.out.println("Correct");
			
		}
		else {
			System.out.println("Closing the driver...");
			driver.close();
		}

	}

}
