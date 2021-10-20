package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Test10 {
 
	WebDriver driver;

	
	  public void testUntitledTestCase() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	   
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_nationality")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("nationality_name")).click();
	    driver.findElement(By.id("nationality_name")).clear();
	    driver.findElement(By.id("nationality_name")).sendKeys("Indian24");
	    driver.findElement(By.id("btnSave")).click();
	  }

	
	
	  @Test
	  public void testUntitledTestCase1() throws Exception {
	  
		  
			driver = TestBrowser.OpenChromeBrowser();
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		  
	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_Qualifications")).click();
	    driver.findElement(By.id("menu_admin_viewSkills")).click();
	    driver.findElement(By.id("btnAdd")).click();
	 
	    driver.findElement(By.id("skill_name")).click();
	    driver.findElement(By.id("skill_name")).clear();
	    driver.findElement(By.id("skill_name")).sendKeys("Java16");
	    driver.findElement(By.id("skill_description")).click();
	    driver.findElement(By.id("skill_description")).clear();
	    driver.findElement(By.id("skill_description")).sendKeys("Java16desc");
	    driver.findElement(By.id("btnSave")).click();
	  }

	
	
	
	
	
	
	









}
