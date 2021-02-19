package webdriverTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrie\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.xpath("//input[@data-after-show='afterShow']")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		WebElement AdultDropdown = driver.findElement(By.id("Adults"));
		Select adult = new Select(AdultDropdown);
		adult.selectByIndex(1);
		System.out.println(adult.getFirstSelectedOption().getText());
		WebElement Childrendropdown = driver.findElement(By.id("Childrens"));
		Select childrens = new Select(Childrendropdown);
		childrens.selectByIndex(3);
		System.out.println(childrens.getFirstSelectedOption().getText());
		driver.findElement(By.id("MoreOptionsLink")).click();
		WebElement Classdropdown = driver.findElement(By.id("Class"));
		Select Class = new Select(Classdropdown);
		Class.selectByVisibleText("Premium Economy");
		System.out.println(Class.getFirstSelectedOption().getText());
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		// driver.findElement(By.xpath("//ul[@id='ui-id-3']")).click();
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
