package com.appium.base;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Raaga extends HybridBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=hybridcapabilities("emulator");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@text='Done']").click();
		driver.findElementByXPath("//*[@text='or Skip to Raaga']").click();
		driver.findElementByXPath("//*[@text='Got it']").click();
		List<AndroidElement> li=driver.findElementsByClassName("android.widget.TextView");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
			if(li.get(i).getText().equals("Hindi"))
			{
				li.get(i).click();
			}
		}
		//driver.findElementByXPath("//android.widget.RelativeLayout[@index='11']").click();
		
		//driver.findElementByAndroidUIAutomator("resourceId(\"com.raaga.android:id/text_view_lang\")").click();
		//driver.findElement(By.xpath("//android.widget/TextView[@resource-id='com.raaga.android:id/text_view_lang' and @text='Hindi' and @index=0]")).click();
		/*Dimension size = driver.manage().window().getSize();
		    int x = size.getWidth() / 2;
		    int starty = (int) (size.getHeight() * 0.60);
		    int endy = (int) (size.getHeight() * 0.10);
		    driver.swipe(x, starty, x, endy, 2000);
		    WebDriverWait wait=(WebDriverWait) new WebDriverWait(driver, 10);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout)[11]")));
		    
		    driver.findElementByXPath("(//android.widget.RelativeLayout)[11]").click();*/
		//driver.findElementByAndroidUIAutomator(("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().resourceId(\"com.raaga.android:id/text_view_lang\"));"));
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(index(\"11\"));");
		
		//Thread.sleep(3000);
		     //driver.findElement(By.xpath("//android.widget.RelativeLayout[11]")).click();
		    //driver.findElementByXPath("//android.widget.TextView[@index='11']").click();
		  //driver.findElementByXPath("//*[@text='World Music']").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Hindi']").click();
		  //driver.findElement(By.xpath("//android.widget.TextView[@id='com.raaga.android:id/text_view_lang']")).click();
		//driver.findElementsByClassName("android.widget.TextView").get(1).click();
		
		//driver.findElement(By.id("com.raaga.android:id/text_view_lang")).click();
		     //driver.findElementByName("Hindi").click();
		    //driver.findElementByXPath("(//android.widget.RelativeLayout)[11]").click();
		     //driver.findElementByXPath("(//android.widget.RelativeLayout)[0]").click();
		//driver.findElement(By.className("android.widget.RelativeLayout"))
		//driver.findElementsByClassName("android.widget.RelativeLayout").
		//*[@id='com.raaga.android:id/text_view_lang']
		
		
		

	}

}
