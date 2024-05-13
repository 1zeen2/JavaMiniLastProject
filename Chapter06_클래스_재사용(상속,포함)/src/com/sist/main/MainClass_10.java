package com.sist.main;
/*
 * 					상속에서 접근 지정어
 * 	추상 클래스 / 인터페이스
 * 					  |=> Spring 기반
 * 
 * 	Overloading	/ Overriding 
 * 					  |=> 라이브러리
 * 	
 * 	Overloading : 중복 메서드 정의
 * 		예) print(int), print(char), print(char[]) ...
 * 		=> 	버스
 * 			버스 => 일반 버스
 * 			버스(좌석)
 * 			버스(마을)
 * 			버스(고속 엔진)
 * 
 * 	Overriding : 기존의 클래스를 상속받아 => 재정의 (메서드 기능을 변경)
 * 				 ------------------		   ------
 * 
 * 
 * 				Overloading						Overriding
 * 	-----------------------------------------------------------------
 * 	상태			같은 클래스 내에서
 * 				class A {
 * 					public void aaa(){};
 * 					public void aaa(int a){}
 * 					public void aaa(int k){} ======> 이거는 오버로딩이 아니다. ===> 정수형 메서드로 인식을 하기 때문에 위의 public void aaa(int a){}와 같게 저장이 된다.
 * 					public void aaa(char c){}
 * 					public void aaa(double d){}
 * 				}
 * 	-----------------------------------------------------------------
 * 	메서드 명	동일해야 한다					동일해야 한다
 * 	-----------------------------------------------------------------
 * 	매개 변수	개수, 데이터 형이 다르다.			동일해야 한다
 * 	-----------------------------------------------------------------
 * 	리턴 형		관계 없다						동일해야 한다
 * 	-----------------------------------------------------------------
 * 	접근 지정어	관계 없다.						확대만 가능하다
 * 	-----------------------------------------------------------------
 * 		접근 지정어의 크기 : private < default < protected < public
 * 															------ 메서드는 public 접근 지정어가 기본이다.
 * 	-----------------------------------------------------------------
 * 	Overriding	=> 상속
 * 					예외 조건)
 * 						static	===> 상속이 되지 않음 ==> 공통으로 사용할 수 있기 때문에
 * 						private
 * 						생성자
 * 						초기화 블럭
 * 						-----------------------
 * 						멤버 변수 (인스턴스 변수)		===> 변수 값 변경 (변수 오버라이딩)
 * 						메서드						===> 기능 변경 (메서드 오버라이딩)
 * 						----------------------- 상속
 * 							
 * 				메서드의 종류
 * 					1. 인스턴스 메서드
 * 					2. 공통 메서드 (static) => 상속의 예외 조건 => 변경 (전체 변경) => Overriding 불가능.
 * 					3. 종단 메서드 : 확장이 불가능 => 변경이 불가능 ==> final
 * 					---------------------------------------------------------------------------------
 * 					권장 사항) 메서드의 접근 지정어는 가능하다면 public 사용을 권장한다.
 * 			
 * 					접근 지정어
 * 					----------
 * 						public	: 생성자, 클래스, 메서드, 인터페이스
 * 								=> 다른 클래스와 연결
 * 						private : 멤버 변수 => 데이터 노출 방지 (데이터 보호)
 * 								=> 다른 클래스에서 사용
 * 									=> 변수 기능의 메서드 제작
 * 										--------------------
 * 										=> 메모리 저장 / 메모리에 읽어오기
 * 										   ---------    ---------------
 * 										set 변수명();   	get 변수명();
 * 				
 * 					=>	class A {
 * 							private String name;
 * 							private boolean login;
 * 		
 * 							public void getName():
 * 							public void isLogin();	==> is ...이면 boolean 형식
 * 						}
 *					
 *	class 영역
 *	---------------------
 *	static 메서드 : 기본은 static 메서드, static 변수만 사용이 가능
 *		=> 인스턴스 메서드, 인스턴스 변수는 사용할 수 없다.
 *	
 *	인스턴스 메서드 : 인스턴스 메서드, 인스턴스 변수, static 변수, static 메서드 사용이 가능
 *	------------------------------ this 가 있다.
 */
class ABC {
	public void display1() {};		// 멤버 메서드	===> 가장 자주 나오는 메서드 형식이다.
	public void display2() {};		// 공통 메서드
	public final void display3() {}; // 종단 메서드	==> final Method 는 더이상 변경할 수 없는 메서드이다.
}
class BCD extends ABC {
	public void display1() {};		// 멤버 메서드
//	public void display2() {};		// 공통 메서드
//	public final void display3() {}; // 종단 메서드
}
class DGB {
	// this. ==> DGB가 가지고 있는 변수
	// 생성자, 멤버 메서드에만 존재한다 ==> static 메서드는 this가 없다. ==> 멤버 변수를 사용할 수가 없다.
	private String name;
	private boolean login;
	private int age;
	
	public void display() {
		this.name = "홍길동";
		this.age = 100;
	}
	public static void aaa() {
		// 클래스의 멤버 변수가 아니다 => 공통 사용 부분을 구사.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// 매개 변수와 멤버 변수가 이름이 같으면 this + 변수명으로 멤버 변수를 사용할지, 그냥 변수명으로 블럭 변수로 사용할지 선택해야 한다.
		// 매개 변수와 멤버 변수의 이름이 다르다면 지장 없음.
	}
	public boolean isLogin() {	//	boolean 형식만 is... 가 나온다.
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	
}
public class MainClass_10 {

	public static void main(String[] args) {
	
		DGB dd = new DGB();
		dd.display();
		
		System.out.println(dd.getName());
//		System.out.println(dd.get());
		System.out.println(dd.isLogin());
		

	}
}
