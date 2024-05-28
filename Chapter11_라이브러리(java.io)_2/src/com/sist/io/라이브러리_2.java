package com.sist.io;
// 데이터 읽기

import java.util.*;
import java.io.*;
// 파일 입출력 => 프로젝트
// SQL 오라클 연동으로 FIS, FOS 사용이 많이 줄었음
// 개인 정보 저장 => 네트워크 연결이 안되면 ==> 파일로 대체
// JSON / CVS / XML => 파싱 (필요한 데이터 읽기) => 오픈 API (라이브러리가 따로 있다)
// jackon CVSReader / CSVWriter, ** DOM SAM
// 	=> 파이썬(공공데이터) => CSV (데이터 파일을 읽어올 수 있어야 함) 
public class 라이브러리_2 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("c:\\JavaDev\\java_data\\std.txt");
			ois = new ObjectInputStream(fis);
			ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
			for(Student s : list) {
				System.out.println(s.getHakbun() + " " + s.getName() + " " + s.getKor() + " " + s.getEng() + " " + s.getMath());
							
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception ex) {
			
			}
		}
	}

}