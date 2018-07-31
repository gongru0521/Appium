package com.test.yonghu;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.peisong.AppDriver;
import com.test.util.DependsParaAction;
import com.test.util.RandWCSV;

public class AppiumYonghu {
	//多个class中使用该driver
	public  AppiumDriver driver;
	
	
    public  String readurl1="./src/test/resources/YonghuAppiumData.csv";
//	
    public  String writeurl1="./src/test/resources/YonghuAppiumTestResult.csv";
	
	DependsParaAction dpa=new DependsParaAction();
	
	
	//准备测试工作
	@BeforeClass
	public void SetUpWorking() throws IOException{

        //点击异常框

	 	    String deviceName="Redmi Note2";
			String platformVersion="5.0.2";
			String appActivity=".activity.BeforeWelcomeActivity";
			String appPackage="com.itsenpupulai.kuaikuaipaobei";
			AppDriver ap=new AppDriver();
			ap.appDriver(deviceName, platformVersion, appActivity, appPackage);
			
			driver=ap.getDriver();
		
		
		
	}
	

	
	
	/*
	 * 
	 * 开始执行测试
	 * 
	 * 
	 */
	@Test
	public void test001(){
		
		System.out.println("test case001");
		
		//关闭异常弹框
		
		
        int x1=540;
        int y1=1739;
        TouchAction ac=new TouchAction(driver).longPress(PointOption.point(x1,y1));
        ac.perform();
        
        //跳过引导页
        
       // WebElement weyin=driver.findElement(By.id(""));
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

	
	
	@Test
	public void test003() throws InterruptedException, IOException{
	
		//根据csv文件中的参数进行操作

		RandWCSV.readurl=readurl1;
		RandWCSV.writeurl=writeurl1;
//		RandWCSV.readurl="./src/test/resources/YonghuWebViewData.csv";
//		RandWCSV.writeurl="./src/test/resources/YonghuWebViewResult.csv";
		
		dpa.parama(driver);
	
	}
	
	
		
	
	

}
