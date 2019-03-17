package Session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) 
	
	{
		//1
		
		System.setProperty("webdriver.chrome.driver", "E:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//3
		
		try 
		{
		//driver.get("https://www.google.com");
			
			driver.get("https://www.google.com/gmail/");
			
			WebElement Gmail = driver.findElement(By.xpath("//input[@class='BHzsHc']"));
			WebElement Gmail1 = driver.findElement(By.xpath("//input[@class= 'nyoS7c UzCXuf EIlDfe']"));
			Gmail.sendKeys("ravicseau");
		
			
		
		//WebElement txtSearch = driver.findElement(By.name("q")); // Entering the Text 
		//txtSearch.sendKeys("Success");
		
		//WebElement linkButton = driver.findElement(By.className("gb_P")); // Clicking Link Button
		//linkButton.click();
		
		//WebElement txteSearch = driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")); // Xpath
		//txteSearch.sendKeys("Hey");
		
		
		
		
		
		Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		//5
		driver.close();
		driver.quit();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
