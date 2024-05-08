package com.sist.main;

public class A {

	//	생성자 => 클래스가 메모리에 저장되는 시점 ==> 생성자 선언 시 저장.
	public A() {
		System.out.println("메모리에 저장");
	}
	//	메모리 해제 => 소멸자 함수
	@Override
	protected void finalize() throws Throwable{
		System.out.println("메모리 해제");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();	//	충전
		a = null;		//	방전 => 객체가 null 이면 사용할 수 없다.
		System.gc();
	}

}
