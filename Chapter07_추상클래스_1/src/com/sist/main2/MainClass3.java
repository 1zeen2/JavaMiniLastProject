package com.sist.main2;

class AA  {
	int a = 10;
	int b = 20;
	public void aaa() {
		System.out.println("A : aaa() Call...");
	}
}
//	AA a = new AA(); ==> a, b, aaa()
class BB extends AA {
	int c = 30;
	public void aaa() {
		System.out.println("B : aaa() Call...");
	}
	
	public  void bbb() {
		System.out.println("B : bbb() Call...");
	}
}
//	BB b = new BB() ==> c, aaa() bbb()
// int a = 10, b = 20; aaa()
// aaa() "B : aaa() Call..." 로 변경


public class MainClass3 {

	public static void main(String[] args) {
		AA aa = new AA();	// AA에 설정된 변수, 메서드에만 접근이 가능하다.
		System.out.println(aa.a);
		System.out.println(aa.b);
		aa.aaa();
		System.out.println("=================== BB ================");
		
		BB bb = new BB();
		System.out.println(bb.c);
		bb.aaa();
		bb.bbb();
		System.out.println(bb.a);
		System.out.println(bb.b);
		System.out.println("================ AA : new BB() ====================");
		
		AA cc = new BB();
		// 변수는 AA가 가지고 있는 것만, 메서드는 BB가 가지고 있는 것을 호출
		// cc=> a, b (c는 사용이 불가능) => 변경된 aaa()를 출력한다,
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.aaa();
		/*
		 * 	기본
		 * 	클래스 명 객체 명 = new 생성자()
		 * 	--------			   -------
		 * 		|					  |
		 * 		----------------------- 같다.
		 * 
		 * 	클래스 명 객체 명 = new 생성자()
		 * 	
		 * 	class A
		 * 	class B extemds A
		 * 	class C extemds A
		 * 	class D extemds A
		 * 	class E extemds A
		 * 
		 * 	B b = new B()
		 * 	B c = new C()
		 * 	B d = new D()
		 * 	B e = new E() 
		 * 	------------------------ 객체를 여러 개 생성하는 것이 아니라
		 * 	A a = new B();
		 * 
		 * 	a = new B();
		 * 	a = new C();
		 * 	a = new D();
		 * 	a = new E();
		 * 	------------------------ 한 개의 객체를 이용한다
		 *	----------------------------- 추상 클래스, 인터페이스
		 *
		 *	=> 목적
		 *		여러 개의 관려된 클래스를 한 개로 묶어서 관리할 목적
		 *		=> 설계용 ==> 다음에 재사용을 할 수 있다.
		 *
		 *	=> 단점 : 단일 상속
		 *		=> 일반 클래스와 동일하다
		 *		멤버 변수, 생성자, 구현된 메서드( 혹은 구현되지 않은 메서드)
		 *
		 *	사이트
		 *		맛집 / 영화
		 *		영화 => 로그인, 회원 가입, 영화 목록 / 영화 상세 / 예약
		 *		
		 *		맛집 => 로그인, 회원 가입, 맛집 목록 / 맛집 상세 / 예얄
		 *
		 *	public sbatract class ClassName {
		 *		----------------------------------------
		 *		변수
		 *			static / 인스턴스 변수
		 *		----------------------------------------
		 *		생성자 : default 만 사용하는 것을 권장
		 *		----------------------------------------
		 *		구현된 메서드
		 *
		 *		----------------------------------------
		 *		구현이 안된 메서드 => 추상 메서드
		 *		----------------------------------------
		 *	}
		 *
		 *
		 *
		 * 
		 * 
		 * 
		 */
		
		

	}

}
