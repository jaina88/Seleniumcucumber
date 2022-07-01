package com.qa.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactory {
	
	static WebDriver driver;
	
	public static void openbrowser(String url)
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		
	}
	
	public static void Sendvalue(String val, By locator)
	
	{
	     WebElement ele = driver.findElement(locator);
	     System.out.println("Sending text");	
	     ele.clear();
	     ele.sendKeys(val);
	     
	}
	
	public static void clickmethod(By locatorforClick) throws InterruptedException
	
	{
	     System.out.println("Clicking on search button");
	     driver.findElement(locatorforClick).click();
	     Thread.sleep(5000);
	}
	public static void close()
	{
		System.out.println("closing the Browser");
		driver.close();
		
		
		
	}

}
