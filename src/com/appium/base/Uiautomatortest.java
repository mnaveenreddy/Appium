package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//(attribute(value))---> ("text(\"views\")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate clickable feature for all options
		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(true)");
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

}
