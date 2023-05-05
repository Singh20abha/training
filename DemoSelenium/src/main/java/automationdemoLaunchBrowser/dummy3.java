package automationdemoLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dummy3
{
	 public static void main(String[] args) throws InterruptedException
	 {
		 //System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	    	WebDriver driver = new FirefoxDriver();
	       
	    	String baseUrl = "http://www.facebook.com";
	        String tagName = "";
	        
	        driver.get(baseUrl);
	        tagName = driver.findElement(By.id("email")).getTagName();
	        System.out.println(tagName);
	        Thread.sleep(6000);
	        driver.close();
	        System.exit(0);
	        
	    	
	    	//driver.get("https://www.amazon.com/poptest2.html");
	    	//driver.close();
	    	
	}
}
