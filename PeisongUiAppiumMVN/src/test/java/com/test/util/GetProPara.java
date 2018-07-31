package com.test.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProPara {
	
	//读取配置文件中的信息
	public static String gotpara(String keyword) {
		String value=null;
		Properties  prop=new Properties();
	//	String propurl="/mnt/sdcard/test/appium/docs/TestData.properties";
		String propurl="。/src/test/resources/TestData.properties";
		File file=new File(propurl);
		InputStream ins;
		try {
			ins = new FileInputStream(file);
			prop.load(ins);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//根据关键字获取value的值
		value=prop.getProperty(keyword);
		
		System.out.println("keyword:"+keyword);
		System.out.println("value:"+value);
		
		
		return value;
		
	}
	
	
	//或得读取写入csv url
//	public static String readurl1;
//	public static String writeurl1;
	
	
	
	
	
	
//	public static String getreadurl(){
//		
//		
//		
//		readurl1=GetProPara.gotpara("Peireadurl");
//		
//		
//	
//	
//		System.out.println("readurl1:"+readurl1);
//	
//	
//	
//		return readurl1;	
//	
//}
//public static String getwriteurl(){
//	
//	
//		writeurl1=GetProPara.gotpara("Peiwriteurl");
//		
//		
//
//	
//	
//	  System.out.println("writeurl1:"+writeurl1);
//	  return writeurl1;	
//	
//}
//public static String getReadurl1() {
//	return readurl1;
//}
//public static void setReadurl1(String readurl1) {
//	
//	
//	readurl1=GetProPara.gotpara(readurl1);
//}
//public static String getWriteurl1() {
//	return writeurl1;
//}
//public static void setWriteurl1(String writeurl1) {
//	
//	
//	writeurl1=GetProPara.gotpara(writeurl1);
//}

	

}
