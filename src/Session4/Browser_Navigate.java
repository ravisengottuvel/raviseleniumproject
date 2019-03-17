package Session4;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigate {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try 
		{
			driver.get("https://www.google.com/");
			WebElement btnsearch = driver.findElement(By.xpath("//a[text() ='Sign in']"));
			btnsearch.click();	
			//WebElement txtfirstname = driver.findElement(By.name("first_name"));
			//txtfirstname.sendKeys("Ravi");
			
			driver.navigate().back();			
			driver.navigate().forward();
			
			driver.navigate().to("https://www.facebook.com/");
			driver.navigate().refresh();
		
			
			
		} catch (Exception e) 
		
		{
			// TODO: handle exception
		}
		
		driver.close();
		driver.quit();
		
	}

}
