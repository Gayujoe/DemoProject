package FunctionalTesting;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrie\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] Itemsneeded={"Cucumber","Brocolli","Mushroom","Onion"};
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			
			String formattedName=name[0].trim();
			
			List Itemsneededlist = Arrays.asList(Itemsneeded); 
			
			
			
			if(Itemsneededlist.contains(formattedName))
				
			{
				j++;
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==Itemsneeded.length)

				{
				  break;
				  
				}
			}
		}

	}

}
