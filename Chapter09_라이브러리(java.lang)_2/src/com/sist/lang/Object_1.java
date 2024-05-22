package com.sist.lang;
/*
 * 	java.lang / java.util / java.io / java.net / java.sql
 * 	---------	---------	   |		  |		 -------- 웹 관련 핵심 라이브러리
 * 	=> 웹 관련 핵심 라이브러리   |		  |=> 브라우저에서 한글 인식을 하기 위한 => 인코딩 / 디코딩 할 때 많이 사용
 * 							   |			  	=> 한글 깨짐 방지
 * 							   |=>파일 업로드 / 다운로드(자료실)
 * 
 * 	=> 라이브러리 ==> 자바에서 지원하는 클래스의 집합(API)
 * 					 ---------------- 사용법, 사용 용도
 * 
 * 	=> 프로그램은 라이브러리 + 사용자 정의
 * 				 ----------------------- 조립
 * 				 라이브러리는 변수는 존재하지 않고 => 메서드 (어떤 기능)
 * 	
 * 	java.lang : 기본적으로 사용이 많은 클래스를 모아서 정리한 것 => import를 생략할 수 있다.
 * 		= Object : 자바의 모든 클래스(사용자 정의 포함)의 상위 클래스 ==> 최상위 클래스
 * 					=> 모든 클래스는 Object로부터 상속을 받는다.
 * 					=> 생략이 가능하다 => extends Object
 * 					=> 데이터형 중 가장 큰 데이터형 이다.
 * 					   -------------------------------- 모든 데이터를 받아서 저장이 가능하다.
 * 					=> 라이브러리의 메서드의 리턴형은 대부분이 Object ==> 객체 형변환
 * 																	   -----------
 * 					class A (extends Object) {
 * 						int a;
 * 						int b;
 * 						public void display(){}
 *					}
 *						=> Object obj = new A();
 *							obj는 a, b, display() =>  가지고 있지 않다.
 *						=> A a = (A)obj
 *						=> 상위 클래스는 하위 클래스의 변수, 메서드에 접근이 불가능하다.
 *						=> 형변환 ==> 데이터형의 크기를 변경하는 것.
 *						   --------------------------------------
 *							|=> 상속 / 포함
 *							상속 : 상속을 내리는 클래스 > 상속을 받는 클래스
 *								   ------------------	------------------
 *											|					|=> 추가된기능, 상속 받은 기능
 *											|=> 상속 받은 클래스의 추가된 기능에 접근이 불가능하다.
 *
 *							포함 : 포함하고 있는 클래스가 더 크다
 *							----------------------------------
 *							class A{}
 *							class B {
 *								public void display() {
 *									A a = new A(); ==> 포함 클래스가 아니다. (지역 변수)
 *								}
 *							}
 *							class C {
 *								A a = new A(); // 포함 클래스 ==> 멤버인 경우에만 포함 클래스이다.
 *							}
 *					=> 제공하는 기능(메서드)
 *				****	1. toString() => 객체를 문자열화 => 객체의 주소
 *						   ---------- 묵시적, 명시적
 *							class A
 *							A a = new A();
 *							System.out.println(a);	=> 묵시적 (toString()을 생략할 수 있다.)
 *							System.out.println(a.toString()); => 명시적
 *								=> 가장 많이 Overriding => 변수의 값을 출력.
 *														   --------------
 *						2. hashCode() => 객체의 메모리 주소 값을 리턴형
 *						   -------- 데이터 값이 같은 경우 => 같은 사람 ... => 중복을 제거할 때 사용한다.
 *
 *				****	3. clone() => 객체를 봇제 ==> 새로운 메모리를 만들 때 필요한 객체의 내용을 그대로 복사.
 *						   ------ 프로토타입
 *				
 *						4. finalize() => 소멸자 ==> 객체 메모리해제 ===> 자동 호출
 *											=> 호출이 안되면 메모리에 남아있다.
 *											=> System.gc() : 사용하지 않는 메모리 회수를 요청
 *											=> 웹, 애플리케이션에서는 잘 쓰지 않는다. => 멀티미디어(동영상, 화상 채팅, CCTV)
 *																					  ----------------------------------
 *							객체의 생명 주기
 *							---------------
 *							객체 생성	========> 객체 활용	==============> 객체 소멸
 *												 |=> .(변수 / 메서드)		|=> 객체가 null 값이 되면
 *						new 생성자()												-----	 |=> GC 대상 (메모리 회수 대상)
 *																				  |		 |=> 바로 회수되지는 않고 ==> 프로그램 종료 시에 회수된다.
 *																			*** new를 많이 사용하면 => 데이터 누적 ==> 부하가 걸림.
 *															
 *				****	5. equals() : 객체를 비교할 때 
 *										=> 메모리 주소 값 (디폴트)
 *										=> 멤버 변수 값을 비교 (오버라이딩)
 * 		= String		:				
 * 		= System		:
 * 		= Math			:
 * 		= Wrapper		:
 * 		= StringBuffer	:
 * 
 * 
 * 
 */
