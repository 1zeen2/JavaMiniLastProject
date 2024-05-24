package com.sist.util;

import java.util.ArrayList;

// 사용자 정의
class Student {
	private int hakbun;
	private String name;
	private int kor;
	private int eng;
	private int math;
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
	// 사용자 입력값을 받아 초기화
	public Student(int hakbun, String name, int kor, int eng, int math) {
		
	}
	// 매개 변수가 있는 생성자가 있는 경우에는 디폴트 생성자를 만들어야 제어가 편리하다
	public Student() {
		// 초기화 => 모든 학생 정보가 같은 값을 가지고 저장이 된다
	}
}
class A {
	int a, b;
	public A() {
		a = 10;
		b = 20;
	}
} 
public class 컬렉션_3 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();			
		list.add(new Student(1, "홍길동", 89, 79, 97));
		list.add(new Student(2, "홍길동", 60, 72, 78));
		list.add(new Student(3, "홍길동", 76, 57, 95));
		list.add(new Student(4, "홍길동", 97, 74, 68));
		list.add(new Student(5, "홍길동", 84, 67, 72));
		System.out.println("데이터 출력");
		
		for (Student std : list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
			std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		
		System.out.println();
		
		Student s = new Student();
		s.setHakbun(6);
		s.setName("강감찬");
		s.setKor(80);
		s.setEng(60);
		s.setMath(92);
		list.add(s);
		
		for (Student std : list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
			std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("==============================================");
		list.add(new Student(7, "춘향이", 90, 60, 75));
		
		for (Student std : list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
			std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		
		System.out.println("==============================================");
		for (Student std : list) {
			System.out.println(std);
		}
		
		System.out.println("==============================================");
		for (int i = 0; 0 < list.size(); i++) {
			Student std = list.get(i);
				System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
				std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		
		System.out.println("==============================================");
		list.remove(3);
		for (Student std : list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
			std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		
		System.out.println("==============================================");
//		list.size(1, new Student(2,"수정", 90, 34, 50));
		for (Student std : list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
			std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("===================================:");
		for (Student std : list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n", 
			std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("현재 인원");
	}

}
