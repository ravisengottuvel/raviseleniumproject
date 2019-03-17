package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Work {

	private static final String WebElement = null;

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver Facebook = new ChromeDriver();
		
		Facebook.manage().window().maximize();
		Facebook.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try
		{
			Facebook.get("https://www.facebook.com/");
			WebElement txtSearch = Facebook.findElement(By.name("email"));
			txtSearch.sendKeys("ravicseau");
			
		} catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
	Facebook.close();
	Facebook.quit();
		
		
		
		// TODO Auto-generated method stub

	}

}
