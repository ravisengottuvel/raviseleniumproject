package Session4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Easy {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "E:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				

		try 
		{
			driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
			WebElement txtfirstname = driver.findElement(By.name("first_name"));
			txtfirstname.sendKeys("Ravi");
			WebElement txtlastname = driver.findElement(By.name("last_name"));
			txtlastname.sendKeys("Sengottuvel");
			WebElement txtemail = driver.findElement(By.name("email"));
			txtemail.sendKeys("ravi.q1988@gmail.com");
			WebElement txtphone = driver.findElement(By.name("phone"));
			txtphone.sendKeys("9025069697");
			WebElement txtaddress = driver.findElement(By.name("address"));
			txtaddress.sendKeys("Thiruvanmayur");
			WebElement txtcity = driver.findElement(By.name("city"));
			txtcity.sendKeys("Chennai");
			WebElement btnsend = driver.findElement(By.name("submit"));
			btnsend.click();
			webelement 
			
			
			
			Thread.sleep(5000);
			
			
		} catch (Exception e)
		
		{
			// TODO: handle exception
		}
		
		driver.close();
		driver.quit();
		// TODO Auto-generated method stub

	}

}
