package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC05_Login_NonStatic_Paarameters {
	
	
	static WebDriver driver;
	//Global Variables
	
	String UserName="Admin", Password="admin123";
	String Skillname="Testing",Skilldesc="Selenium Java";

	@Test
	public void Login_Test() throws Exception
	{
		TC05_Login_NonStatic_Paarameters TN1=new TC05_Login_NonStatic_Paarameters();
		
		TN1.OpenChromeBrowser();
		TN1.OpenOrangeHRM();
		TN1.Login(UserName,Password);
		TN1.AddSkills(Skillname,Skilldesc);
		
		
		driver.quit();
	
	}
	

	public  void Login(String UserName,String Password) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.id("btnLogin")).click();
	}
	

	/*public    void AddNationalities(String Nationality) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		findElement(By.id("btnSave")).click();	
	}*/
	
	public  void AddSkills(String Testing, String Skilldesc) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.name("skill[name]")).sendKeys(Testing);
		findElement(By.name("skill[description]")).sendKeys(Skilldesc);
		findElement(By.id("btnSave")).click();	
	}
	
	
	public   WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
 
	
	
	
	
	
	public  void OpenOrangeHRM() throws Exception
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	public  void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	
	}
	
	
	
	
	
	
	
	

}
