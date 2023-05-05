package automationdemoLaunchBrowser;


import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import groovy.json.JsonGenerator.Options;





public class GoogleLaunch 
{
	public static void main(String[] args) throws InterruptedException
	{
		//set the chrome path
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32 (4)\\chromedriver.exe");
		
		//set option for chrome new version
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		//launch google		
		driver.get("https://www.google.com");
		
		//print the title in console
		System.out.println(driver.getTitle());
		
		//Print the Currenturl in console
		System.out.println(driver.getCurrentUrl());
		
		
		//maximise the browser window
		driver.manage().window().maximize();

		
		
		//wait the screen
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter selenium tutorial  in search box
		driver.findElement(By.name("q")).sendKeys("selenium tutorial",Keys.ENTER);
		
		Thread.sleep(10000);
		
		//List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li[3]/descendant::div[@classs='wM6W7d']")); 
		List<WebElement> list= driver.findElements(By.xpath("")); 
		
		
		System.out.println(list.size());
		
		for(int i =0; i<list.size(); i++)
		{
			String listitem = list.get(i).getText();
			
			if(listitem.contains("selenium tutorial java"))
			{
				list.get(i).click();
				break;
			}
			
			
		}
		
		//click the search button
		//driver.findElement(By.name("btnK")).click();

	
		
	
	}
}
