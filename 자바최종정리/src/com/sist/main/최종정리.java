package com.sist.main;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.*;
import javax.sound.midi.SysexMessage;


/*
 * 	프로그램
 * 	------
 * 		1.	데이터 저정하는 곳 => 메모리 / 파일 / 데이터베이스(오라클)
 * 							  |		---------------------- Java에서는 제어가 불가능하다.
 * 							  |=> Java에서는 파일 / 데이터베이스에서 읽은 데이터를 메모리에 저장 후에 관리 ==> 변수
 * 			자바에서 사용하는 용어
 * 			----------------
 * 			1) 변수 / 상수 => 한 개의 데이터를 저장하는 공간
 * 			   ---	 --- 변경이 불가능 : final => final int a;
 * 				|=> 변경 가능 (덮어쓰기 형식)
 * 				=> 저장 공간의 크기 (데이터형)
 * 					----------------------------------------------------------------------------
 * 					정수
 * 						byte (1byte) => -128 ~ 127 ==> OverFlow
 * 							=> 웹(파일 업로드 / 파일 다운로드), application (네트워크 전송)
 * 										  |					  |
 * 										  |				채팅 / 쪽지 보내기 => Socket
 * 									  WebSocket
 * 	
 * 						int	(4byte)	=> 프로그램에서 사용하는 모든 정수는 int를 인식한다
 * 										-21억 4천 ~ 21억 4천
 * 						long (8byte)=> 금융권 / 공기업 / 빅데이터 / AI
 * 
 * 						=>	오라클에서 보내준 데이터를 받은 경우
 * 						  	----
 * 							[NUMBER, NUMBER(4) => int]
 * 					----------------------------------------------------------------------------
 * 					실수
 * 						double (8byte) => 일반적인 실수 저장할 때 사용하는 공간
 * 						[NUMBER(7, 2) => double]
 * 					----------------------------------------------------------------------------
 * 					논리형
 * 						boolean (1byte) : true / false
 * 						[오라클에는 존재하지 않는다. (CHAR, NUMBER 사용하여 처리)]
 * 					----------------------------------------------------------------------------
 * 					문자 / 문자열
 * 						String : 웹, 윈도우에서 => 가장 많이 사용하는 데이터 형
 * 						[VARCHAR2]
 * 							1) 오라클 컬럼과 매칭
 * 								EMPNO    NOT NULL NUMBER(4)    	===> int empno		(사번)
 *								ENAME             VARCHAR2(10) 	===> String ename	(이름)
 *								JOB               VARCHAR2(9)  	===> String job		(직위)
 *								MGR               NUMBER(4)    	===> int mgr		(사수 번호)
 *								HIREDATE          DATE         	===> Date hireDate	(입사일)
 *								SAL               NUMBER(7,2)  	===> double sal		(급여)
 *								COMM              NUMBER(7,2)  	===> double comn	(성과급)
 *								DEPTNO            NUMBER(2)    	===> int deptno		(부서 번호)
 *							=========================================================================
 *								숫자형 (NUMBER => int, double)
 *								
 *								문자형 (CHAR / VARCHAR2 / CLOB => String)
 *							  	1 ~ 2000자 / 1 ~ 4000자 / 4기가
 *								*** 한글 한 글자당 3byte
 *
 *								날짜형 (DATE => java.util.Date)
 *							  
 * 							2)	웹에 출력된 데이터 : 데이터 추출 (데이터형)
 * 							*** 변수 / 클래스 / 배열 => 남발하면 프로그램을 짜기 어렵다
 * 								=> 한 개의 이름으로 제어 ==> 모음
 * 
 * 			2) 데이터가 많은 경우에 데이터를 모아서 관리한다.
 * 				=>	묶어서 사용 : 반복문 사용 ==> 소스가 간결해진다.
 * 					int a ~ z  26개 변수 설정 => 가장 큰 값, 작은 값 출력;
 * 						=> if문이 50개가 넘어간다.
 * 
 * 				=>	같은 데이터 형을 묶어서 한 개의 이름으로 제어
 * 					----------		  --------- 배열 (구분자 => Index) ==> 개수 지정
 * 				=>	다른 데이터 형이 여러개 한 개의 이름으로 제어
 * 					----------		  --------- 클래스 (구분자 => 메모리 주소 값 ==> 객체) ===> new 생성자() ====> 따로 저장이 된다.
 * 					=> 한 개의 이름으로 모아서 관리 : 인터페이스, 컬렉션을 통해 관리한다.
 * 				*** 정수 10개 	=> 배열
 * 				*** 클래스 10개	=> 컬렉션 ==> 배열의 단점을 보완한 것.
 * 
 * 			==> 변수의 종류	
 * 				---- 메서드에서만 사용이 가능하다. ----
 * 				1. 지역 변수 	: 메서드 안에 선언되는 변수 => 루프 변수, 결과 값 전송하는 변수
 * 				2. 매개 변수 	: 사용자가 보내준 요청 (사용자 요청 값)
 * 					=> 3개 이상을 초과하지 않는다. ==> 초과하면 배열 / 클래스 이용
 * 
 * 				---- 프로그램 종료시까지 사용이 가능하다. (다른 클래스에서 사용이 가능하다) ----
 * 				3. 인스턴스	: 메모리 공간이 따로 생기는 공간 => new 사용 시 마다 생성
 * 				4. 공유 변수	: 모든 객체가 공통으로 사용 가능 => 한 개의 메모리 생성
 * 				  (정적 변수)
 * 				------------
 * 				
 * 				-------------- Method Area ---------------
 * 					Method가 저장 (Method는 메서드 명이 주소이다)		
 * 				---------------- Stack -------------------
 * 					메모리 자체 관리 => {} 끝나면 자동으로 회수한다.
 * 						지역 변수 / 매개 변수				
 * 				----------------- Heap -------------------
 * 					인스턴스 변수 => new
 * 					클래스 / 배열
 * 					프로그래머가 관리 => 메모리 해제 (객체가 null인 경우, 사용하지 않는 경우) ==> GC
 * 						new		 => delete
 * 						malloc() => free()
 * 						=> 자동 메모리 회수기를 이용한다. (가비지 컬렉션 / GC)
 * 
 * 				------------------------------------------
 * 			=>	사용자 요청에 따라서 제어한다.
 * 				-----------------------
 * 					1) 연산자
 * 						단항연산자
 * 							= 증감연산자		==> 게임에 주로 사용(총알이나 캐릭터 좌표가 변경되는 것을 구현)
 * 
 * 							= 부정연산자 [<>]	==> String findData = "";
 * 												if (data.contains(findData))	=> [LIKE, REGEXT_LIKE()]
 * 												if (!data.contains(fianData))
 * 											==> 대부분 오라클 명령어를 이용하여 데이터 추출 ==> 데이터를 영구적으로 저장하고, 데이터를 공유할 수 있기 때문에.
 * 
 * 							= 형변환연산자		==> 클래스 크기 : 상속 주는 클래스 > 받는 클래스	
 * 														   포함하는 클래스  > 포함된 클래스	
 * 												=> 크기가 클 수록 추상화, 작을 수록 구체적이다.
 * 												=> 확장을 하여 기능을 변경하고, 추가하여 사용한다.
 * 												=> 모든 클래스는 Object로부터 상속을 받고, return이 Object면 항상 형 변환을 해주어야 한다.
 * 																										------- 제네릭<클래스>
 * 										  (중요) => 클래스도 데이터 형 이다. ==> 라이브러리 / 사용자 정의 데이터 형
 * 
 * 						이항연산자 =>	형변환(자동)
 * 								*** 프로그램언어는 연산 시에 같은 데이터 형만 연산이 가능하다.
 * 									[Oracle, JavaScript에서는 5 / 2 => 2.5 (자동으로 실수 결과 값이 나옴)]
 * 								
 * 								=> 비교 연산자		
 * 									Java	   : ==    / !=
 * 									Oracle	   : =    /  <>
 * 									JavaScript : === /  !==
 * 						삼항연산자
 * 
 * 					2) 제어문
 * 						=> 묶기 시작 ==> 한 개의 이름으로 제어 ===> 소스가 간결해지고, 유지 보수가 편해진다.
 * 							1) 관련되는 명령문을 묶어서 사용 => 재사용 / 반복 제거 / 에러, 기능 추가 편리하고 쉬움
 * 							   ---------------------- 메서드
 * 					
 * 								자바	: Kotlin, 스칼라, Dart, go, C#
 * 									  -------------
 * 								C언어: C++,  , Oracle
 * 		          
 *						조건문(if)	=> true일 때 수행하는 문장
 *                          		=> 독립적으로 되어있다 => 여러개 사용시에는 속도가 늦다
 *                                  => 웹 : 사용자가 요청값을 전송했는지 여부
 *                                     		------------------------
 *                                     		사용자가 입력을 했는지 여부 ...
 *                					=> 오라클에 NOT NULL => 무조건 모든 값이 있어야 한다
 *                                            ---------
 *                                            *(필수입력) , "아이디를 입력하세요." 창들 == NOTNULL
 *                                  => 유효성 검사 : 입력여부 확인 / 제한된 값   
 *                                                                    
 *							=> 선택 조건문 if ~ else
 *									=> 웹에서 많이  등장
 *                       	   		=> 웹 무조건 브라우저로 결과값 전송
 *                                 
 *							=> 다중 조건문 : 해당되는 1개의 조건만 수행
 *                      			=> 조건에 맞는 모든 수행	=> 단일 조건문 여러개
 *                       	   		=> 조건에 맞는 문장 한개 	=> 다중 조건문을 사용한다
 *                       	   		=> 오라클에서 어려운 부분	=> 다중 조건이 있는 경우
 *                            
 *                            
 *						반복문(for,while) : 화면출력 ==> HTML(JSP)
 *
 *       					for, for-each : 조건식이 false 면 종료 => 반복 횟수가 지정된 경우
 *       									=> 패턴이 있는 경우에만 가능하다.
 *       
 *                         	while : 조건식이 ture인 동안 반복 =>반복 횟수가 없는 경우
 *                         			=> 게시판 / 회원
 *                         		 		  ----------- 데이터가 없을 때 까지 반복 => rs.next()
 *							무한 루프 for (;;) / while (true) ==> 반드시 종료 조건을 설정해야 한다.
 *
 *						배열 : 개수가 틀리면 처리가 어렵다.
 *								=> 검색, 데이터베이스 프로그램은 가변형이라 배열 사용이 어렵다.
 *								=> 컬렉션 (ArrayList)
 *
 *				*** 명령문을 모아서 처리 => 메서드
 *
 *					리턴형 	: 요청에 대한 처리 값
 *						1) 기본형 데이터 타입 => 총 페이지 / 로그인 여부
 *						2) 데이터가 여러 개 => ArrayList
 *						   ------------ 목록 / 검색
 *						3) 관련된 데이터 : 사용자 정의 데이터 형 => SELECT에서 조건이 있는 경우
 *						   ---------- 상세 보기
 *	
 *					매개 변수 : 사용자 요청 값 => 입 / 출력
 *					
 *
 *
 *					옵션 지정어 : static => 공통 사용 기반 ==> 데이터베이스 (MyBatis)
 *						=> 리턴 형이 있다 : SELECT
 *						=> 리턴 형이 없다 : INSERT / UPDATE / DELETE
 *					-------------------------------------------------------------------
 *					사용자 요청 : 검색 결과를 브라우저에 출력 요청
 *						=> 리턴형 + 매개변수
 *						   ----   ------ => String ==> 검색어
 *							|=> ArrayList
 *	
 *			Board에 등록
 *				=> 리턴형 / 매개 변수
 *				   ----   ------- 이름, 제목, 내용, 비밀번호	
 *				   void		 	 ---------------------- 클래스로 묶어서 전송
 *			----------------------------------------------------------------------------------------
 *				3) 클래스
 *					=> 구성 요소 ==> 역할
 *					=> 클래스의 종류 ==> 추상 클래스, 인터페이스
 *					=> 객체 지향의 3대 특성 ==> 캡슐화, 다형성, 상속 
 *										   -----
 *											 |=> 시큐어 코딩의 기본.	==> lombok => Spring 에서는 자동 첨부. 
 *											 |=> 데이터 은닉화 후 메서드를 통해 접근.
 *											
 *
 *          => 	메서드 + 변수 묶어서 사용
 * 				------------------- 클래스 
 *			=> 	만들지 못하는 기능 : 자바에서 클래스를 지원해준다 => 라이브러리
 *			=> 	다른 프로그램과 연동  
 *				---------------
 *					1. 오라클 연동	
 *						=> 오라클 명령어 사용법	==> JDBC
 *					2. 브라우저 연동 => HTML / CSS ==> JSP
 *					  ----------- 웹 사이트가 제작
 *						
 *							요청					요청된 데이터 보내달라
 *			브라우저	--------------------- 자바 -------------------- 오라클
 *						  화면 출력				응답 데이터를 
 *			------------------------------------------------------------------- 통합 (스프링)
 *
 * 
 * 
 * 	==> 자바의 최종 과정 ===> 네트워크		: 게임
 * 						  데이터베이스	: 웹		*** 우리 과정의 주요 내용
 * 		
 * 
 * 							
 */
