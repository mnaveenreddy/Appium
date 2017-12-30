package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Toggele extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
     //Get entire page location
		
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Point p=driver.findElement(By.xpath("")).getLocation();
		//moving x and y coordinates.
		TouchAction t=new TouchAction(driver);
		t.tap(p.x+20,p.y+30).perform(); //Toggle on 
		t.tap(p.x+100,p.y+30); //Toggle off
		
	}

}
