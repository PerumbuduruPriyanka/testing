package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationPriority {
WebDriver driver;
	
	@Test (priority=1)
	void openApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
	}
	@Test (priority=2)
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr520094");
		driver.findElement(By.name("password")).sendKeys("yhUzegE");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test(priority=3)
	void Search()
	{
		System.out.println("Search");
	}
	@Test (priority=4)
	void Closeapp()
	{
		driver.close();
	}

}
