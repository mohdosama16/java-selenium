package hellowwrold;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplore {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DR\\Desktop\\seli\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com");
		
		

	}

}
