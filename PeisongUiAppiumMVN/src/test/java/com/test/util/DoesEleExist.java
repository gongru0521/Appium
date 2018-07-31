package com.test.util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DoesEleExist {
	
	//判断元素是否存在,android 或webview
		public static boolean doeswebElementExist(WebDriver driver, String str3,String str6){
			
			
			  try 
			        { 
				  
				          switch (str6) {
						case "Android":
							driver.findElement(By.id(str3)); 
							
							break;

						case "WEBVIEW":
							driver.findElement(By.xpath(str3)); 
							break;
						}
				  
			            
			               return true; 
			        } 
			        catch (NoSuchElementException e) 
			        { 
			                 return false; 
			         } 
			
			
		}
		
		
		

}
