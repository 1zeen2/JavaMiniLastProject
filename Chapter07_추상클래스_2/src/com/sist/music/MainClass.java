package com.sist.music;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// 추상 클래스, 인터페이스 => 관련된 클래스를 묶어서 1개의 객체로 제어하는 목적.
		// 데이터 => 한 개의 이름으로 여러 개의 변수를 제어 ==> 배열.
		/*
		 * 	추상 클래스
		 * 		= 공통으로 사용되는 기능 => 구현이 동일한 경우
		 * 			list(), fine(), detail() =========> 추상 클래스에서 구현
		 * 		= 공통으로 사용 => 구현 내용이 다른 경우
		 * 			init() => 선언 ==> 각 클래스에서 구현
		 * 
		 * 	메서드
		 * 		=> 구현이 된 메서드			: 상속 받은 클래스의 구현 내용이 동일
		 * 			=> [접근 지정어] 리턴 형 메서드 명(매개 변수...) {
		 * 					구현
		 * 				}
		 * 
		 * 		=> 구현이 되지 않은 메서드	: 상속받은 클래스가 동일하지 않는 경우에 선언 => abstract
		 * 			=> [접근 지정어] abstract 리턴 형 메서드 명(매개 변수...);
		 * 							-------- 선언만 한다. (구현 X)
		 * 
		 * 		*** 메서드가 선언만 되어 있는 경우에는 new 를 이용해서 메모리에 저장할 수 없다.
		 * 			=> new 를 이용해서 메모리 할당이 되지 않는다.
		 * 				상속 받은 클래스를 이용해서 메모리에 저장 후에 사용해야 한다.
		 * 				-------------- 선언된 메서드를 반드시 구현해서 사용한다.
		 * 
		 * 		*** 메서드가 구현이 안된 경우 : 추상 클래스, 인터페이스
		 * 			----------------------- 미완성된 클래스 (메모리를 만들 수 없음)
		 * 			상속을 받아 구현한 후 메모리를 받아 사용.
		 * 
		 * 	abstract class A {
		 * 		public void aaa(){} => 메서드는 중괄호만 열고 닫아도 구현으로 인정한다.
		 * 		public void bbb(){}
		 * 		public void ccc(){}
		 * 		=> 구현이 안 된 메서드가 반드시 포함되어야 하는 것은 아니다.
		 * 		=> *** 구성 요소는 선택 사항 *** ==> 구현이 전부 된 경우에는 굳이 abstract 를 사용할 필요가 없다. (일반 클래스는 바로 메모리 할당이 가능하기 때문에 훨씬 편함)
		 * 																									 (하나라도 구현되지 않은 메서드가 있다면 abstract 사용.)
		 * 	}
		 * 	class A {
		 * 		----------------------------
		 * 		변수 :  인스턴스 변수
		 * 				정적 변수
		 * 		----------------------------
		 * 		생성자
		 * 		----------------------------
		 * 		메서드
		 * 		----------------------------
		 * 		=> 선택 사항. ==> 변수 (인스턴스, 정적) / 생성자 / 메서드 모든 구성이 전부 들어가야만 하는 것이 아닌, 필요한 대로 구현하여 사용한다.
		 * 	}
		 * 		일반 메서드의 장점
		 * 			=> 자체 메모리 할당 가능
		 * 			=> 
		 * 		
		 * 
		 * 	추상 클래스에서 모든 메서드가 구현이 된 경우에도 => 메모리 할당을 할 수 없다.
		 * 	abstract <== 선언 시에는 메모리 할당을 할 수 없다.
		 */
		Scanner scan = new Scanner(System.in);
//		MusicSystem ms = new GenieMusic();
//		ms.init();
		MusicSystem ms = null;
		System.out.print("지니뮤직(1), 멜론(2)");
		int n = scan.nextInt();
		if (n == 1) {
			ms = new GenieMusic();
		} else {
			ms = new MelonMusic();
		}
		ms.init();
		
		while (true) {
			System.out.println("================ 메뉴 ===============");
			System.out.println("1. 목록 출력");
			System.out.println("2. 상세 보기");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println("=====================================");
			System.out.print("메뉴를 선택하시오 : ");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1: 
				ms.list();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
			case 2:
				System.out.print("번호 선택(1 ~ 50) : ");
				int no = scan.nextInt();
				ms.detial(no);
				break;
			case 3:
				System.out.println("검색어 입력 :");
				String title = scan.next();
				ms.find(title);
				break;
				
				
			}
			
		}
		// Music 과 관련 클래스를 한 개로 묶어서 처리 => 추상 클래스, 인터페이스를 이용한다
		/*
		 * 	무조건 => 한 개로 통합
		 * 		데이터 여러 개 => 변수 한 개의 이름 => 배열
		 * 		클래스 여러 개 => 추상 클래스 => 한 개의 객체 생성
		 * 		데이터 여러 개 => 파일(에 저장 후 불러들임) / 오라클
		 */
	}

}
