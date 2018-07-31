package com.test.util;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.test.peisong.AppiumTestDemo;

public class AssertString {
	//AppiumDriver driver=AppiumTestDemo.driver;
	public  String assertmess3(String str[],AppiumDriver driver){
		//断言字段
		String asserstr=str[3];
		//获得web或android页面
		String weborand=str[6];
		
		String result=null;
		
		if(asserstr.equals("null")){
			System.out.println("断言为空");
			result="未设置断言_PASS";
			
			
			/*
		  try {
			  TakeScreenShot.takepics(driver, str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			*/
		}
	
		else{
		Boolean eleexist=DoesEleExist.doeswebElementExist(driver, asserstr,weborand);
		if(eleexist.equals(true)){
			
			Assert.assertTrue(true);
		
			result="PASS";
	
	
	
			}
		else{
			Assert.assertFalse(false);
			//System.out.println("test case failed!");
			result="FAILED";
			try {
				TakeScreenShot.takepics(driver, str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			}
		
		
		}
		
		
		
		
			
			
			
			System.out.println("result:"+result);
			
	   return result;
			
			
			
		}
		
		


}
