package com.appium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeTest extends ChromeBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
   
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.get(" ");
		driver.findElement(By.xpath("//*[@text='ACCEPT & CONTINUE']")).click();
		driver.findElement(By.xpath("//*[@text='NO THANKS']")).click();*/
		driver.get("http://eenadu.net");
	}

}
