package com.sist.main2;

class A {
	int c;
	
	public int add(int a, int b) {
		int c = a + b;	// 지역 변수는 메서드 호출과 동시에 값이 사라진다.
		return c;
	}
	public void plus(int a, int b) {
		c = a + b;
	}
}
public class MainClass {

	public static void main(String[] args) {
		A a = new A();
		int c = a.add(10, 20);		// c 변수의 메모리는 회수가 된다.
		System.out.println(c);
		
		a.plus(10, 20);
		System.out.println(a.c);	// 멤버 변수 c 의 값은 프로그램 종료 시 까지 값이 유지가 된다.
		

	}

}
