package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends TestBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.findElementByXPath("//*[@text='Date Widgets']").click();
		driver.findElementByXPath("//*[@text='2. Inline']").click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		TouchAction act=new TouchAction(driver);
		act.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(3000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();

	}

}
