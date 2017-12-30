package com.appium.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
	
	public static AndroidDriver<AndroidElement> hybridcapabilities(String device) throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		if(device.equals("emulator"))
		{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NaveenDemo");
		}else if(device.equals("real"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/com.raaga.android_2017-07-03.apk");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
}
