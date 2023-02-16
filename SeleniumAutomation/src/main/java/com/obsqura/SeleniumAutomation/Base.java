package com.obsqura.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renju\\eclipse-workspace-obsqura\\SeleniumAutomation\\src\\main\\java\\Resources\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
	}
    public void getTitleCommand()
    {
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
    public void getUrlCommand()
    {
    	String actualUrl="https://www.amazon.in/";
    	String url=driver.getCurrentUrl();
    	if(actualUrl.equals(url))
    	{
			 System.out.println("url's are same");
        }
    	 else
 		{
 			 System.out.println("url's are not same");
 		}
     }
   public void getPageSourceCommand()
    {
    	String actualPageSource=driver.getPageSource();
    	if(actualPageSource.contains("window.ue_ihb = (window.ue_ihb || window.ueinit"))
        {
        	System.out.println("Pagesource are equal");
        }
        else
        {
         System.out.println("Pagesource are not equal");
        }
    }
    
    public void navigateCommands()
    {
    	driver.navigate().to("https://www.flipkart.com/");
    	driver.navigate().back();
    	driver.navigate().forward();
    	driver.navigate().refresh();
    }
    public void afterTest()
    {
    	//driver.close();
    	driver.quit();
    }
	
	/*public static void main(String[] args) 
	 {
	  Base base=new Base();
	  base.initializeBrowser(); 
	  base.getTitleCommand(); 
	  base.getUrlCommand();
	  base.getPageSourceCommand();
	  base.navigateCommands(); 
	  base.afterTest();
	  }*/
}
