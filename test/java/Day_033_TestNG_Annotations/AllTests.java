package  Day_033_TestNG_Annotations;
//https://www.guru99.com/all-about-testng-and-selenium.html

import org.testng.annotations.*;
public class AllTests
{
	
	
	@BeforeTest
	public void Test2() throws Exception {
		System.out.println("2");
	}
	
	
	@BeforeSuite
	public void Test1() throws Exception 
	{
		
		System.out.println("1");
		
	}

	@BeforeMethod
	public void Test8() throws Exception {
		System.out.println("99");
	}

	
	@Test
	public void Test4() throws Exception {
		System.out.println("4");
	}
	
	//@Test
	//public void Test65() throws Exception {
		//System.out.println("65");
	//}
	

	@AfterMethod
	public void Test9() throws Exception {
		
		System.out.println("100");
	}
	
	
	
	
	@AfterTest
	public void Test5() throws Exception {
		System.out.println("6");
	}
	
	
	@AfterSuite
	public void Test7() throws Exception {
		
		System.out.println("7");
	}
	
	@BeforeClass
	public void Test3() throws Exception {
		
		System.out.println("3");
		
	}
	
	@AfterClass
	public void Test6() throws Exception {
		System.out.println("5");
	}
		
	
	
	
	
}                                                  












