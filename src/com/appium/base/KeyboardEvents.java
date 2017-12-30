package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class KeyboardEvents extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());// Views ,Native, Hybrid, Webview
		//(driver.hideKeyboard()); To Hide Keyborad
		System.out.println(driver.getOrientation()); //Landscape or Portrait
		System.out.println(driver.isLocked());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//interview Question how you perform keyboard events in appium presskeycode method and Androidkeycode interface
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		
	}
}
