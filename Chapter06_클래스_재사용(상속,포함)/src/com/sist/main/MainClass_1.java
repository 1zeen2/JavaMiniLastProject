package com.sist.main;
/* 
 * 	1. 객체 지향 프로그램 => 규칙 (권장 사항)
 * 		1) 기존의 프로그램을 쉽게 제작, 활용
 * 	-------------------------------------------
 * 		= 코드의 재사용이 높다 (개발이 빠르다) => 상속, 포함
 * 												---	 ----
 * 												|	  |=> 기존의 기능을 있는 그대로 사용 => has - a
 * 												|=> 기존의 기능을 변경 (오버 라이딩) => is - a
 * 
 * 		= 코드 관리가 용이하다 => 구조화 된 프로그램 (프로그램을 관련된 사항끼리 나눠서 작업) => 메서드
 * 		= 이미 사용 중인 프로그램을 변경
 * 		  ---------------------- 신뢰성이 높다.
 * 		= 보안 => 데이터를 보호하는 것 => 캡슐화
 * 	-------------------------------------------
 * 	객체 지향의 3대 특성	=> 캡슐화 => 변수, 등을 => private 변수 => 메서드를 이용하여 접근하는 방식
 * 						=> 상속	=> 재사용 기법
 * 						=> 다형성 (오버 로딩, 오버 라이딩) => 유지보수 (기능 변경 = 메서드 관련)
 * 	** 상속을 사용하면 결합성이 높고, 제약 조건이 많은 존재가 되며, 메모리가 커지고, 속도가 늦어져 => 가급적이면 사용하지 않는다
 * 		=> 단일 상속	
 * 		=> 상속 기호 => extends => 기존의 클래스를 확장해서 사용..
 * 			class A
 * 			class B extends A			===> private
 * 				 --			--			===> static
 * 				 |			|			===> 생성자
 * 			상속 받는	상속을 내리는	===> 초기화 블럭
 * 										----------------- 을 제외하고 나머지는 상속이 된다.
 * 			** 상속을 내린 클래스 (상위, 부모, 베이클래스)는 상속 받는 클래스의 변수, 메서드에 접근이 안된다
 * 			** 상속을 받은 클래스는 상속 내린 클래스에 접근이 가능하다.
 * 			   ----------------	  -----------------
 * 						|					|=> 자신의 객체만 가지고 있다. (this)
 * 						|=> 자신의 객체, 상위 클래스 객체
 * 							 (this)			(super)
 * 			** 모든 클래스는 자신의 객체를 가지고 있다. => this
 * 			   ------------------------------------------------ 인스턴스, 생성자에서 사용이 가능하다.
 * 			** static 메서드나 static 초기화 블럭은 this 가 없다. 
 * 			** new 를 이용해서 객체를 생성할 때 => this 가 생성
 * 			   --- JVM에 의해서 자동으로 생성
 * 						
 * 
 * 
 * 
 */
public class MainClass_1 {
	private int num; // Heap 에 저장
	public MainClass_1() {
		System.out.println("this라는 자신의 객체가 생성된다");
		System.out.println("this = " + this);
	}
	public void numData(int num) { // stack 에 저장
		// 적용 우선 순위가 있다 => 지역 변수와 매개 변수가 우선 순위이고 => 다음에 멤버 변수를 찾는다.
		System.out.println("num = " + num);
		// 지역 변수, 매개 변수가 우선 순위이다.
		// 멤버 변수를 사용할 때는 this.변수명 
		System.out.println("this.num = " + this.num);
		// this << 가 구분자가 된다 ==> 멤버 변수를 사용.
		this.num = num;
		System.out.println("this.num = " + this.num);
		// 매개 변수와 멤버 변수의 충돌이 많아 잘 구분해야 한다.
	}
	public void display() {
		System.out.println("this = " + this);
	}
	public static void aaa() {
//		System.out.println("this = " + this); // static 에서는 모든 객체가 공통으로 사용되기 때문에 => this 를 사용할 수 없다.
	}

	public static void main(String[] args) {
		// 객체 생성
		MainClass_1 m = new MainClass_1();
		// this = m => JVM이 자동으로 객체 주소를 대입.
		System.out.println("m = " + m);
		m.numData(100);
		MainClass_1 m1 = new MainClass_1();
		System.out.println("m1 = " + m1);
		// 객체 생성 시 마다 this 가 생성이 된다 => 자신의 클래스 객체를 나타내준다.
		// 색상과 글씨체로 멤버 변수 (전역 변수), 인지 매개 변수 (블럭 변수)인지 판단할 수 있다.
		// this, super (상위 객체)
		
	}

}
