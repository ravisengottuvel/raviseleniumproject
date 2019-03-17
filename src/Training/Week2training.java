package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2training {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try 
		{
		driver.get("http://www.espncricinfo.com/");	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String tle = driver.getTitle();
		System.out.println(tle);
		
		String pge = driver.getPageSource();
		int len = pge.length();
		System.out.println(len);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		driver.close();
		driver.quit();
		// TODO Auto-generated method stub

	}

}
