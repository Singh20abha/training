package automationdemoLaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.ElementClickInterceptedException;

public class dummy4 
{
	private static final String Else = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//driver.navigate().to("http://www.google.com/");		
		
		//driver.findElement(By.className("gLFyf")).sendKeys("javatpoint tutorials");
		
		//driver.findElement(By.name("btnk")).click();
		
/*driver.get("https://www.testandquiz.com/selenium/testing.html");
		String sampletext = driver.findElement(By.className("col-md-12")).getText();
		System.out.println(sampletext);
		driver.findElement(By.linkText("This is a link")).click();
		driver.findElement(By.id("fname")).sendKeys("javatpoint");
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("idOfButton")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.cssSelector("input.Automation")).click();
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Automation Testing");
		driver.close();*/
		
		
		/*driver.navigate().to("http://www.javatpoint.com/");  
		 driver.manage().window().maximize();  
		  JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 5000)");   
	        driver.findElement(By.linkText("Core Java")).click(); */
		
		
		//driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		
		/*Select dropdown = new Select(driver.findElement(By.id("dropdown")));  
		
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Option 1");
		
		dropdown.deselectByValue("1");
		Thread.sleep(5000);
		
		driver.close();*/
		
		//driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		
		/*  System.out.println(driver.findElement(By.cssSelector("form[@id='checkbox']")).isSelected());  
	      driver.findElement(By.cssSelector("form[@id='checkbox']")).click();  
	      System.out.println(driver.findElement(By.cssSelector("form[@id='checkbox']")).isSelected());  
	      Thread.sleep(5000);
	      driver.close();*/
		
		/*driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement from= driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();*/
		
		/*driver.navigate().to("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmResult")).click();  
		Alert alert = driver.switchTo().alert();  
		alert.accept();  
		driver.findElement(By.id("confirmButton")).click();          
        Alert confirmBox = (Alert) driver.switchTo().alert();  	      
	    
	    ((Alert) confirmBox).dismiss();*/
		
		
		//Alert
		//WebDriver driver=new FirefoxDriver();
	   /* driver.get("https://demoqa.com/alerts");
	    
	    //*[@id="alertButton"]
	    
	    WebElement checkbooklink=driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
	checkbooklink.click();
		Thread.sleep(4000);
		String originalWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		//*[@id="sampleHeading"]
		  WebElement netab=driver.findElement(By.xpath("//*[@id=\"confirmResult\"]"));
	//	System.out.print*/
		
		/*driver.navigate().to("https://demoqa.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 4500)"); 
		String title = driver.getTitle();  
		int titleLength = driver.getTitle().length();  
		System.out.println("Title of the page is : " + title);  
		System.out.println("Length of the title is : "+ titleLength);  
		String actualUrl = driver.getCurrentUrl();  
		
		if (actualUrl.equals("https://www.google.co.in"))  
		{  
		System.out.println("Verification Successful - The correct Url is opened.");  
		}  
		else
			
		{  
		System.out.println("Verification Failed - An incorrect Url is opened.");  
		}  
		// Storing Page Source in String variable  
		String pageSource = driver.getPageSource();  
		           
		// Storing Page Source length in Int variable  
		int pageSourceLength = pageSource.length();  
		System.out.println("Total length of the Page Source is : " + pageSourceLength);  
		driver.close();   */
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;  
		//js.executeScript("scrollBy(0, 4500)"); 
		
		//driver.navigate().to("https://demoqa.com/radio-button");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		//driver.findElement(By.xpath("//*[@id=\"yesRadio\"]")).click();
		//System.out.println("Yes is selected");
		
		//WebElement radioElement = driver.findElement(By.xpath("//input [@name='like']"));
		//boolean selectState = radioElement.isDisplayed();
				
		//performing click operation only if element is not selected
		//if(selectState == false) {
		//	radioElement.click();
		//}
		 
		/*int a = driver.findElements(By.xpath("//input [@name='like']")).size();  
	        System.out.println(a);  
	        for(int i=1;i<=a;i++)  
	        {  
	            //driver.findElements(By.xpath("//input[@name='like']")).get(0).click(); 
	            driver.findElements(By.xpath("//input[@name='like']")).get(2).click();
	        }  */
		//driver.findElement(By.xpath("//div/input[@id='yesRadio']")).click();
		//System.out.println("Yes is selected");
		
		//WebElement radioElement = driver.findElement(By.xpath("//div/input[@id='yesRadio']"));
		//boolean selectState = radioElement.isSelected();
				
		//performing click operation only if element is not selected
		//if(selectState == false)
		//{
		//	radioElement.click();
	///	}
		 /* int a = driver.findElements(By.xpath("//input [@name='like']")).size();  
	        System.out.println(a); 
	        
	        for(int i=1;i<=a;i++)  
	        {  
	            driver.findElements(By.xpath("//input[@name='like']")).get(2).click();  
	            System.out.println("yes button is clicked");
	        }  
	        */
		//Thread.sleep(4000);
		//driver.close();
		
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();

		

		/**
		 * Find radio button using ID, Validate isSelected and then click to select
		 */
		WebElement radioEle = driver.findElement(By.id("yesRadio"));
		boolean select = radioEle.isSelected();
		System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}
		 
		WebElement radioElem = driver.findElement(By.xpath("//div/input[@id='impressiveRadio']"));
				boolean sel = radioEle.isDisplayed();

				// performing click operation if element is displayed
				if (sel == true) {
					radioElem.click();
				}

				/**
				 * Find radio button using CSS Selector, Validate isEnabled and click to select
				 */
				WebElement radioNo = driver.findElement(By.cssSelector("input[id='noRadio']"));
				boolean selectNo = radioEle.isDisplayed();

				// performing click operation if element is enabled
				if (selectNo == true) {
					radioNo.click();
				}

		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
