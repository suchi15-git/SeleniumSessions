package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.id("imageTemplateContainer")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
		
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2022");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Ford");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Model number 420");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Black");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("120");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("563638399393");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Suchita Kadge");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("52 krishna");
		
		Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-12")));
		select.selectByVisibleText("Alabama");
		
		driver.findElement(By.id("FSsubmit")).click();
		
		driver.switchTo().defaultContent(); //come back to the main page and interact with normal elements
		//driver.switchTo().parentFrame();
		
		driver.close();

	}

}
