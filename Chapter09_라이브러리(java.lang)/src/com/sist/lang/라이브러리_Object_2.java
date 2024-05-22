package com.sist.lang;

import java.util.*;

class Sawon {
	private String name;
	private String sex;
	
	// 은닉화 된 변수를 메서드를 통해서 변수에 접근할 수 있게 해줌 (읽기 / 쓰기)
	// => 캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
		// this 는 Sawon 의 객체 => 지역 변수 우선 순위
		// 지역 변수 명 = 멤버 변수가 같은 경우에 => 구분을 해주어야 하기 때문에 => this 를 이용한다.
		// 변수가 같을 수 있다. => 멤버 변수 = Heap, 지역 변수 = Stack ==> 메모리 위치가 다르기 때문에 같은 이름으로 저장할 수 있다.
	
	// toString()을 Overriding 한다.
	@Override
	public String toString() {
		return "이름 : " + name + ", 성별 : " + sex;
	}
	// Object 에서 Overriding 은 toString 이 제일 많다 ==> 인스턴스 변수 값 확인
	// 문자열 변활 할 때에도 많이 사용한다. => 대부분 Java 에서 지원하는 메서드의 리턴 형은 Object 로 되어있다.
	// 클래스 저장 => Object 
	
}
public class 라이브러리_Object_2 {

	public static void main(String[] args) {
//		Sawon s = new Sawon();	// 메모리에 name, sex 가 저장됨
//		s.setName("홍길동");
//		s.setSex("남자");
//		System.out.println(s); // 주소 값 => 자동으로 toString() 호출이 되기 때문에
//		System.out.println(s.toString());	// toString() 생략이 가능하다.
		ArrayList<Sawon> list = new ArrayList<Sawon>();	//	
		list.add(new Sawon());
		list.add(new Sawon());
		list.add(new Sawon());
//		
//		int a = (int)list.get(0);
//		double d = (double)list.get(1);
		String s = list.get(2).toString();
		
	}

}
