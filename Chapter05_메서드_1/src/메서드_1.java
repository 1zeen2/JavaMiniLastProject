/*
 * 	1. 클래스의 구성 요소
 * 		-------------
 * 		Class ClassName {
 * 		---------------
 * 		변수 : 데이터 저장
 * 			= 캡슐화 (데이터 보호)
 * 		----------------
 * 		생성자 : 변수에 대한 초기화
 * 		----------------
 * 		메서드 : 데이터를 활용하는 기능
 * 		----------------
 * 		}
 * 	
 * 		1. 기능 설정 => 단락 => 처리 => 메서드
 * 			자바 : 메서드 => 클래스 종속
 * 			C / C++	: 함수 => 독립적으로 사용
 * 		
 * 		2. 데이터 저장			=============>	데이터 처리(요청)
 * 			-------							-------------
 * 			| 변수 (한 개)						데이터 가공
 * 			| 배열 (여러 개)					| 연산자
 * 				=> 같은 데이터형				| 제어문
 * 				=> 인덱스 이용					-------------
 * 											연산자 + 제어문	=> 메서드
 * 			| 클래스 (사용자 정의 데이터형)		| 명령문의 집합
 * 				=> 다른 데이터형				| 한가지 기능만 수행
 * 											-----------------
 * 											| 반복적인 내용을 제거
 * 												=> System.out.println()
 * 															  ---------
 * 															   => 출력을 담당하는 메서드.
 * 											| 구조적 프로그램 (단락)
 * 												=> 수정, 추가, 삭제가 편리
 * 											| 재사용 => 다른 클래스에서 사용이 가능
 * 
 * 		메서드 (Method)
 * 		-> 사용 목적 : 가독성 (기능 별로 묶어놓음)	=>	에러시 처리가 편리
 * 					 기능 별 구분
 * 					 재사용성 => 객체 지향 프로그램
 * 		-> 기능 별 처리
 * 			= 로그인 처리
 * 			= 회원 가입
 * 			= 게시판
 * 			= 목록 => 페이징
 * 			= 예약하기
 * 			= 결제
 * 		  -----------
 * 		-> 다른 클래스에서 연결 => 메시지 (메서드) => 상호 통신
 * 		-> 필요시마다 재사용
 * 			정수 => Scanner scan = new Scanner(System.in)
 * 			=> NextInt()
 * 		-> 반복을 제거할 수 있다는 장점이 있다.
 * 			메서드가 호출되면 처음부터 실행한다.
 * 
 * 			변수 (데이터) = 기능 = 조립
 * 						  |
 * 						 메서드
 * 			----------------------
 * 			=> 조립 (웹사이트)
 * 				메인 페이지
 * 				메뉴 / Footer / Content
 * 								  |
 * 								게시판 / 채팅 / 공지사항 / 예약 / 결제 / 장바구니 등등..
 * 			------------------------------------------------------------------
 * 				=> 오버 라이딩 / 오버 로딩 => 인터페이스 / 추상 클래스 / 오라클 연동
 * 			1. 메서드의 형식
 * 				[접근 지정어] [옵션] 리턴형 (결과 값) 메서드명(매개 변수....) => 선언문
 * 				{
 * 					// 구현
 * 				}
 * 				리턴형 (결과 값) ==> 모든 메서드는 리턴형을 가지고 있다
 * 					=> 사용자 요청에 대한 처리 결과를 넘겨준다.
 * 						리턴형은 1개 사용만 => 데이터가 많은 경우에는 묶어서 넘겨준다
 * 										   ----------------------------
 * 											| 배열 / 클래스
 * 					=> 사용자 요청
 * 						정수 두 개를 전송 => 더한 결과 값 => 정수 + 정수
 * 													  ---------
 * 				매개변수 (사용자 요청 값)
 * 					예) 로그인 요청
 * 						결과 값 / 사용자 요청 값
 * 						|		-----------
 * 						|		| id, pwd
 * 						=> boolean (true / false)
 * 						검색
 * 						---
 * 						결과 값	/	사용자 요청 값
 * 						  |			-----------
 * 						  |			검색어 (매개 변수)
 * 						  | 
 * 						검색 결과 []
 * 
 * 				메서드 명
 * 				-------
 * 				1) 알파벳, 한글로 시작한다. (대소문자 구분)
 * 				2) 숫자 사용 가능 (첫 글자로는 사용 금지)
 * 				3) 키워드는 사용 금지
 * 				4) 특수 문자 (_, $)
 * 				5) 공백을 사용할 수 없다
 * 				---------------------------------- 식별자
 * 				** 변수는 중복 사용이 불가능 (한 개의 메서드에서 같은 변수명은 사용이 불가하다)
 * 				** 메서드는 겉은 이름의 사용이 가능하다.	(매서드 이름은 같은데 매개 변수가 다르다. ====> 오버로딩)
 * 				** 약속 사항 (자바 개발자) => 소문자로 시작한다.
 * 					=> 단어가 2개일 때
 * 						fileName() => 두 번째 시작하는 단어는 대문자 혹은 _를 사용. (헝거리식 표기법)
 * 
 * 				** 결과 값 / 요청 값을 받는다
 * 				   ----	   ------
 * 				   리턴형		매개 변수
 *			------------------------------------
 *			메서드 유형
 *			-----------------------------------------------------
 *				리턴형		매개변수
 *			-------------------------- --------------------------
 *				  o			   o	
 *				String substring(int start, int end)
 *			-----------------------------------------------------
 *				  o			   X	
 *				double random()	=> 결과 값은 0.0 ~ 0.99 => 실수를 리턴
 *			-----------------------------------------------------
 *				  X			   o	
 *				void plrintln("aaaa") => 결과 값이 없는 경우 void
 *			----------------------------------------------------
 *				  x			   x	
 *				void println() => 다음 줄에 출력
 *			----------------------------------------------------
 *			**	웹 개발
 *				-----
 *				사이트 => 사용자 입력 => 매개 변수 => 처리 => 화면
 *													  --- 결과 값 (리턴형)
 *				=> 사용자 행위 : 입력 / 마우스 클릭 => 매개 변수
 *					=> 화면 출력 => 리턴형
 *				
 *				=> 사용자 요청 => 처리 => 결과 값을 돌려준다
 *				   --------------------------------- 메서드
 *
 * 
 * 			2. 메서드 사용법
 * 			   메서드 => 호출 방법
 * 				1) 결과 값이 있는 경우
 * 			   메서드 명 (매개 변수)
 * 				2) 결과 값이 없는 경우
 * 				데이터형 변수명 = 메서드 명 (매개 변수)
 * 				double d = Math.random()
 * 						   -------------
 * 			 	-------- 넘어오는 값과 받는 값이 일치해야 한다 (큰 데이터 형으로 받거나 형 변환 사용)
 * 			3. 반복을 제거
 * 				=> 예
 * 					오라클 연결
 * 					문장 => 전송	(SELECT)
 * 					오라클 닫기
 * 					----------- 
 * 					오라클 연결
 * 					문장 => 전송	(INSERT)
 * 					오라클 닫기
 * 					----------- 
 * 					오라클 연결
 * 					문장 => 전송	(UPDATE)
 * 					오라클 닫기
 * 					----------- 
 * 					오라클 연결
 * 					문장 => 전송	(UPDATE)
 * 					오라클 닫기
 * 					----------- 반복 구간 => 메서드화
 * 				형식)
 * 								| 선언만 하는 메서드 abstract
 * 								| 공유 => 메모리에 자동으로 올라간다
 * 									static
 * 					[접근 지정어][옵션]	리턴형 메서드명([매개 변수]....)
 * 					{
 * 						... (기능 구현)
 * 						... 
 * 						결과 값 전송
 * 						return 값; => 값은 1개만 사용이 가능
 * 									  ---------------- java / c / c++
 * 										python은 여러 개 사용이 가능
 * 										| 데이터가 많은 경우 => [], 클래스를 이용해서 모아서 보내준다.
 * 					}
 * 					----------
 * 					public
 * 					private
 * 					protected
 * 					default
 * 					---------- 같은 폴더 안에서만
 * 					** 모든 메서드는 메서드 종료를 나타내는 표시가 있어야 함 => return;
 * 					** void일 경우에는 return을 생략할 수 있다.
 * 									-------
 * 									| 컴파일러가 자동으로 추가
 * 				** 클래스
 * 					= 사용자 데이터 형 = 데이터만 저장할 목적 = ~VO, ~DTO, ~Bean
 * 					= 액션 클래스 => 메서드 (기능만 가지고 있음) => ~DAO, ~Manager
 * 						| 중심
 * 						   = 실습 (2주) => 관리자 페이지 만들어서 제출
 * 							댓글형 게시판 만들어서 제출
 * 							..
 * 							예약, 결제 ...
 * 					  -----------------------------------------------------
 */	

// 메서드 호출 방법
public class 메서드_1 {
	// 자동 메모리 할당
	// 자체 처리 => 출력을 메서드 안에서 처리
	static void display (String name) {
						// ==> 매개 변수 => 사용자가 보내주는 값
		System.out.println("display : 진입");
		System.out.println("사용자가 보내준 값 : " + name);
		System.out.println("display : 처리 완료");
		System.out.println("display : 종료");
	}
	public static void main(String[] args) {
	// 		공유, 결과 값 없음, 메서드 명, 매개 변수
		// main => 시작점
		System.out.println("display 진입 전");
		display("홍길동");
		
		System.out.println("================================");
		System.out.println("display 진입 전");
		display("심청이");
		
		System.out.println("================================");
		System.out.println("display 진입 전");
		display("이순신");
		
	}

}
