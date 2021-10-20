package Day_026_TakeScreenShot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;



public class Test5 {
	
	static WebDriver driver;


	
	
	@Test
	public void AddNationalitiess() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(scrFile, new File("C:\\ScreenShot1.jpg"));
	
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 TakesScreenshot scrShot1 =((TakesScreenshot)driver);
	 File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(SrcFile1, new File("C:\\TC02_Login\\TC1_ScreenShot1.jpg"));

	 
	 
	 	findElement(By.id("txtUsername")).sendKeys("Admin");
	  TakesScreenshot scrShot2 =((TakesScreenshot)driver);
	  File SrcFile2=scrShot2.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile2, new File("C:\\TC02_Login\\TC1_ScreenShot2.jpg"));
	  
	  
	  findElement(By.id("txtPassword")).sendKeys("admin123");
	  TakesScreenshot scrShot3 =((TakesScreenshot)driver);
	  File SrcFile3=scrShot3.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile3, new File("C:\\TC02_Login\\TC1_ScreenShot3.png"));
	  
	  findElement(By.id("btnLogin")).click();
	  TakesScreenshot scrShot4 =((TakesScreenshot)driver);
	  File SrcFile4=scrShot4.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile4, new File("C:\\TC02_Login\\TC1_ScreenShot4.png"));
	  
	  
	  findElement(By.linkText("Admin")).click();
	  TakesScreenshot scrShot5 =((TakesScreenshot)driver);
	  File SrcFile5=scrShot5.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile5, new File("C:\\TC02_Login\\TC1_ScreenShot5.png"));
	  
	  findElement(By.id("menu_admin_Job")).click();
	  TakesScreenshot scrShot6 =((TakesScreenshot)driver);
	  File SrcFile6=scrShot6.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile6, new File("C:\\TC02_Login\\TC1_ScreenShot6.pdf"));
	  
	  //menu_admin_viewJobTitleList
	  findElement(By.id("menu_admin_viewJobTitleList")).click();
	  TakesScreenshot scrShot7 =((TakesScreenshot)driver);
	  File SrcFile7=scrShot7.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile7, new File("C:\\TC02_Login\\TC1_ScreenShot7.pdf"));
	  
	  //btnAdd
	  
	  findElement(By.id("btnAdd")).click();
	  TakesScreenshot scrShot8 =((TakesScreenshot)driver);
	  File SrcFile8=scrShot8.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(SrcFile8, new File("C:\\TC02_Login\\TC1_ScreenShot8.pdf"));
	  
	  

		
	
	
	
	}
	
	
	
	
	
	
	
	
	 public  static WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
	
	
	
	
	
	
	
	
	
	
	

}