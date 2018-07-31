package com.test.peisong;

import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import com.test.util.DependsParaAction;
import com.test.util.RandWCSV;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class AppiumTestDemo {
	//多个class中使用该driver
	//public static AppiumDriver driver;
	public AppiumDriver driver;
	
	
  public  String readurl1="./src/test/resources/PeisongAppiumData.csv";
//	
  public  String writeurl1="./src/test/resources/PeisongAppiumTestResult.csv";
	
	DependsParaAction dpa=new DependsParaAction();
	RandWCSV  rw=new RandWCSV();
	
	
		
		
		
		
		
	//	AppDriver ap=new AppDriver(deviceName,platformVersion,appActivity, appPackage);
		
		
		
	
	
	
	
	//准备测试工作
  @BeforeClass
	
	public void SetUpWorking() throws IOException{
	  	String deviceName="Redmi Note2";
		String platformVersion="5.0.2";
		String appActivity=".activity.BeforeWelcomeActivity";
		String appPackage="com.itsenpupulai.courierport";
		AppDriver ap=new AppDriver();
		ap.appDriver(deviceName, platformVersion, appActivity, appPackage);
		
		driver=ap.getDriver();
		
	  
	  
	//	DesiredCapabilities capabilities = new DesiredCapabilities();
		//连接红米note设备信息的准备工作
//		capabilities.setCapability("deviceName","Redmi Note2");  
//        capabilities.setCapability("automationName","Appium");  
//        capabilities.setCapability("platformName","Android");  
//        capabilities.setCapability("platformVersion","5.0.2");
//        
//        capabilities.setCapability("appPackage", "com.itsenpupulai.courierport");  
//        capabilities.setCapability("appActivity", ".activity.BeforeWelcomeActivity");  
//        capabilities.setCapability("sessionOverride", true);    //每次启动时覆盖session，否则第二次后运行会报错不能新建session  
//        capabilities.setCapability("unicodeKeyboard", false);    //设置键盘  
//        capabilities.setCapability("resetKeyboard", true);     //使用系统默认键盘
//        
//
//        
//        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);         
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
        //点击异常框
//        TouchAction ac=new TouchAction(driver);
//        int x1=540;
//        int y1=1739;
//        ac.press(PointOption.point(x1,y1));
		
		
		
		
	}
	
	
	
	
	//获得write read url
	
	
	
	
	
	
	/*
	 * 
	 * 开始执行测试
	 * 
	 * 
	 */
	
	
	
  //  @Test
	
	public void test001(){
		Assert.assertTrue(true);
		String sa="say";
		Assert.assertEquals("say", sa);
		
		System.out.println("This is first test!");
		
	
		
	}
	
	@Test
	public void test002() throws InterruptedException, IOException{
		
		
	
		
		Thread.sleep(1000);
		  //点击异常框
        TouchAction ac=new TouchAction(driver);
        int x1=540;
        int y1=1739;
        ac.press(PointOption.point(x1,y1));
        
		
	 	
    Thread.sleep(3000);
	WebElement we1=driver.findElement(By.id("com.itsenpupulai.courierport:id/et_phone"));
	Thread.sleep(10000);
	//we1.sendKeys("18638732236");
	we1.click();
	we1.sendKeys("18638732236");
	Thread.sleep(2000);
	WebElement we2=driver.findElement(By.id("com.itsenpupulai.courierport:id/et_pwd"));
	we2.sendKeys("123456");
	Thread.sleep(2000);
	//点击返回键关闭键盘
	String cmdstr="adb shell input keyevent 4";
	Runtime.getRuntime().exec(cmdstr).waitFor();
	Thread.sleep(2000);
	
	//点击确定按钮
	
	WebElement button=driver.findElement(By.id("com.itsenpupulai.courierport:id/btn_login"));
	button.click();
	
	Thread.sleep(2000);
	//关闭广告和学习页
	
	WebElement closeaddsbutton=driver.findElement(By.id("com.itsenpupulai.courierport:id/iv_tianjianghongbao_cha"));
	closeaddsbutton.click();
	Thread.sleep(5000);
	
	WebElement closestudybutton=driver.findElement(By.id("com.itsenpupulai.courierport:id/dialog_iv_main_guider"));
	closestudybutton.click();
	Thread.sleep(2000);
	}
	@Test
	public void test003() throws InterruptedException, IOException{
	//打开侧滑栏
	
//	WebElement selfbutton=driver.findElement(By.id("com.itsenpupulai.courierport:id/top_persenal_center"));
//	selfbutton.click();
//	Thread.sleep(2000);
		//根据csv文件中的参数进行操作
	//	csvurl.setReadurl1(readurl1);
		    
	//	csvurl.setWriteurl1(writeurl1);
		
	
	
		RandWCSV.readurl=readurl1;
		RandWCSV.writeurl=writeurl1;
	
		
		dpa.parama(driver);
	
	}
	
	//点击web页面
	//@Test
	/*
	public void test004() throws InterruptedException{
	//进入在线客服
			WebElement wonlinehelp=driver.findElement(By.id("com.itsenpupulai.courierport:id/report_online_rl"));
			
			wonlinehelp.click();
			Thread.sleep(2000);
	}
	//@Test
	public void test005() throws InterruptedException, IOException{
			
			Set<String> contexts = driver.getContextHandles();

			for(String context:contexts) {

			        System.out.println("context:"+context);

			//会打印出  NATIVE_APP（原生app handle）和WEBVIEW_com.example.testapp(webview的 handle)

			}
			//切换到web页面
			driver.context("WEBVIEW_com.itsenpupulai.courierport");
			
			System.out.println("进入web页面:");
			
			WebElement joinpeisong2=driver.findElement(By.xpath("/html/body/div/div/div[1]/a[1]/div/p[1]"));
		//	System.out.println("joinpeisong2:"+joinpeisong2);
			Thread.sleep(3000);
			joinpeisong2.click();
			Thread.sleep(2000);
			//web url：http://test.pages.kkpbcdn.com/pages/onlineservice?city_id410100&user_id=411586
			
			
			
			//android模式下页面返回
//			String cmdstr="adb shell input keyevent 67";
//			Runtime.getRuntime().exec(cmdstr).waitFor();
//			Thread.sleep(3000);
			//web页面模式下页面后退

			driver.navigate().back();
			
	}
	*/
		
	
	

}
