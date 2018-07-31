package com.test.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.test.peisong.AppiumTestDemo;

public class RandWCSV {
	
	//从csv文件中获取list<String>文件
	
	
	
//	CSVURL csvurl=new CSVURL();

public static String readurl;

public static String writeurl;

	

	public List<String> ReadCSV() throws IOException {
		
		List<String> fileallmeass=new ArrayList<String>();
		
		//获取文件url
		//  String readurl=CSVURL.readurl1;
		
	//	String readurl="./src/test/resources/PeisongAppiumData.csv";
		
			
			System.out.println("读取url:"+readurl);
			
		
		   String linecontent=null;	
		
		  File file=new File(readurl);
		/*
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		*/
		
		//读取中文csv文件
		FileInputStream  fileins=new FileInputStream(file);
		InputStreamReader insreader=new InputStreamReader(fileins,"GBK");
		BufferedReader br=new BufferedReader(insreader);
		
		br.readLine();
		
		
		while((linecontent=br.readLine())!=null){
			//System.out.println("linecontent:"+linecontent);
			//日志记录
			LogUtil.loguuu("RandWCSV", linecontent,"readcsv");
			//返回信息
			
			fileallmeass.add(linecontent);
			
			
		}	
		
		insreader.close();
	    br.close();
		
		return fileallmeass;
			
		
	}
	
	
	//写入csv文件
	
	
	public void WriCSV(String pararesult) {

		
	
	//	String url="./src/test/resources/PeisongAppiumTestResult.csv";

	//	String writeurl=CSVURL.writeurl1;
		
		File file=new File(writeurl);
		//开始写入csv数据
		FileOutputStream fileout = null;
		try {
			fileout = new FileOutputStream(file,true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(fileout,"GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw=new BufferedWriter(osw);
		//写入数据
		try {
			bw.write(pararesult);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.write("\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
