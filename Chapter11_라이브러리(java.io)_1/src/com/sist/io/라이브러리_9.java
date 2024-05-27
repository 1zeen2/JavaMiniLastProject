package com.sist.io;
// 파일 쓰기 => 문자 스트림 (2byte) => 한글 사용이 편리하다.
// FileWriter 

import java.io.*;

public class 라이브러리_9 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\javaDev\\java_data\\board.txt", true);	// 없는 경우에는 자동 생성
			// FileWriter이기 때문에 폴더는 생성하지 않고 파일만 생성한다.
			String msg ="ABCDEFGHIJKLMNOPQRSTUVWXYZ\r\n";
			fw.write(msg);
			System.out.println("저장 완료 ~_~");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception ex) {}
		}
	}

}
