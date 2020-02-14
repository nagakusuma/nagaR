package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logintest {
	@Test
	public void userShouldBEalbletoadddeposit() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://techfios.com/test/billing/?ng=login/");

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	
	
//	driver.findElement(By.linkText("Add Deposit")).click();
//	driver.findElement(By.xpath("//select[@name='account']//child::option[5]")).click();
//	
//	driver.findElement(By.xpath("//input[@id='description']")).sendKeys("bank");
//	driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10008");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[@id='submit']")).click();
//	
//	String datavalidator="//a[contains(text(),'bank')]";
//	
//	WebDriverWait wait=new WebDriverWait (driver,10);
//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(datavalidator)));
//	//String expected="bank";
//	//String actual=driver.getTitle();
//	Thread.sleep(3000);
	driver.close();
	driver.quit();
	
	

	

	}
	
	
	

}
