package com.sist.io;

import java.util.*;
import java.io.*;

public class 라이브러리_2 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\JavaDev\\java_data\\student.txt");
		
		// 파일은 같은 폴더에서는 같은 파일 명이 생성되지 않는다.
		if (!file.exists()) {	// 없으면 만든다.
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} else {
			System.out.println("이미 존재하는 파일입니다.");
		}
	}

}
