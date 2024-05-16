package com.sist.main3;
abstract class A {
	public abstract void aaa();
	public abstract void bbb();
	public void ccc() {
		
	}
	
	public void ddd() {}	// 프로젝트 구현이 끝난 다음에 추가하는 기능이 있는 경우 => 구현 된 메서드를 만들어서 처리한다.
	// 필요한 클래스에서만 Overriding 한다.
	/*
	 * 	추상 클래스를 보완
	 * 	---------------- 인터페이스
	 * 		1. 다중 상속이 가능
	 * 		2. 모든 메서드가 추상 메서드
	 * 		3. 모든 변수는 상수이다.
	 * 		------------------- 1.8부터 변경 => 구현이 된 메서드가 존재 ... *** 인터페이스는 많이 공부해야 함 ***
	 */
}

class B extends A {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

}

class C  extends A {
	
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}

class D extends A{
	
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
}
public class MainClass {

	public static void main(String[] args) {
		

	}

}
