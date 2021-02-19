package webdriverTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrie\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Chennai (MAA)']")).click();
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		 driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		 {

		 System.out.println("its disabled");

		 Assert.assertTrue(true);

		 }

		 else

		 {

		 Assert.assertTrue(false);

		 }
		
		 driver.findElement(By.id("divpaxinfo")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 Thread.sleep(2000L);
		 
		 WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
			Select dropdown=new Select(staticDropdown);
			dropdown.selectByIndex(3);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			WebElement Currencydropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdowns=new Select(Currencydropdown);
			dropdowns.selectByIndex(5);
			driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
			driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
			



		
	}

}
