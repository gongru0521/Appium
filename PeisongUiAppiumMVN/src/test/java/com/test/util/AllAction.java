package com.test.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.test.peisong.AppiumTestDemo;

public class AllAction {
	
	
	//AppiumDriver driver=AppiumTestDemo.driver;
	
	TestResultBack tresult=new TestResultBack();
	RandWCSV rw=new RandWCSV();
	String timesnow=GetNowTime.getTime();
	
	
	
	
	
	
	/*根据数组中的元素进行相应的操作，根据不同的动作(数组中的第三个元素)进行不同的方法操作
	 * */
	
	
	public void sendpara(String arg[],AppiumDriver driver) {
		
		String actionkey3=arg[2];
		
		switch(actionkey3){
		case "click":
			clickaction(arg,driver);break;
			
		case "edit":
			editaction(arg,driver);break;	
			
		case "scroll":
			scrollaction(arg,driver);break;	
		case "back":
			backaction(arg,driver);break;	
		case "clear":
			cleartest(arg, driver);break;		
			
		case "webview":		
			changewebview(arg,driver);break;
			
		case "androidmode":		
			changeandmode(arg,driver);break;
		case "null":
			 break;
		
		
		}
		
		
		
		
	}
	//click点击操作
		public void clickaction(String str[],AppiumDriver driver) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement we2;
			
			
			
			try {
				we2 = eleposition(str,driver);
				if(we2==null){
					 TakeScreenShot.takepics(driver, str);
					String testresult="Test Result:"+str[2]+";"+str[5]+"不存在;"+"FAIL;"+timesnow;
					LogUtil.loguuu("TestResultBack", testresult,"clickaction");
					rw.WriCSV(testresult);
					 
					 return;
					
				}
				
				else{
				
					we2.click();
					Thread.sleep(2000);
					tresult.testresultandwri(str, driver);
				//操作之后写入结果
				}
			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//截屏
			
//			Thread.sleep(1000);
//			TakeScreenShot.takepics(driver, str);
			
		
			
			
			
		}
		//切换到编辑模式
		
