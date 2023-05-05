package automationdemoLaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class ImpTestingProjectNewTourFlight {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    
	    
	    driver.get("http://demo.guru99.com/test/newtours/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    System.out.println("Currenturl:"+ driver.getCurrentUrl());
	    System.out.println("title:" +driver.getTitle());
	    
	      
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial"); 
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
	    System.out.println("login with the credential");

		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		System.out.println("Go to home page");
		
		
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/a")).click();
		System.out.println("Go to Flight Finder page");
		Thread.sleep(5000);
		
		
		//List<WebElement> TripTypeRadio = driver.findElements(By.xpath("//input[@name='tripType']")); 
		//System.out.println(TripTypeRadio.size());	
		//for(int i=0; i<TripTypeRadio.size(); i++)
		//{
			//driver.findElements(By.xpath("//input[@name='tripType']")).get(1).click();	
			
			//String value = TripTypeRadio.get(i).getAttribute("value");
			//TripTypeRadio.get(i).click();
			//Thread.sleep(2000);
			//System.out.println("value:" +value);
		//}
		
		
	
		WebElement RoundTripRadio = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		RoundTripRadio.click();
		if(RoundTripRadio.isSelected())
		{
				System.out.println("Roundtrip Radio button is clicked");
		}
		else 
		{
			WebElement OneWayRadio = driver.findElement(By.xpath("//input[@value='oneway']"));		
			OneWayRadio.click();		
			System.out.println("OneWay trip Radio button is clicked");
		}
		
		
		
		Select noofpassengers = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		noofpassengers.selectByVisibleText("2");
		noofpassengers.selectByValue("2");
		Thread.sleep(2000);
		System.out.println("number of passengers will be:2");
		
		
		Select DepartingPlace = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		DepartingPlace.selectByValue("London");
		DepartingPlace.selectByVisibleText("London");
		Thread.sleep(2000);
		System.out.println("Departurer city is:London");
		
		
		Select FromDate = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		FromDate.selectByValue("4");
		FromDate.selectByVisibleText("April");
		Thread.sleep(2000);
		System.out.println("Departure date is:April");
		
		Select FromDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		FromDay.selectByValue("15");
		FromDay.selectByVisibleText("15");
		Thread.sleep(2000);
		System.out.println("Departure day is:15");
		
		Select ArrivalPlace = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		ArrivalPlace.selectByValue("New York");
		ArrivalPlace.selectByVisibleText("New York");
		Thread.sleep(2000);
		System.out.println("Arrival city is:New York");
		
		Select ToDate = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		ToDate.selectByValue("4");
		ToDate.selectByVisibleText("April");
		Thread.sleep(2000);
		System.out.println("Arrival date is:April");

		
		Select ToDay = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		ToDay.selectByValue("21");
		ToDay.selectByVisibleText("21");
		Thread.sleep(2000);
		System.out.println("Arrival day is:21");
		
		
		//WebElement ServiceClassRadio1 = driver.findElement(By.xpath("//input[@value='Coach']"));
		//ServiceClassRadio1.click();
		
		WebElement ServiceClassRadio2 = driver.findElement(By.xpath("//input[@value='Business']"));
		ServiceClassRadio2.click();
		
		//WebElement ServiceClassRadio3 = driver.findElement(By.xpath("//input[@value='First']"));
		//ServiceClassRadio3.click();
		
		
		Select Airline = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		//Airline.selectByValue("21");
		Airline.selectByVisibleText("Unified Airlines");
		Thread.sleep(2000);
		System.out.println("Airline is:Unified Airlines");

		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("reservation");
		
	}

	

}