class Human {
	public void disPlay() {
		System.out.println("Human Display call...");
	}
}
class Sawon {
	public void aaa() {
		System.out.println("Sawon : aaa Call...");
	}
	public void bbb() {
		System.out.println("Sawon : bbb Call...");

	}
	public void ccc() {
		System.out.println("Sawon : ccc Call...");

	}
}
public class 최종정리 {
	public static void main(String[] args) throws Exception {
		Human h1 = new Human();
		h1.disPlay();
		Human h2 = new Human().getClass().getDeclaredConstructor().newInstance();
		h2.disPlay();
		Human h3 = Human.class.getDeclaredConstructor().newInstance();
		h3.disPlay();
		Class clsName = Class.forName("com.sist.main.Human");
		Method[] methods = clsName.getDeclaredMethods();
		Human h4 = (Human)clsName.getDeclaredConstructor().newInstance();
		methods[0].invoke(h4, null);
		System.out.println("메서드명 사용");
		h4.disPlay();
		//		int[] arr = new int[10];
//		
//		for (int i = 0; i < arr.length; i++ ) {
//			arr[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//		  
//		for (int i = arr.length -1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//			
//		}
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		Class cls = Class.forName("com.sist.main.Sawon");
		Object obj = cls.getDeclaredConstructor().newInstance();
		Method[] ms = cls.getDeclaredMethods();
		Scanner scan = new Scanner(System.in);
		System.out.println("호출할 메서드 명 입력");
		String mName = scan.next();
		// Annotation => 구분자 ==> 스프링
		
		for (int i = 0; i < ms.length; i++) {
			String s = ms[i].getName();
			if (mName.equals(s)) {
//				System.out.println(i + ":" + ms[i].getName());
				ms[i].invoke(obj, null);
			}
		}
	}
}