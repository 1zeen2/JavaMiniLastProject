package com.sist.io;
/*
 * 	파일 쓰기 FileWriter
 * 		=> 크롤링한 데이터를 저장
 * 	파일 읽기 File Reader
 * 		=> 프로그램 제어
 * 		=> 읽기 ==> 한 줄씩 (파일에 있는 데이터를 메모리에 한 번에 저장) / 한 글자 (파일에 있는 데이터를 한 글자씩)
 * 		=> 필터 스트림 ==> BufferedReader ********* 네트워크, 웹
 */
/*
 * 	FileWriter (FileOutputStream) => write(), close()
 * 	FileReader (FileInputStream) => read(), close()
 * 	=> 한 글자씩 읽기 / 한 글자씩 쓰기
 * 	   ------------- 여러 글자 입력이 가능
 * 		
 * 		
 */

import java.io.*;

public class 라이브러리_8 {

	public static void main(String[] args) {
		// 1. FileOutputStream을 이용한 저장
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:\\javaDev\\java_data\\member.txt");
			// 파일이 없는 경우에는 자동으로 생성이 된다.
			// 파일이 있는 경우에는 문자 저장이 가능하다.
			// => FileOutputStream / FileWriter => 경로명, 파일명을 지정하면 없는 경우 자동으로 생성한다.
			// 한 글자 입력 => byte(int, char) / 여러 글자 입력 (byte[])
//			fos.write('A');
//			fos.write('B');
//			fos.write('C');
			String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			fos.write(msg.getBytes());
			// 바이트 단위로 저장 => byte, byte[] => getBytes 
			
			System.out.println("저장 완료.");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception ex) {}
		}
	}

}
