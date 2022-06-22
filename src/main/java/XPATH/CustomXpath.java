package XPATH;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {

		//xpath - address of element in DOM
		//Absolute xpath - exact path of the element 
		//relative xpath
		
		//htmltag[@attribute='value']

		By email = By.xpath("//input[@id='input-email']");
		By password =  By.xpath("//input[@id='input-password' and @type='password']");
		By searchBox = By.xpath("");
		
		// By email = By.xpath("//input[@id="\input-email\"]"); --- not recommended
		
		//index or position in xpath
		//By indexLoc = By.xpath("(//input[@class='form-control'])[position()=4]");
		//By indexLoc = By.xpath("(//input[@class='form-control'])[last()]");
		//By indexLoc = By.xpath("(//input[@class='form-control'])[last()-1]");
		
		By indexLoc = By.xpath("(//input[@class='form-control'])[4]");
		
		//text():
		////h2[text()="Gaming accessories"]
		
		//contains with arr()		
		////h2[contains(text(),'Gaming accessories')]
		//contains we use it when we have dynamic attributes
		
		//contains with attr1 and attr2 without contains
		//htmltag[contains(@attr1,'value') and (@attr2,'')]
		
		//contains with text:
		//fetch all the links which contains amazon text
		//htmltag[contains(text(),'value')]
		////a[contains(text(),'amazon')]
		
		//starts-with
		//h2[starts-with(text(),'Computer')]
	}

}
