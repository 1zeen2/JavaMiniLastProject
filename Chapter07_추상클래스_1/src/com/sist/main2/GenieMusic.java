package com.sist.main2;
/*
 * 	객체 생성
 * 	--------
 *	클래스 명 객체 명 = new 클래스 명()
 *	--------
 *	=> 다른 클래스에 접근이 불가능
 *	
 *	class A {
 *		int a, b;
 *		public void aaa(){}
 *	}
 *	
 *	class B extends A {
 *		int c;
 *		public void bbb(){}
 *	}
 *	
 *	A aa = new A();
 *	=> a, b, aaa()
 *
 *	B bb = new B();
 *	=> c, bbb() => 상속 받는 내용 접근이 가능 => a, b, aaa()
 *	상속을 내린 클래스는 본인이 가지고 있는 변수, 메서드만 접근이 가능 => 상속 받은 클래스에 접근이 불가능
 *
 *	A cc = new B()
 *		   ------ 메서드만 변경이 된다. (멤버 변수는 그대로)
 *		   ------ aaa()를 B가 가지고 있는 aaa()로 덮어쓴다.
 *	=> a, b, aaa()
 *			 ---- B가 가지고 있는 메서드 호출	=====> Overriding 기법.
 */
public class GenieMusic extends MusicSystem {

	public void init() {
		
	}

	@Override
	public void find(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail(int mno) {
		// TODO Auto-generated method stub
		
	}
}
