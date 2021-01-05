package com.collection.map.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesMain {
///resources/config.properties 파일의 정보를 Properties객체를 이용해서 읽어와 화면에 출력하세요.

	public static void main(String[] args) {
		PropertiesMain pm = new PropertiesMain();
		pm.read();
	}
	
	public void read() {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("config.properties"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Enumeration<?> en = prop.propertyNames();
		while(en.hasMoreElements()) {
			String key =(String) en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key+ " = "+value);
		}
		
	}
	

}
