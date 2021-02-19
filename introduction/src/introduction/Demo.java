package introduction;

import org.openqa.selenium.By;
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
		/*driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//input[@value='Log In to Existing Account']")).click();
        driver.findElement(By.id("email")).sendKeys("pk.gayathri11@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("jiju7475");
        driver.findElement(By.linkText("Forgotten account?")).click();*/
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
	    driver.findElement(By.id("Login")).click();
	    System.out.println(driver.findElement(By.id("error")).getText());
	
        

	}
	
}


