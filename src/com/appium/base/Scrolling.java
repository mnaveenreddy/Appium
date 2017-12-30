package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Method to perform scolling scenario in 
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		Dimension size = driver.manage().window().getSize();
	    int x = size.getWidth() / 2;
	    int starty = (int) (size.getHeight() * 0.60);
	    int endy = (int) (size.getHeight() * 0.10);
	    driver.swipe(x, starty, x, endy, 2000);
		

	}

}
