package com.test.util;

import io.appium.java_client.AppiumDriver;

import java.io.IOException;

public class TestResultBack {
	//测试结果组成: TestResult:+动作+用例标题+测试结果+测试时间
	
	RandWCSV rw=new RandWCSV();
	
	AssertString  as=new AssertString();
	
	public void testresultandwri(String str[],AppiumDriver driver) {
		
		String timesnow=GetNowTime.getTime();
		
		String porfa=as.assertmess3(str,driver);
		
		String testresult="Test Result:"+str[2]+";"+str[5]+";"+porfa+";"+timesnow;
		
		
		 
			rw.WriCSV(testresult);
		
		 LogUtil.loguuu("TestResultBack", testresult,"testresultandwri");
		
	}
	
	

}
