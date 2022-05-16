package com.collection.par03.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test1() {
		//Properties
		Properties prop = new Properties();
		
		prop.setProperty("id", "student");
		prop.setProperty("password", "1234");
		
		try {
			prop.store(new FileOutputStream("idpw.properties"), "id/pw"); //properties는 키와 값을 알아서 구분함
			prop.store(new FileWriter("idpw.txt"), "id/pw"); //txt파일은 그저 문자로 출력함.
			prop.storeToXML(new FileOutputStream("driver.xml"), "id/pw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		}
	


public void test2() {
	//파일로부터 정보를 읽어다가 properties에 저장
	Properties prop = new Properties();
	
	try {
		//prop.load(new FileInputStream("idpw.properties"));
		//prop.load(new FileReader("idpw.txt"));
		prop.loadFromXML(new FileInputStream("driver.xml"));
		
		System.out.println(prop.getProperty("id"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("name"));
		
		prop.list(System.out);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}
