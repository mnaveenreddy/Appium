package com.ios.gestures;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import com.appium.base.TestBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class iosScrolling extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
      AndroidDriver<AndroidElement>driver=capabilities();
      Dimension size=driver.manage().window().getSize();
      int x=size.getWidth()/2;
      int starty=(int)(size.getHeight()* 0.60);
      int endy=(int)(size.getHeight() *0.10);
      driver.swipe(x, starty, x, endy, 2000);
	}

}
