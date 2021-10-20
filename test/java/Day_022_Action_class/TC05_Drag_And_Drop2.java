package Day_022_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC05_Drag_And_Drop2 {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	findElement(By.id("Photo Manager")).click();
	driver.switchTo().frame(findElement(By.name("google_esf")));
	WebElement Source_Drag_Button=findElement(By.className("ui-icon ui-icon-zoomin"));
	WebElement Target_Drag_Button=findElement(By.id("trash"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(Source_Drag_Button, Target_Drag_Button).perform();

	
		
	}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
	

}
