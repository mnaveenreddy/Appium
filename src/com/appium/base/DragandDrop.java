package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragandDrop extends TestBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElement(By.xpath("//*[@text='Drag and Drop']")).click();
	    TouchAction act=new TouchAction(driver);
	    act.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).waitAction(3000).moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();
		//act.longPress(driver.findElementsById('io.appium.android.apis:id/drag_dot_1']").waitAction(3000).moveTo(driver.findElement(By.xpath("//*[@id='io.appium.android.apis:id/drag_dot_3']"))).release().perform();

	}

}
