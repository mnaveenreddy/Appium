package com.appium.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingAutoSearchandcalendar{
	
	public WebDriver driver;
		  @Test
		  public void meth() throws Exception
		  {
			  String exploc="Hyderabad Hitech City Station, India";
			  String depdate="25-DEC-2017";
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
		  driver.get("http://expedia.co.in/");
		  
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		   driver.findElement(By.xpath("//*[@id='hotel-destination']")).sendKeys("hyd");
		   driver.switchTo().activeElement().sendKeys(Keys.ARROW_RIGHT);
		   Thread.sleep(5000);
		List<WebElement> location =driver.findElements(By.xpath("//*[starts-with(@id, 'aria-option-')]"));
		for(int i=0;i<=location.size();i++)
		{
			System.out.println(location.get(i).getText());
			if(location.get(i).getText().equalsIgnoreCase(exploc))
			{
				location.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id='hotel-checkin']")).click();
		Thread.sleep(500);
		String month=driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper']/div/div/div[2]/table/caption")).getText();
		System.out.println(month);
		System.out.println(depdate.substring(3,6)+"=="+depdate.substring(7,depdate.length()));
		while(!(month.contains(depdate.substring(3,6))&& month.contains(depdate.substring(7,depdate.length()))))
		{
			driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper']/div/div/button[2]")).click();
			 month=driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper']/div/div/div[2]/table/caption")).getText();
				
		}
		    List<WebElement> calendar=driver.findElements(By.xpath("//*[@id='hotel-checkin-wrapper']/div/div/div[2]/table/tbody//td"));
		    for(int i=0;i<=calendar.size();i++){
		    	if(calendar.get(i).getText().contains(depdate.substring(0,2)))
		    	{
		    		calendar.get(i).click();
		    		break;
		    	}
		    }
		}
}

