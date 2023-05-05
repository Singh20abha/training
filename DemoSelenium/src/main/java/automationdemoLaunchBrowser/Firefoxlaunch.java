package automationdemoLaunchBrowser;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.ElementClickInterceptedException;

public class Firefoxlaunch
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver;
		
		//set path for firefox driver
		System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
		//set binary data
		FirefoxOptions options = new FirefoxOptions();
    	options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);
        
        
     // Maximize the browser
        driver.manage().window().maximize();
        
     //launch firefox   
        driver.get("https://www.bing.com//");
        Thread.sleep(2000);
        
     //send google.com/search in search box   
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("http://www.google.com/search");
        Thread.sleep(2000);
      
        
     //print title and url in console   
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.print("Title:" +title);
        System.out.print("URL:" +url);
        
        
      //close the browser
        driver.close();
	}
}
