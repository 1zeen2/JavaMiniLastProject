package com.sist.set;

import java.util.*;

class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			// instanceof ==> 객체 크기 비교
			// 오른 쪽이 크거나 같으면 true를 반환
			// 객체명  instanceof 클래스명
			Student s = (Student)obj;
			return name.equals(s.name) && age == s.age;
		}
		return false;
	}
	
}
public class Set_3 {
	public static void Set_3 (String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student s1 = new Student("홍길동", 20);
		Student s2 = new Student("홍길동", 20);
		
		System.out.println(("심청이" + 20).hashCode());
		System.out.println(("홍길동" + 20).hashCode());
		
		set.add(s1);
		set.add(s2);
		
		for (Student ss : set) {
			System.out.println(ss.getName() + "," + ss.getAge());
		}
		String ss = "";
		Object obj = new Object();
		StringBuffer sb = new StringBuffer();
		if (ss instanceof Object) {
			System.out.println("String 클래스는 Object보다 작다.");
		}
		if (obj instanceof String) {
			System.out.println("Object 객체는 String보다 작다");
		}
//		if (sb instanceof obj) {
//			System.out.println("StringBuffer 클래스는 Object보다 작다.");
		}
		/*
		 * 			   Object
		 * 		---------------------
		 * 		|					|
		 * 	  String		  StringBuffer
		 * ----------------------------------- 비교가 불가능 => 클래스 비교 (상속 혹은 포함)
		 * 	상속 : 상
		 * 
		 * 
		 * 
		 * 
		 */
}
