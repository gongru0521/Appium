package com.test.peisong;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AppDriver {
	
	
	public  AppiumDriver driver;
	
	public void appDriver(String deviceName,String platformVersion,String appActivity,String appPackage){
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//连接红米note设备信息的准备工作
		capabilities.setCapability("deviceName",deviceName);  
        capabilities.setCapability("automationName","Appium");  
        capabilities.setCapability("platformName","Android");  
        capabilities.setCapability("platformVersion",platformVersion);
        
        capabilities.setCapability("appPackage", appPackage);  
        capabilities.setCapability("appActivity", appActivity);  
        capabilities.setCapability("sessionOverride", true);    //每次启动时覆盖session，否则第二次后运行会报错不能新建session  
        capabilities.setCapability("unicodeKeyboard", false);    //设置键盘  
        capabilities.setCapability("resetKeyboard", true);     //使用系统默认键盘
        

        
        try {
			driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}         
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		
		
		
	}
	
	
   public  AppiumDriver getDriver(){
		
		return driver;
		
		
	}

}
