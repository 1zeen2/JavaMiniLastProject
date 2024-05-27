package com.sist.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// 파일 읽기 => FileInputStream / FileReader
//				=> 1byte (한글 깨짐) => 2byte (한글 정상)
//				=> 한글을 읽을 때 1byte ==> 2byte 변경해서 읽기 => BufferedReader

public class 라이브러리_10 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\JavaDev\\java_data\\movie.txt");
//			// 영문, 숫자, 특수문자는 상관이 없다 => 영어가 아닌 다른 언어는 다 깨진다.
//			int i = 0;
//			String data = "";
//			while ((i = fis.read()) != -1) {
//				data += (char) i;
//			}
//			System.out.println(data);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			//										   ----------------- Stream (1byte) ==> Reader (2byte) ===> 1byte => 2byte로 읽어온다.
			String data = "";
			long start = System.currentTimeMillis();
			while (true) {
				String s = br.readLine();	// 한 줄씩 읽기
				if (s == null) break;		// 문장이 끝나면 ~
				data += s + "\n";
			}
			long end = System.currentTimeMillis();
			System.out.println(data);
			System.out.println("걸린 시간 : " + (end-start));
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(Exception ex) {}
		}
	}

}
