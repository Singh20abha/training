package automationdemoLaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class dummy1
 {
    public static void main(String args[]) throws InterruptedException
    {
    	WebDriver driver;
     //System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32 (4)\\chromedriver.exe");
      //System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
    	

    	System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
    	
        // Instantiate a ChromeDriver class.
     // WebDriver driver = new ChromeDriver();
    	FirefoxOptions options = new FirefoxOptions();
    	options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);
      // WebDriver driver = new FirefoxDriver();
  
        // Maximize the browser
        driver.manage().window().maximize();
  
        // Launch amazon Website very important comment on 3/27/23 for google search and i recomment
     	/*driver.get("https://www.amazon.com//"); 
        WebElement searchBox=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
        searchBox.sendKeys("pant");
        Thread.sleep(5000);
        WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
        searchButton.click();*/
     
      // WebElement l = driver.findElement(By.xpath("xpath=//a[contains(@href, '/business?ref_=footer_retail_b2b')]"));
      // l.click();
     
     
        driver.get("https://www.bing.com//");
        Thread.sleep(2000);
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("http://www.google.com/search");
        Thread.sleep(2000);
        WebElement searchbutton = driver.findElement(By.id("sb_form_q"));
        searchbutton.click();
        
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.print("Title:" +title);
        System.out.print("URL:" +url);
        
     
        driver.close();
        
        
        //driver.quit();
        
        //launch amazon website with sign button
       /* driver.get("https://www.amazon.com/ap/sighin");
       // WebElement email=driver.findElement(By.id(("ap_email")));
        WebElement searchBox=driver.findElement(By.cssSelector(("a-input-text a-span12 auth-autofocus auth-required-field")));
        searchBox.clear();
        searchBox.sendKeys("mukesh.singh78@gmail.com");
        WebElement searchButton=driver.findElement(By.cssSelector(("a-button-input")));
        searchButton.click();
        driver.quit();*/


    
    }
}
