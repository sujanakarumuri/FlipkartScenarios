package Scenarios;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.Assert;

/*
 * Navigate to flipkart
 * search for winter heater, select the first product in the serach results and click
 * product page will display
 * click on Add to cart button
 * verify the product in the cart
 * */

public class Scenario1_Flipkart {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("winter heater");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.partialLinkText("DARSHANAM WORLD ")).click();
		
		Set<String> list = driver.getWindowHandles();
		 Iterator<String> id = list.iterator();
		 String id1 = id.next();
		 String id2 = id.next();
		 driver.switchTo().window(id2);
		 String product = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();

		 
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		String cartprod = driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
		
		if(product.equals(cartprod))
		{
			System.out.println("product is in cart");
		}
		driver.close();		
		
		
		
		
		
	}

}
