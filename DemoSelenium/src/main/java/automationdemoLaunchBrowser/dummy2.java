package automationdemoLaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dummy2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String ExpectedTitle = "Welcome Mercury Tours!"; 
		String ActualTitle = "";
		
		driver.get(baseUrl);
		ActualTitle = driver.getTitle();
		 
		if(ActualTitle.contentEquals(ExpectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
			
		driver.close();
		Thread.sleep(10000);
	}	
	
}
