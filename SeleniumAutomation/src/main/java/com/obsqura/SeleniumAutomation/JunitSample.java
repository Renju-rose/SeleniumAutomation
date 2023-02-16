package com.obsqura.SeleniumAutomation;
  
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
  
  public class JunitSample { 
	  
  public WebDriver driver;
  
  
 @Before 
  public void initializeBrowser() 
  {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\renju\\eclipse-workspace-obsqura\\SeleniumAutomation\\src\\main\\java\\Resources\\chromedriver.exe"); 
       driver =new ChromeDriver(); 
       driver.get("https://www.amazon.in/"); 
   }
  
  @Test
  public void getTitleCommand() { 
	  String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualTitle = driver.getTitle(); 
	  assertEquals(expectedTitle,actualTitle);
   }
   @Test 
  public void getUrlCommand() 
  {   String ExpectedUrl="https://www.amazon.in/"; 
      String actualUrl=driver.getCurrentUrl();
      assertEquals(ExpectedUrl,actualUrl);
  }
  @Test 
  public void getPageSourceCommand() 
  {
	  String actualPageSource="window.ue_ihb = (window.ue_ihb || window.ueinit";
	  String pageSource=driver.getPageSource();
      assertTrue(pageSource.contains(actualPageSource));
  }
  @Test 
  public void navigateCommands() 
  {
      driver.navigate().to("https://www.flipkart.com/"); 
      driver.navigate().back();
      driver.navigate().forward(); 
      driver.navigate().refresh(); 
  }
  @After
  public void afterTest() 
  { 
	  //driver.close(); 
	  driver.quit(); 
  }
  @AfterClass
  public static void afterClass()
  {
	  System.out.println("After Class");
  }
  @BeforeClass
  public static void beforeClass()
  {
	  System.out.println("Before Class");
  }
  @Test
  public void testcaseOne()
  {
	  System.out.println("Testcase One");
  }
  @Test
  public void testcaseTwo()
  {
	  System.out.println("Testcase Two");
  }
  @After
  public void after()
  {
	  System.out.println("After");
  }
  @Before
  public void before()
  {
	  System.out.println("Before");
  }
  
}
  
  
  
 