package calenderPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClearTripScenario {
	
		public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https://www.cleartrip.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		
		WebElement FromLoc = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		FromLoc.sendKeys("Bangalore");
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
		
		WebElement ToLoc = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		ToLoc.sendKeys("chennai");
		driver.findElement(By.xpath("//p[contains(text(),'Chennai')]")).click();
		
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		
		
		for(;;)
		{ try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@aria-label='Tue Oct 25 2022']")).click();
			break;
			
		}catch(Exception e)
		{
			//driver.findElement(By.xpath(""))
		}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
