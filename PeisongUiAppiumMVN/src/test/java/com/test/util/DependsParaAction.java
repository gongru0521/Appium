package com.test.util;

import io.appium.java_client.AppiumDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class DependsParaAction {
	//根据参数进行相应的动作
	
	//csv中list<String>获得每行String中的子元素，并进行相应操作
	RandWCSV randcsv=new RandWCSV();
	
	AllAction ac=new AllAction();
	
		public void parama(AppiumDriver driver) throws IOException, InterruptedException{
			List<String> readcsv=randcsv.ReadCSV();
			
		
			String paralineper[]=new String[10];
			String ss=null;
			
			Iterator iterator=readcsv.iterator();
			
			while(iterator.hasNext()){
				
				//获取每个元素
				ss=(String)iterator.next();
				paralineper=ss.split(";");
				//将数组中的元素进行参数化传递下去
				
			    ac.sendpara(paralineper,driver);
				
			}
				
				
			}
	

}
