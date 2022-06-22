package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
	
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initialize_Driver("chrome");
		brUtil.navigateURL("https://www.amazon.com");
		String actualTitle = brUtil.getPageTitle();
		System.out.println("title is:"+actualTitle);
		
		if(actualTitle.contains("Amazon")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		System.out.println(brUtil.getPageSource().contains("Actionable Analytics"));
		brUtil.closeBrowser();
		

	}

}
