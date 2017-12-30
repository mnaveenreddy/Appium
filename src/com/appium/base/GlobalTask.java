package com.appium.base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService.Builder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class GlobalTask {

	@Test
	public void fm() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NaveenDemo");
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/global-recruitment-assessment.apk");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.view.View[@id='com.thisisglobal.player.choice.uat:id/play_button']")).click();
		
		boolean radioplay=driver.findElementByAndroidUIAutomator("id(\"com.thisisglobal.player.choice.uat:id/hero_equaliser\")").isEnabled();
		if(Boolean.TRUE.equals(radioplay))
		{
			System.out.println("Radio started");
		}else
		{
			System.out.println("Readio not started");
		}
	}
	@BeforeTest
	public void startappium() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start C:/Users/naveen/workspace/Appium/AppiumIntroduction/src/startappium.bat");
	    Thread.sleep(7000l);
	}
}