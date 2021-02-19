package webdriverTechniques;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrie\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 Thread.sleep(2000L);
		 
		 for(int i=1;i<5;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 //Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 adults");
		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 adult");
		 //System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Chennai (MAA)']")).click();
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		 driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
			
	
}
}