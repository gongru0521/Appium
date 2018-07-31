package com.test.util;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class TakeScreenShot {

	
	public static void takepics(AppiumDriver driver,String str[]) throws IOException{
	//	System.out.println("开始截图....");
		
		//url
		//String url=GetProPara.gotpara("picurl");
		String url="./Pics";
		//获得是android还是Web
		String weborand=str[6];
		//pic 的名字 picname
		String timesnow=GetNowTime.getTime().replaceAll(" ", "").replaceAll("-", "").replaceAll(":", "");
		String filename=url+"/"+str[5]+"_"+timesnow+".jpg";
		
		
		
		if(weborand.equals("Android")){
			File screenshot=driver.getScreenshotAs(OutputType.FILE);
		//	System.out.println("进入android截图");
			File screenfile=new File(filename);
			
			FileUtils.copyFile(screenshot, screenfile);
			
		}
		if(weborand.equals("WEBVIEW")){
			
		//	System.out.println("进入webview截图");
	
			//切换到android模式
			
			driver.context("NATIVE_APP");
		//	Thread.sleep(1000);
			File screenshot2=driver.getScreenshotAs(OutputType.FILE);
			File screenfile2=new File(filename);
			
			FileUtils.copyFile(screenshot2, screenfile2);
			
			//切换到web页面
			driver.context("WEBVIEW_com.itsenpupulai.courierport");
			//Thread.sleep(1000);
			
		}
		
		
		
	}
}