import java.util.*;

class Sawon {
	private int sabun;
	private String name;
	
	public Sawon(int sabun, String name) {
		this.sabun = sabun;
		this.name = name;
	}

	@Override	// 반드시 상속이 되어야 함 => 재정의(정의를 변경) => 덮어쓰기의 개념
	public String toString() {
		return "사번 : " + sabun + ", 이름 : " + name;	// 메모리 주소 값을 변경 => 변수의 초기화 출력 
	}
	// => default 생성자는 없다 => 자동 추가가 안된다.
}

class Student {
	private int hakbun;
	private String name;
	
	// 생성자를 선언했기 때문에 default 생성자는 사용할 수 없다.
	public Student (int hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hakbun, name);
	}
}
/*
 * 	인터페이스도 클래스이다. (다중 상속)
 * 		=> 미완성 된 클래스이기 때문에 프로그래머가 완성해서 사용해야 함
 * 												 ------------ 상속
 * 		인터페이스 ======> 인터페이스
 * 					확장 => extends
 * 		인터페이스 ======> 클래스
 * 					미완성된 메서드를 구현 => implements
 * 		  클래스	  ======> 클래스
 * 					확장 => extends
 * 		  클래스	  ======> 인터페이스(x) ==> 존재하지 않음
 * 					
 * 		=> 형식	==> 모든 구성 요소 : 변수 / 메서드 => only public
 * 			interface interface명 {	
 * 				상수 (변수는 존재하지 않는다)
 * 					=> (public static final) int A = 100; ==> 반드시 선언과 동시에 초기값을 설정해주어야 한다. ===> 상수이기 때문에 값 변경이 불가능하다
 * 				구현이 되지 않은 메서드
 * 					=> (public abstract) void display();
 * 				구현이 된 메서드
 * 					=> (public) default 리턴형 메서드형(매개변수...) {}
 * 			}
 * 			
 */
class Box implements Cloneable {
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	// throws 문장 뒤에 붙는 예외 클래스는 => RuntimeException 관련은 없다 ==> 예외 처리를 하고 사용한다.
	// CloneNotSupportedException => CheckedExcetpion
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Member {
	// C언어 => Member() ~ Member()
	private int mno;
	private String name;
	
	// 생성시에 호출 => 생성자
	public Member(int mno, String name) {
		this.mno = mno;
		this.name = name;
		System.out.println("객체 메모리 할당...");
	}
	
	public void print() {
		System.out.println("회원 번호 : " + mno);
		System.out.println("회원 이름 : " + name);
		
	}
	// 소멸시에 호출 => 소멸자
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 메모리 회수...");
	}
	// 멤버 변수에 대한 값을 설정할 때 => 여러번 변경 / 한 번만 변경
	//										 |			  |=> 생성자
	//										 |=> 생성자를 이용할 수 없다. ==> setter를 이용한다.
	/*
	 * 	Member m = new Member(1, "aaa");
	 * 	m = new Member(2, "bbb");
	 * 	m = new Member(3, "ccc");
	 * 	------------------------------- 객체가 3번이 생성. => 메모리를 많이 잡아먹고 => 부하가 생김
	 * 									
	 */
}
class Food {
	private int fno;
	private String name;
	
