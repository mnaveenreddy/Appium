package com.appium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
      driver.get("https://fantasycricket.dream11.com/IN");
      int number=findframenumber(driver,By.xpath(""));
      driver.switchTo().frame(number);
      
	}
	
	public static int findframenumber(WebDriver driver,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			//if we put is displayed here if object is invisible it will throw false
			//Never use isdisplayed to find an element in the page . Always find all elements if it is > 0 that is 
			int count=driver.findElements(by).size();
			if(count>0)
			{
				driver.findElement(by).click();
				break;
			}
			else{
				System.out.println("Continue Looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
