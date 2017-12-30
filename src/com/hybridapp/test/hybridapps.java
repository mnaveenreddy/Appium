package com.hybridapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class hybridapps {
	
	public void hybridapp() throws MalformedURLException
	{
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	//hybrid app path
	//cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/com.raaga.android_2017-07-03.apk");
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    System.out.println(driver.getContext());// tells u whether native or web
    
    Set<String> s=driver.getContextHandles();// how many views are present for your app
    //1 native 1 web to switch we need to pass String into context to continue
    
   // driver.context("NATIVE_APP") or ("WEBVIEW_com.exmple.testapp");
    for(String handle : s)
    {
    	System.out.println(handle);
    }
    
    //To enable webview debugging, call the static setWebContentsDebuggingEnabled on the webView class.
    
    
    
}
}