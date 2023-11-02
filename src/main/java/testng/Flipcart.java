package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipcart {
	WebDriver driver;
	@Test(priority=1 )
	void OpenApp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	}
@Test(priority=2)
	void Login()
	{
		
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9492805938");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}
			
	@Test(priority=3)
			
			
	void search()
	{
		System.out.println("This is search");
	}
@Test(priority=4)
	void CloseApp()
	{
		driver.close();
	}
	

}
	



