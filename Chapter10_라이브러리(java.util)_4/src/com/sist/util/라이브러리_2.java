package com.sist.util;

import java.util.*;
import java.io.*;

public class 라이브러리_2 {

	public static void main(String[] args) {
//		properties 생성
		try {
			Properties prop = new Properties();	//	Map Key = 값 (key는 중복할 수 없다.)
//			파일 읽기
			prop.load(new FileInputStream("c:\\java_data\\db.properties"));
//			값 읽기
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			System.out.println("Driver : " + driver);
			System.out.println("Url : " + url);
			System.out.println("User : " + username);
			System.out.println("Password : " + password);
			
		} catch(Exception ex) {}
//		Map 방식 => 구분자, 값을 동시에 저장.
	}

}

