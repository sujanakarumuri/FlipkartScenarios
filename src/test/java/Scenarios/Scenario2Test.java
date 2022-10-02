package Scenarios;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Navigate to flipkart, search redmi mobile
 * capture all the mobiles in the current page whose RAM is 4GB(using xpath)
 * print in console
 * @author sujana
 *
 */
public class Scenario2Test {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
		List<WebElement> lst = driver.findElements(By.xpath("//li[contains(text(),'4 GB RAM ')]/../../../div[1]"));
		 
		for(int i=0;i<lst.size();i++)
		{
			WebElement ele = lst.get(i);
			String title = ele.getText();
			System.out.println(title);
			 
			//string title=lst.get(i).getText();
			//System.out.println(title);
						
		}	
		
		driver.close();

	}

	

}
