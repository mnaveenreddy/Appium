package com.saucelabs.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class safaribrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap=DesiredCapabilities.iphone();
	    cap.setCapability("platformName", "iOS");
	    cap.setCapability("deviceName", "iPhone 6");
	    cap.setCapability("platformVersion", "8.4");
	   
	   // cap.setCapability("deviceName", "iPhone Simulator");
	    cap.setCapability("browserName", "Safari");
	    cap.setCapability("deviceOrientation", "portrait");
	    cap.setCapability("appiumVersion", "1.6.5");
	    //AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://naveenreddy1213:73cb3835-53a5-4904-bc34-cfa5e5af45ef@ondemand.saucelabs.com:/wd/hub"),cap);
        driver.get("http://facebook.com");
        //Thread.sleep(8000l);
        driver.quit();

       /* public static final String USERNAME = "YOUR_USERNAME";
        public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
        public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
       
          public static void main(String[] args) throws Exception {
       
              DesiredCapabilities capabilities = new DesiredCapabilities();
              capabilities.setCapability("platformName", "iOS");
              capabilities.setCapability("deviceName", "iPhone 6");
              capabilities.setCapability("platformVersion", "8.4");
              capabilities.setCapability("app", "https://s3.amazonaws.com/appium/TestApp8.4.app.zip");
              capabilities.setCapability("browserName", "");
              capabilities.setCapability("deviceOrientation", "portrait");
              capabilities.setCapability("appiumVersion", "1.5.3");
       
              WebDriver driver = new IOSDriver(new URL(URL), capabilities);
       
              *//**
               * Test Actions here...
               *//*
       
              driver.quit();
              https://wiki.saucelabs.com/display/DOCS/Java+Example+Script+for+iOS+Mobile+Application+Tests
*/	}

}
