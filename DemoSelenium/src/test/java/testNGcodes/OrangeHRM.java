package testNGcodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void LaunchApp() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote--allow--origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	

	@Test
	public void EnterLoginDetails() {
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//div//input[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//div//input[@name='password']")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//div//button[@type='submit']")).click();
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		driver.quit();
	}
	
	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}
}
