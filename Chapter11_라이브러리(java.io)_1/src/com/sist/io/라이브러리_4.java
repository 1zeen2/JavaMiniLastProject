package com.sist.io;

import java.io.*;
import java.util.*;
import java.text.*;
/*
 * 	File관련
 * 		1. 생성자	=> 경로 명 : 폴더 정보 읽기
 * 						File dir = new File(c:\\javaDev");
 * 					=> 경로 명 / 파일 명 : 파일에 대한 정보
 * 						File dir = new File("c:\\javaDev\\파일명");
 * 
 * 		2. 폴더 생성 : mkdir()
 * 		   파일 생성 : createNewFile()
 * 
 * 		3. 폴더 삭제 : delete()
 * 						=> 폴더 안에 파일 / 폴더가 있는 경우에는 삭제가 되지 않는다.
 * 						   -------------------- 먼저 삭제 후에 => 삭제한다.
 * 		   파일 삭제 : delete() => 삭제
 * 
 * 		4. 폴더 안에 있는 파일 / 폴더의 정보 읽기 : listFiles() : File[]로 이루어져있음
 * 
 * 		5. 파일명, 경로면
 * 			getName(), getPath()
 * 
 * 		6. 파일 크기 : length()
 * 	----------------------------------------------------------------------------------
 * 		
 * 
 */

public class 라이브러리_4 {
	// 코딩이 된 상태 => 메서드 뒤에 throws
	// 이제 코딩을 시작하는 경우 =>  try catch
	// io/sql/net => 대부분의 클래스 => CheckedException
	public static void main(String[] args) {
		try {
			File dir = new File("c:\\javaDev");
			// 파일 정보를 읽어옵니다.
			File[] list = dir.listFiles();// c:\\javaDev 경로에 있는 모든 파일 읽기
			
			for (File file : list) {
				System.out.println(file.getName() + "   ");
				String s = file.getName();
				s = s.substring(s.lastIndexOf(".") + 1);
				System.out.println(s + "파일");
				
				
//				if (file.isFile()) { // 파일 출력
//					System.out.print(file.getName() + "   ");
//					String s = file.length() / 1024 != 0 ? file.length() / 1024 + "KB" : file.length() + "Bytes";
//					System.out.println(s + "   ");
//					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
//					System.out.println();
//					
//				} else {	// 디렉토리(폴더) 출력
//					System.out.print(file.getName() + "   ");
//					System.out.print("파일 폴더   ");
//					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
//					System.out.println();
//				}
				
			}
			
		} catch (Exception ex) {}
		
	}

}
