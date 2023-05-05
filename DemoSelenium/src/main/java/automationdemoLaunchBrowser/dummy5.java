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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.ElementClickInterceptedException;

public class dummy5 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		 driver.manage().window().maximize();  
		  driver.get("https://www.easemytrip.com/");          
	        driver.findElement(By.id("FromSector_show")).sendKeys("kolkata",Keys.ENTER);          
	        driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai",	Keys.ENTER);  
	        driver.findElement(By.id("ddate")).click();  
	        driver.findElement(By.id("snd_4_08/08/2019")).click();  
	        driver.findElement(By.className("src_btn")).click();  
	        driver.findElement(By.xpath("//button[text()='Book Now']")).click();      
	}
}
