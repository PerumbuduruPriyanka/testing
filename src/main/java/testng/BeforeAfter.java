package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfter {
WebDriver driver;
@BeforeClass
void OpenApp()
{
	driver=new ChromeDriver();
	driver.get("https://www.demo.guru99.com/v4/");
}
@Test(priority=1)
void Search()
{
	boolean Guru99=driver.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed();
			Assert.assertEquals(Guru99, true);
}
@Test(priority=2)
void Login()
{
	driver.findElement(By.name("uid")).sendKeys("mngr511752");
	driver.findElement(By.name("password")).sendKeys("yrepuvY");
	driver.findElement(By.name("btnLogin")).click();
}
@AfterClass
void CloseApp()
{
	driver.close();
}
}
