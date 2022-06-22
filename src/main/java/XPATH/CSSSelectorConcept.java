package XPATH;

import org.openqa.selenium.By;

public class CSSSelectorConcept {

	public static void main(String[] args) {
	
		//CSS is not an attribute 
		//cascaded style sheet for look and feel
		//id -> #name or value of the id
		//class -> .className
		//it has slightly high performance when compared to xpath
		
		By.cssSelector("#input-firstname");
		By.cssSelector(".form-control");
		
		//tagname.classname#id
		//tagname#id.classname
		//#id.classname
		//.classname#id
		
		By.cssSelector(".form-control#input-firstname");
		By.cssSelector("#input-firstname.form-control");
		By.cssSelector("input.form-control");
		By.cssSelector("input#input-firstname");
		
		//using attr name
		//tagname(attrr=val)
		By.cssSelector("input[id=input-firstname]");
		
		//and condition
		By.cssSelector("input[id=input-firstname][class=form-control]");
		
		//OR doesnt work in CSS
		
		//Multiple classes
		//c1.c2.c3.c4...cn
		By.cssSelector(".col-sm-2.control-label");
		
		//which one is correct
		By.className("col-sm-2 control-label"); //-- this is incorrect as only one class name is allowed here
		By.cssSelector(".col-sm-2.control-label"); // -- this is correct
		By.xpath("//input[@class='col-sm-2 control-label']"); //this is correct
		
		//contains with CSS
		By.cssSelector("input[class*='login-email']");
		By.cssSelector("input[id*='user']");
		
		//stars with --^
		By.cssSelector("input[id^='user']");
		
		//ends with -- $
		By.cssSelector("input[id$='user']");
		
		//parent to child concept -- direct child element
		By.cssSelector("div.private-form__input-wrapper>input#username");
		
		//div.page >div ---2 elements ( direct child elements)
		//div.page div ---24 ( direct +indirect child elements)
		
		//child- parent concept - not available (backward traversing is not allowed)
		
		//following sibling concept
		//div.password-input + div
		
		//index
		//ul.footer-nav >li:nth-of-type(1)
		

	}

}
