/*package com.obsqura.SeleniumAutomation;
  
import org.junit.After;
import org.junit.Before;
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
	  String actualTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String title = driver.getTitle(); 
	  if(actualTitle.equals(title)) 
	  {
  System.out.println("Titles are equal"); 
  } 
	  else 
  {
  System.out.println("Titles are not equal");
  }
  
  }
  
  @Test 
  public void getUrlCommand() 
  { String actualUrl="https://www.amazon.in/"; 
  String url=driver.getCurrentUrl();
  if(actualUrl.equals(url)) 
  { 
	  System.out.println("url's are same");
  
  } 
  else 
  { 
	  System.out.println("url's are not same"); }
  
  }
  
  @Test 
  public void getPageSourceCommand() 
  { String pageSource=driver.getPageSource();
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
}*/
  
  
  
 