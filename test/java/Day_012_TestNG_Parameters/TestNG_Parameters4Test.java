package Day_012_TestNG_Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters4Test {
	
	static WebDriver driver;
	
	@Parameters({"Browser","UserName","Password","AddSkills","Skilldesc"})
  @Test
  public static void OpenChromeBrowser(String Browser,String UserName, String Password, String SkillsName, String Skilldesc) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		
		//TC02_Login_Static_Paarameters1.OpenChromeBrowser();
		TestNG_Parameters4Test.OpenOrangeHRM();
		TestNG_Parameters4Test.Login(UserName,Password,SkillsName,Skilldesc);
		
		
	}
	
	public static void OpenOrangeHRM() throws Exception
	
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}		
	
	public static void Login(String UserName,String Password,String SkillsName, String Skilldesc) throws Exception
	{
	driver.findElement(By.id("txtUsername")).sendKeys(UserName);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.className("button")).click();
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	driver.findElement(By.id("menu_admin_Qualifications")).click();
	driver.findElement(By.id("menu_admin_viewSkills")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("skill_name")).sendKeys(SkillsName);
	driver.findElement(By.id("skill_description")).sendKeys(Skilldesc);
	driver.findElement(By.id("btnSave")).click();
  }
	
}

