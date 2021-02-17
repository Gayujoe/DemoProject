package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//selenium code
		
		// create driver object for chrome browser 
		
		//  we will strictly implement methods of web driver
		
		// Invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrie\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");

	

	}
	
}


