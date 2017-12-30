package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RaagaSignUp extends HybridBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=hybridcapabilities("emulator");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@text='Done']").click();
		//driver.findElementByXPath("//*[@text='or Skip to Raaga']").click();
		driver.findElementByXPath("//*[@text='SIGN IN']").click();
		driver.findElementByXPath("//*[@text='Email']").sendKeys("nn@gmail.com");
		driver.findElementByXPath("//*[@text='Password']").sendKeys("testing");
		driver.findElementByXPath("//*[@text='Log in']").click();
		driver.findElementByXPath("//*[@text='OK']").click();
		
		driver.findElementByXPath("//*[@text='Sign Up']").click();
		driver.findElementByXPath("//*[@text='Full name']").sendKeys("Testing");
		driver.findElementByXPath("//*[@text='User name']").sendKeys("Testing@gmail.com");
		driver.findElementByXPath("//*[@text='Email']").sendKeys("Testing@gmail.com");
		driver.findElementByXPath("//*[@text='Password']").sendKeys("Testing");
		
		//driver.findElementByXPath("//android.widget.EditText[@id='com.raaga.android:id/signup_year']").sendKeys("Aug/19/2013");
		//Thread.sleep(3000);
		driver.switchTo().activeElement();
		//driver.findElementByXPath("//*[@text='Year of Birth']").sendKeys("");
		driver.findElementByXPath("//android.widget.EditText[@id='com.raaga.android:id/month_display']").sendKeys("Aug");
		driver.findElementByXPath("//android.widget.EditText[@id='com.raaga.android:id/date_display']").sendKeys("19");
		driver.findElementByXPath("//android.widget.EditText[@id='com.raaga.android:id/year_display']").sendKeys("2013");
		
		
	}

}