	public Food(int fno, String name) {
		this.fno = fno;
		this.name = name;
		// 지역 변수 우선 순위
		// 변수 => 지역 변수, 매개 변수 => 멤버 변수
		// 변수 명이 같은 경우에는 반드시 구분 => this : 클래스 자신의 객체 , supper =  상속 내린 클래스의 객체
		/*
		 * 메모리
		 * ---------------------------------
		 * 			super
		 * 	  상속 내린 클래스의 변수 / 메소드
		 * 		=> clone()
		 * 		=> finalize()
		 * 		=> equals()
		 * 		=> toString()
		 * 		=> hashCode()
		 * 			this
		 * 	 	추가 된 내용
		 */
	}

	@Override
	public boolean equals(Object obj) {
		
		Food f = (Food)obj;
		return name.equals(f.name) && fno == f.fno;	// 실제 멤버 변수 값을 가지고 변경.
	}
}
public class Object_1 {
	
	public static void main(String[] args) {
		 Sawon s1 = new Sawon(1, "홍길동");
		 System.out.println(s1);
		 Sawon s2 = new Sawon(2, "박문수");
		 System.out.println(s2);
		 
		 Student s3 = new Student(1, "홍길동동");
		 System.out.println(s3);
		 Student s4 = new Student(1, "홍길동동");
		 System.out.println(s4);
		 /*
		  * new 사용하면 (새로운 메모리를 만들어서 사용)
		  * 데이터의 중복이 있을 때 중복을 제거하기 위해 주로 사용한다
		  * 	=> 데이터 중복 여부 ==> hashCode() ===> 웹에서 데이터 수지밯 때.
		  */
		 System.out.println("s3 : " + s3.hashCode());
		 System.out.println("s4 : " + s4.hashCode());
		 
		 if (s3.hashCode() == s4.hashCode()) {
			 System.out.println("같은 학생 입니다.");
		 } else {
			 System.out.println("다른 학생 입니다.");
		 }
		 Box box1 = new Box();
		 box1.setHeight(300);
		 box1.setWidth(350);
		 
		 // box1에 대한 얕은 복사 ==> 같은 메모리를 제어하며 ===> box4의 값이 바뀌면 box1 값도 바뀜
		 Box box4 = box1;
		 System.out.println("box1 => " + box1);
		 System.out.println("box4 => " + box4);
		 
		 Box box3 = new Box();
		 System.out.println("box3.width : " + box3.getWidth());
		 System.out.println("box3.heigth : " + box3.getHeight());
		 
		 // clone은 형변환 / 예외 처리가 필요하다
		 try {
			Box box2 = (Box) box1.clone(); 
			System.out.println("box2.width : " + box2.getWidth());
			System.out.println("box2.heigth : " + box2.getHeight());
			System.out.println("box2 => " + box2);	// 메모리 주소가 다른 경우에는 새로운 메모리가 생성된다.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Member m = new Member(1, "심청이");
		m.print();
		m = null;	// finalize 가 호출되어야하는데 되지 않름.
		
		//객체 메모리회수 명령
		System.gc(); // 필요한 경우에만 사용		
		
		Food f1 = new Food(1, "중국집");
		Food f2 = new Food(1, "중국집");
		// 재정의 => Override 하기 전까지 => 주소값
		
		if (f1 .equals(f2) ) {
			System.out.println("같은 업체 입니다.");
		} else {
			System.out.println("다른 업체 입니다.");
		}
	}
	

}
/*
 * class A {
 * 	int a; 
 * 	int b;
 * 	public void num () {}
 * }
 * 
 * class B extends A {
 * 	int c;
 * 	
 * 	public void nu2(){}
 * }
 * 
 * int a = 10;
 * double d = 10.5; 
 * 
 * int a = (int) 10.5
 * A a = new A();
 * a = (A) new B();
 */