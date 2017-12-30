package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends TestBase{
	
   public static void main(String[] args) throws MalformedURLException {
	 
	   AndroidDriver<AndroidElement> driver=capabilities();
	   
	   //xpath, id, classname,AndroidUIautomator,
	   //tagname[@attribute='value']
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	   driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	   driver.findElement(By.id("android:id/checkbox")).click();
	   //android.widget.RelativeLayout
	   driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	   driver.findElement(By.id("android:id/edit")).sendKeys("hello");
	  // driver.findElement(By.id("OK")).click();
	   //27th lecture if there are duplicates elements 
	   driver.findElementsByClassName("android.widget.Button").get(1).click();
	   
}

}
