package com.sist.main;
/*
 * 	상속
 * 		=> 사용자 정의 클래스는 상속으로 사용을 잘 하지 않는다.
 * 		=> 라이브러리 클래스
 * 		   ---------------
 * 		=> 단일 상속
 * 			=> 상위 클래스는 가급적인 공통 기반을 모아서 처리한다
 * 				class 사람
 * 		extend 사람	|	=> 사람 클래스를 재사용.
 * 		-------------------------
 * 		|		|		|		|
 * 	  회사원	   학생   교직원    교수
 * 	
 * 		=> 메모리에 저장
 * 			상위 클래스 = 하위 클래스
 * 			-----------------------
 * 			상위 클래스 = 상위 클래스
 * 			
 * 			하위 클래스 = 하위 클래스
 * 			하위 클래스 = (하위 클래스) 상위 클래스
 * 			
 * 			=> 클래스 크기는 상속이 있어야 가능하다.
 * 			   -----------------
 * 			   상속 내리는 클래스 > 상속 받는 클래스
 * 			   ----------------------------------
 * 			   = 선언 되는 클래스 : 사용할 변수를 지정.
 * 			   = 생성자 : 메서드를 지정.
 * 	
 * 			class Super {
 * 				int a = 10;
 * 				int b = 20;
 * 		
 * 				public void display() {
 * 					System.out.println("Super : display() call...")
 * 				}
 * 			}
 * 			class Sub extends Super {
 * 				int a = 100;
 * 				int b = 200;
 * 				
 * 				public void display() {
 * 					System.out.println("Sub : display() call...")
 * 				}
 * 			}
 * 
 * 			Super sup = new Super(); sup => a = 10, b = 20, Super:display() call...
 * 			Sub sub = new Sub(); sub => a = 100, b = 200, Sub:display() call...
 * 
 * 			Super sup2 = new Sub()
 * 			----		 ---------
 * 			클래스		   생성자
 * 		a = 10, b = 20;		Sub:display() call...	=> 오버라이딩
 * 							=> 생성자에 따라서 메서드가 덮어씌워진다.
 * 
 * 			*** 변수는 클래스 이름에 따라 결정되고 메서드는 생성자 이름에 따라 결정된다.
 * 
 */	
class A {
	int a = 10;
	int c = 20;
	public void display() {
		System.out.println("A : display() Call...");
	}
}
class B extends A implements Cloneable {
	int a = 100;
	int c = 200;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public void display() {
		System.out.println("B : display() Call...");
	}
}
// A aa = new B(); ==> 상속을 받기 전 까지는 별개의 클래스 이기 때문에 오류가 발생한다. ==> extends 를 반드시 확인
public class MainClass_5 {

	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.a);
		System.out.println(aa.c);
		aa.display();
		
		System.out.println("=====================");
		// 가장 많이 사용되는 방식
		B bb = new B();
		System.out.println(bb.a);
		System.out.println(bb.c);
		
		bb.display();
		
		try {
			B kk = (B)bb.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("=======================");
		// 두 번째로 많이 사용되는 방식
		A cc = new B();
		System.out.println(cc.a);
		System.out.println(cc.c);
		
		cc.display();
		
		System.out.println("===========================");
		// 라이브러리 => 형변환 ==> 리턴 형이 오브젝트면 형 변환은 거의 필수라고 생각해도 무방하다.
		B dd = (B)cc;
		System.out.println(bb.a);
		System.out.println(bb.c);
		
		dd.display();
		

	}

}
