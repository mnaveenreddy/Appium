package com.appium.base;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends TestBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Tap,Press and release, scroll, Swipe, drag and drop
		//new TouchAction((PerformsTouchActions) driver).press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
		
		AndroidDriver<AndroidElement>driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Taping on mobile--> Using TouchAction class
		TouchAction t=new TouchAction(driver);
		t.tap(driver.findElementById("Expandable Lists")).perform();
		driver.findElementById("1. Custom Adapter").click();
		
		Thread.sleep(5000);
		//pressing and releasing.
		//t.press(driver.findElementByXPath("//*[@text='People Names']")).waitAction(3000).release().perform();
		new TouchAction((MobileDriver) driver).press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(3000).release().perform();
		//t.press(driver.findElements(By.className("android.widget.TextView")).get(0)).waitAction(3000).release().perform();
		//driver.findElementsByClassName("android.widget.Button").get(1)
		System.out.println(driver.findElementByXPath("//*[@text='Sample menu']").getText());
		
		

	}

}
