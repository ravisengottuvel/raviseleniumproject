package Session4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		
		//1 -- INVOKE
		System.setProperty("webdriver.chrome.driver", "E:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2 -- MAXIMIZE
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//3
		
		try 
		{
		
			driver.get("http://www.espncricinfo.com/");
			
			
			// GET COMMANDS
			
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			
			String pagetitle = driver.getTitle();
			System.out.println(pagetitle);
			
			// PAGE URL LENGTH COUNTS AND IT WILL DISPLAY
			
			String pagesource = driver.getPageSource(); 				
			int Pagesourcelength = pagesource.length();
			System.out.println(Pagesourcelength);
			
			// DISPLAY THE NAME AND DISPLAY THE LENGTH
			
			String myname = "RAVI";
			int mynamelen = myname.length();
			System.out.println(mynamelen);
			
			// NAVIGATE COMMANDS
			
			// NAVIGATE URL LAUNCHING
			driver.navigate().to("https://www.facebook.com/");
			
			// GO BACK TO OLD URL (First URL , Second URL, First URL)
			driver.navigate().back();
			
			// GO BACK TO OLD URL (First URL , Second URL, First URL, Second URL)
			driver.navigate().forward();
		
			
			
			
		
			
		} 
		catch (Exception e) 
		
		{
			// TODO: handle exception
		}
		
		driver.close();
		driver.quit();
		// TODO Auto-generated method stub

	}

}
