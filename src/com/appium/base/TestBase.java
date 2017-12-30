package com.appium.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		
		/*File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		fs.getAbsolutePath(); We can use instead of user dir
		AdnroidUIAutomator : C:\Users\naveen\AppData\Local\Android\sdk\tools\bin
		cap.setCapability("appactivity", "com.xxx.splashactivity");
		
		*/
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NaveenDemo");
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/com.raaga.android_2017-07-03.apk");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//cap.setCapability("appactivity", "com.xxx.splashactivity");
		return driver;
	}
	
}