		public void editaction(String str[],AppiumDriver driver) {
			try {
				Thread.sleep(1000);
				WebElement we3=eleposition(str,driver);
				if(we3==null){
					 System.out.println(str[5]+"对象不存在");
					 TakeScreenShot.takepics(driver, str);
					 String testresult="Test Result:"+str[2]+";"+str[5]+"不存在;"+"FAIL;"+timesnow;
					 LogUtil.loguuu("TestResultBack", testresult,"clickaction");
					 rw.WriCSV(testresult);
					 return;
					
				}
				else{
					  //清空之前文本框中的信息
					
				
						we3.sendKeys(str[7]);
				}
				Thread.sleep(1000);
				tresult.testresultandwri(str, driver);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			//截屏
			
//			Thread.sleep(1000);
//			TakeScreenShot.takepics(driver, str);
//			
			
			
			//操作之后写入结果
			
					
			
		}
		
		//清空文本框中的文字
		public void cleartest(String str[],AppiumDriver driver){
			
			String cmdstr="adb shell input keyevent 67";
			for(int m=0;m<15;m++){
					try {
						Runtime.getRuntime().exec(cmdstr).waitFor();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				//	Thread.sleep(2000);
			}
		}
		
		//切换到滑动模式
		public void scrollaction(String str[],AppiumDriver driver) {
			
			//操作之后写入结果
			
			//获得是最后adnroid还是webview
			
			/*
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			String weboran=str[6];
			if(weboran.equals("WEBVIEW")){
				
				int x1=33;
				int y1=1647;
				int x2=33;
				int y2=200;
				int hx1=781;
				int hy1=243;
				int hx2=61;
				int hy2=243;
				
					//判断是横向滑动还是竖向滑动
				//竖向滑动
					if(str[8].equals("vertical")){
						for(int j=0;j<20;j++){
				
					    	TouchAction ac=new TouchAction(driver).press(PointOption.point(x1,y1)).moveTo(PointOption.point(x2,y2)).release().waitAction();
						    ac.perform();
			

										}
					
					
				}
					if(str[8].equals("transverse")){
						for(int j=0;j<5;j++){
				
					    	TouchAction ac=new TouchAction(driver).press(PointOption.point(hx1,hy1)).moveTo(PointOption.point(hx2,hy2)).release().waitAction();
						    ac.perform();
						
						
					}
			
			
			
					}
			}
			if(weboran.equals("Android")){
			
			*/
				
			//	System.out.println("android模式下滑动");
			//	driver.s
				
				int x11=0;
				int y11=1647;
				int x22=0;
				int y22=311;
				int hx12=781;
				int hy12=243;
				int hx22=61;
				int hy22=243;
				
				TouchAction ac=new TouchAction(driver);
				//判断是横向滑动还是竖向滑动
				//竖向滑动
					if(str[8].equals("vertical")){
						for(int j=0;j<20;j++){
				
					    	ac.press(PointOption.point(x11,y11)).moveTo(PointOption.point(x22,y22)).release().waitAction();
					    
						    ac.perform();
			
						}
					
					
					}
					//横向滑动
					if(str[8].equals("transverse")){
						for(int j=0;j<5;j++){
				
						    //	TouchAction ac=new TouchAction(driver).press(PointOption.point(hx12,hy12)).moveTo(PointOption.point(hx22,hy22)).release().waitAction();
								ac.press(PointOption.point(hx12,hy12)).moveTo(PointOption.point(hx22,hy22)).release().waitAction();
								
							    ac.perform();
							
						
					
							}
						}
			
			
			tresult.testresultandwri(str, driver);
			
			
		}
		
		
		//返回键
		public void backaction(String str[],AppiumDriver driver){
			//页面返回操作
			try {
				Thread.sleep(2000);
				if(str[6].equals("WEBVIEW")){
				
					driver.navigate().back();
				}
				
				if(str[6].equals("Android")){
					
					//点击返回键关闭键盘
					String cmdstr="adb shell input keyevent 4";
					Runtime.getRuntime().exec(cmdstr).waitFor();
					Thread.sleep(2000);
					
					
					
					
				}

				//截屏
//				
//				Thread.sleep(2000);
//				TakeScreenShot.takepics(driver, str);
				
				Thread.sleep(2000);
				//操作之后写入结果
				
				tresult.testresultandwri(str, driver);
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
		
		
		
		
		//切换到webview模式
		public void changewebview(String str[],AppiumDriver driver) {
			try {
				Thread.sleep(2000);
				Set<String> contexts = driver.getContextHandles();
				
						for(String context:contexts) {
				
						        System.out.println("context:"+context);
						        
						        if (context.contains("WEBVIEW")) {
						        	
				                      driver.context(context);
				                      
				                      System.out.println("切换到webview");
				                 }
						        else{
						        	
						        	System.out.println("不包含,不切换模式");
						        	
						        }
				
						//会打印出  NATIVE_APP（原生app handle）和WEBVIEW_com.example.testapp(webview的 handle)
				
						}
						
					//	driver.context("WEBVIEW_com.itsenpupulai.courierport");
					//	driver.context("WEBVIEW_chrome");
						
						

						//截屏
//						
//						Thread.sleep(2000);
//						TakeScreenShot.takepics(driver, str);
						
						Thread.sleep(2000);
						//操作之后写入结果
						
							tresult.testresultandwri(str, driver);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			

			
		}
		
		//切换到android模式
		
	   public void changeandmode(String str[],AppiumDriver driver) {
		   try {
			Thread.sleep(2000);
			driver.context("NATIVE_APP");
			System.out.println("切换到native模式");

			//截屏
			
//			Thread.sleep(2000);
//			TakeScreenShot.takepics(driver, str);
			
			Thread.sleep(2000);
			
			//操作之后写入结果
			
					tresult.testresultandwri(str, driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
			
		}
	
	
	
	
	
	
	/*
	//根据数组中第二个元素进行不同方式的查找定位
	 * 
	 */
	public WebElement eleposition(String str[],AppiumDriver driver) {
		
		//根据数据中的第一个和第二个元素信息进行不同的定位
		String eleposition=str[1];
		String elemess=str[0];
		WebElement we = null;
		
		
		
		switch (eleposition) {
		
		case "res":
			we=findbyresid(str,driver);
			break;	

		case "xpath":
			we=findbyxpath(str,driver);
			
			break;
			
		case "classname":
			we=findbyclassname(str,driver);
			
			break;
			/*
			
		case "text":
			
			break;
			*/
			
		case "null":
			
			break;
			
		}	
			
			
		
	//	LogUtil.loguuu("AllAction", we.toString(),"eleposition");
		return we;
		
		
		
	}
	///find by resid/id
	
	public WebElement findbyresid(String str[],AppiumDriver driver) {
	//	LogUtil.loguuu("AllAction", str0);
//		System.out.println("str0:"+str0);
		System.out.println("driver:"+driver);
		
		Boolean isorno=DoesEleExist.doeswebElementExist(driver,str[0],str[6]);
		WebElement we1;
		
		try {
			Thread.sleep(2000);
			
			if(isorno.equals(true)){
			
				 we1=driver.findElement(By.id(str[0]));
			
			}
			else{
				 we1=null;
				
			}
			
			
			Thread.sleep(2000);
			return we1;
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	//find by xpath
	public WebElement findbyxpath(String str[],AppiumDriver driver) {
		
		try {
			Thread.sleep(2000);
			Boolean isorno=DoesEleExist.doeswebElementExist(driver,str[0],str[6]);
			WebElement we1;
			if(isorno.equals(true)){

				we1=driver.findElement(By.xpath(str[0]));
				Thread.sleep(2000);
			}
			else{
				
				we1=null;
			}
				
			return we1;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	//find by classname
		public WebElement findbyclassname(String str[],AppiumDriver driver) {
			
			try {
				Thread.sleep(2000);
				Boolean isorno=DoesEleExist.doeswebElementExist(driver,str[0],str[6]);
				WebElement we1;
				if(isorno.equals(true)){
				
						 we1=driver.findElement(By.className(str[0]));
						Thread.sleep(2000);
					}
				else{
					
					we1=null;
					
				}
				return we1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
			
			
		}
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
