package com.sist.util;

import java.util.*;

/*
 * 	java.util
 * 	---------
 * 		=> 가장 많이 사용되는 라이브러리
 * 
 * 		=> 난수 : Random => 정수, 지정된 범위
 * 			=> 1. 객체 생성
 * 				Random r = new Random()
 * 
 * 			=> 2. 난수 발생
 * 				r.nextInt(100) => 100은 지외 => 0 ~ 99
 * 
 * 			=> 웹 : 예약일 / 예약 시간 => 난수
 * 				=> 실전 (배포) => 가상으로 연습
 * 
 * 		=> 날짜 : Date / Calendar
 * 				 ----- 	--------- 기능 부여 (요일, 마지막 날짜..) => 달력 제작
 * 				   |=> 기능이 없다 ==> 오리클 / MySQL에서 전송하는 날짜를 받는 경우(데이터베이스 호환)
 * 	
 * 		=> 변환 : 날짜 변환 / 숫자 변환	==> java.text에 있음 (util이 아님.)
 * 				  --------	 --------- DecimalFormat => format()
 * 					 |					=> 패턴이 있음 (new DecimalFormat("###, ###, ###") => 오라클은 (9,999,999)
 * 					 |=> SimpledateFormat
 * 							=> new SimpleFormat ("yyyy-MM-dd") yyyy/MM/dd
 * 								=> 년도	: yy/yyyy
 * 								=>  월	: MM/M
 * 								=>	일	: dd/d
 * 								=>	시	: hh/h
 * 								=>	분	: mm/m
 * 								=>	초	: ss/s
 * 				
 * 		=> 데이터 관리 : 컬렉션 => 자료구조
 * 			=> 데이터를 쉽고 효율적으로 관리할 수 있게 표준화된 라이브러리 : 컬렉션 프레임워크
 * 			=> 모든 데이터를 저장해서 관리할 수 있게 만들어져있다.
 * 			   ----------------- 1. 기본형	Object형이기 때문에 형변환을 헤주어야 한다.
 * 								 2. 클래스 	------ 어떤 데이터가 첨부되어있는지 알 수가 없어 가독성도 떨어진다.
 * 											=> 단점 보완 : 형 변환 없이 사용, 가독성이 좋게 만든다
 * 											=> 제네릭 ==> 데이터형을 통일화시킨다.	
 * 												=> <클래스형> ==> 기본형은 사용할 수 없다. 
 * 													=> <int><double> (x)
 * 													   ------------- Wrapper 제공. (기본형을 클래스화 하는 것)
 * 														Integer, Double, Boolean
 * 														=> 제네릭을 사용할 수 있고, 기본형에 기능을 부여하며
 * 														   parseInt(), parseDouble(), parseBoolean()을 이용해 문자열을 기본형으로 변경할 수 있다.
 * 
 * 											=> 데이터 통일 : 제네릭을 사용하지 않으면 모든 메서드의 리턴형과 매개 변수가 Object이다.
 * 												=> Object를 프로그램에서 필요한 데이터형으로 한번에 변경.
 * 												=> 사용자 정의 클래스도 가능하다.
 * 													Class Moive{}
 * 													<Movie>
 * 
 * 		=> 컬렉션 클래스 종류
 * 						Collection : interface
 * 						----------
 * 							|
 * 		----------------------------------------- interface
 * 		|						|				|
 * 	  List					   Set			   Map											
 * 		|						|				|
 *	*** ArrayList			*** HashSet		*** HashMap										
 *		Vector					TreeSet			HashTable
 *		LinkedList (Queue)
 *
 *		컬렉션 : 데이터 관리(메모리)
 *				 -----------------
 *					1. 읽기 (데이터를 가지고 온다)
 *					2. 추가
 *					----------------------------
 *					3. 수정
 *					4. 삭제
 *					5. 검색
 *					---------------------------- 데이터가 구분되어있다.
 *													=>	List : 인덱스
 *														Set(int Index, 추가할 데이터)
 *														remove(int Index)
 *
 *													=>	Set	 : 인덱스가 없다.
 *														=> 실제 저장된 데이터가 구분자다 ==> 중복이 불가능하다.
 *			
 *													=> 	Map	 : 키
 *														=> Key, Value 두 개를 쌍으로 저장한다.
 *														   ---  ----- 중복이 있다.
 *															|=> 중복이 없고
 *	
 *													=> 	오라클 : primary Key => 중복이 없는 데이터
 *																------------ id => 중복 값 확인
 *	
 * 
 * 		1) List 특징
 * 			1. 순서를 가지고 있다.(인덱스 = 자동 처리) => 순차적으로 저장
 * 			2. 중복 데이터 저장을 허용한다.
 * 			3. 주로 사용처 => 데이터 베이스(오라클) *** 웹은 데이터베이스가 핵심이다.
 * 			4. 구현된 클래스
 * 				ArrayList	: 비동기화 처리 => 데이터베이스(오라클)에 저장된 데이터를 읽어서 브라우저에 전송
 * 							  ------------ 끝나지 않고 계속 저장만 한다. (순서가 없이 읽어오는대로 저장)
 * 				Vector	 	: 동기화
 * 							  ----- 저장이 완료가 되면 다음 것을 저장한다. => 네트워크의 접속자 정보(ID, PORT)
 * 									----------------- 속도가 늦다 => Vector를 보완한 것이 ==> ArrayList
 * 			5. ArrayList / Vector / LinkedList는 List라는 인터레이스를 구현
 * 				=> 메서드가 동일하다 (표준화)
 * 				=> 주요 기능
 * 				*** = add()	 : 추가
 * 					= remove : 삭제
 * 					= set	 : 수정
 * 				*** = get	 : 읽기
 * 				*** = size	 : 저장된 개수 확인
 * 				*** = isEmpty: 데이터의 존재 여부
 * 				*** = clear  : 전체 삭제
 * 		
 * 		2) Set 특징
 * 			1. 순서가 없다.
 * 			2. 데이터 중복을 허용하지 않는다.
 * 			3. 구현한 클래스
 * 				HashSet : 중복 없는 데이터를 저장한다.
 * 							=> 웹에서 채팅을 할 때 => 접속자 관리
 * 							add(), remove(), clear(), isEmpty()
 * 
 * 				TreeSet : 검색 속도가 빠르다 => Application 
 *  
 * 		3) Map 특징
 * 			1. key, value => 동시에 저장
 * 			   ---------- 우편 번호 (우편번호, 실제 주소)
 * 			 	key	: 중복이 불가능
 * 			  	value: 중복이 가능
 * 			 	Map<k, V>
 * 					= K => key
 * 					= V => value
 * 					= T => type
 * 					= E => element
 * 			   	ArrayList<E>
 * 				Vector<E>
 * 				Set<E>
 * 
 * 			2. 사용처	=> Spring => 클래스 저장 (사용자)
 * 						   ------- 클래스 관리 (생성 ~ 소멸)
 * 						=> 웹 : 전송 / 응답 / 저장 (클라이언트, 서버) ==> Cookie / Session
 * 						=> MyBatis => 키 : id , 값 : sql
 * 
 * 			3. 주요 기능
 * 				= put()  : 저장 => put(키, 값)
 * 				= get()  : 읽기 => get(키)
 * 				= clear(): 전체 삭제
 * 		
 * 			4. 순서가 없다.
 * 				=> 키 ==> 구분자로 사용
 * 				=> 값 ==> 모든 값을 설정할 수 있다.
 * 	-------------------------------------------------------------------------------------------
 * 	ArrayList가 여러 개 있는 경우
 * 		=> 차집합	==> removeAll()	===> MINUS
 * 		=> 교집합	==> retainAll()	===> INTERSECT
 * 		=> 합집합	==> addAll()	===> UNION
 * 	------------------------------------- 오라클 : JOIN
 * 										  ----- 로직은 없다.(제어문이 없다.)	==> 명령문이 많다.
 * 																				------ SQL / PL ~ SQL
 * 
 * 		4) properties 특징
 * 			1. 파일 => .properties => 파일 일기
 * 			2. 데이터베이스 정보
 * 			3. map 형식
 * 				변수(key) 값 => 보안유지시 주로 사용 => MyBatis
 */		
public class 라이브러리_1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", String.valueOf(20));
		map.put("password", "4567");
		// key가 중복되면 => 덮어쓰기 ==> 중복을 허용하지 않는다.
		// 값을 가져온다
		
//		System.out.println("아이디 : " + map.get("id"));
//		System.out.println("비밀번호 : " + map.get("password"));
//		System.out.println("이름 : " + map.get("name"));
//		System.out.println("성별 : " + map.get("sex"));
//		System.out.println("나이 : " + map.get("age"));
		Set<String> s = map.keySet();
		for (String ss : s) {
			System.out.println(ss + ":" + map.get(ss));
		}
//		set : 순서가 없다 => 가급적이면 출력 시에 ArrayList를 이용하는 것이 좋다. (순차적이다.)
//		map은 클래스 관리
		
	}

}
