package com.sist.main;
/*
 * 	자바 ==> 오라클 ==> HTML/CSS ==> JavaScript ==> JSP ==> Spring ==> Python ==> AWS
 * 	--------------------------------------------------------------------------------
 * 										|				|				|=> DJango / 머신 러닝 / 딥 러닝
 * 									  Ajax			MyBatis / JPA	 Spring-Boot
 * 									  Vue.js
 * 									  React			String-Security
 * 									  ----------------------------------------------
 * 														|
 * 													MSA / CI, CD
 * 	상속
 * 	--- 재사용, 단일 상속
 * 	예외 조건 : 생성자, 초기화 블럭, static
 * 								   ------ 공통으로 사용
 * 	메모리 저장
 * 				------------------
 * 				  ---- 변수 ----
 *  	          --- 메서드 ---
 * 				------------------
 * 
 * 				------------------
 * 				 ---- super ----
 * 					변수 / 메서드
 * 				------------------
 * 
 * 				  ---- this ----
 * 					변수 / 메서드
 * 				------------------
 * 
 * 		class A {
 * 			int a, b, c, d, e, f;
 * 		}
 * 		class B extends A {
 * 			(int a, b, c, e, d, f)
 * 			int k;
 * 			=> 기능을 변경 => 메서드 (오버라이딩)
 * 		}
 * 		=> 실행 속도가 느려진다.
 * 		=> 상속에서 소스를 볼 수 없기 때문에 가독성이 떨어진다.
 * 		=> 제약 조건이 많다
 * 		=> 결합성이 높아진다
 * 		--------------------------------------------------- 상속을 사용하지 않는다. (Spring)
 * 
 *		상속을 내리는 클래스 : super 클래스, base 클래스, 부모 클래스 , 상위 클래스 
 *		상속을 받는 클래스   :  sub 클래스, 파생 클래스, 자식 클래스, 하위 클래스 
 *
 *		class 게시판 {
 *			글쓰기()
 *			상세보기()
 *			검색()
 *			수정()
 *			추가()
 *			삭제()
 *		}
 *		class 댓글 게시판 extends 게시판 {
 *			댓글()
 *		}
 *		class 묻고답하기 extends 게시판 {
 *			묻기() => 글쓰기를 묻기로 변경하여 사용. => 오버라이딩 
 *			답하기()
 *		}
 *		class 갤러리 게시판 extends 게시판 {
 *			파일업로드() => 이미지
 *		}
 *
 */
import javax.swing.*;

class Super {
	int a;
	int b;
}
class Sub extends Super {
	int c;
}
public class MainClass_4 { /*extends JFrame*/
//	JFrame f = new JFrame();	//	has - a => 포함 클래스, // 여러 개 사용이 가능하다.
	public MainClass_4() {
/*		f.setSize(500, 500);
		f.setVisible(true);
*/
	}

	public static void main(String[] args) {
		
/*		Super su = new Super();
		System.out.println(su.a);
		System.out.println(su.b);
		Sub sub = new Sub;
		System.err.println(sub.a);
*/		
		Super su = new Sub();	// 가장 많이 사용이 된다
		// 상위		하위
		// su => a, b
		// double	int
		System.out.println(su.a);
		System.out.println(su.b);
		
		Sub sub = (Sub) new Super();
		System.out.println(sub.c);
		// int double
		// sub => a, b, c
		// 클래스에 따라 => 접근 변수가 달라진다
		// => 인터페이스 => 상위 클래스로 차리 => 형 변환이 빈번하게 일어난다.
	}

}
