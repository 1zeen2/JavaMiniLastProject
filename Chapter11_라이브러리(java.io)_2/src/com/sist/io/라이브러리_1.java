package com.sist.io;

import java.io.Serializable;

/*
 * 	ObjectInputStream	/	ObjectOutputstream
 * 	=> 객체 단위로 저장한다.
 * 	   --------------
 * 			직렬화					역직렬화
 */

import java.io.*;
import java.util.*;
/*
 * 	1. 인터페이스 구현을 위해 class에 implements Serializable 선언
 * 	2. 멤버 변수 선언, 생성자 선언.(매개 변수로 입력값을 출력하기 위해)
 * 	3. ArrayList<제네릭>을 통해 여러가지 데이터 타입을 배열로 저장할 수 있게 함 (클래스타입)
 */

class Student implements Serializable {
	
	private int hakbun;
	private String name;
	private int kor, eng, math;
	
	public Student(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student () {
		
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "홍길동", 90, 80, 76));
		list.add(new Student(2, "이순신", 85, 78, 85));
		list.add(new Student(3, "심청이", 97, 87, 75));
		list.add(new Student(4, "김두한", 76, 79, 87));
		list.add(new Student(5, "박문수", 86, 67, 49));
		ObjectOutputStream oos = null;
		try {
			File file = new File("c:\\JavaDev\\java_data\\std.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			// ObjectOutputStream 생성 => FileOutputStream 객체를 매개 변수로 전송
			FileOutputStream fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			// 객체 단위로 파일을 저장
			oos.writeObject(list);
			System.out.println("객체 단위 저장 완료!!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception ex) {}
		}

	}

}
