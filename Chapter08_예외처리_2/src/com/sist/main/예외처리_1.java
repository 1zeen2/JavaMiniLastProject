package com.sist.main;
/*
 * 	메서드
 * 	=> java.lang
 * 	=> java.util
 * 
 * 	자료 구조 => 웹 => 크롤링 => 배열을 대체 => 컬렉션 / 제네릭스
 * 	-------------------------------------- 예외 처리
 * 
 * 	입출력
 * 
 * 	핵심(java.sql) => 오라클 연동
 * 	---------------------------- 사용자 정의 메서드는 없다 => 조립
 * 	오라클 => 6시간
 * 	자바 연동 => 2시간 예정.
 * 	
 * 	1. 데이터형 / 변수 / 연산자 / 제어문
 * 	2. 클래스 구성 요소 : 멤버 변수(static), 메서드, 생성자
 * 	3. 재사용 => 상속 / 포함
 * 	4. 클래스 종류 중 => 추상 클래스, 인터페이스
 * 	5. 예외 처리 => try ~ catch, throws
 * 	---------------------------------------------------- 이정도 내용은 반드시 정확하게 숙지를 해야 함 ==> 자바의 기본 문법
 * 	6. 라이브러리
 * 	7. 조립하는 방법 => 라이브러리를 이용해 프로그램을 제작하는 방법
 * 	------------------------------------------------------------
 * 	1 ~ 7까지 전부 사용하는 곳 => 웹 => 자바는 변경 사항이 없다.
 * 										=> 출력만 바뀜 (윈도우 출력, 도스 출력, 브라우저)
 * 																			  ------- HTML / CSS (Java + HTML)
 * 											=> Java, HTML 을 분리한 것 ==> MVC
 * 																		  --- Spring
 * 											=> 기술적인 부분 ==> JavaScript
 * 											=> 배포 ==> AWS (리눅스)
 * 
 * 	=> 데이터 베이스 라이브러리 : MyBatis / JPA
 * 	=> Full Stack : Ajax, VueJS, React(React-Query), Redux
 * 													 ----- MVC 구조
 * 
 * 	=> 서버를 분리하며 (역할 별로 서버를 따로 제작) ==> 알아서 찾아가게끔 하는 방식 ===> MSA 구조
 * 	-----------------------------------------------------------------------------------------
 * 	파이썬 => 데이터 분석 => 브라우저 (광고)	=> React (속도가 빨라야 하기 때문에)
 * 			 ----------- 넘파이 / 판다스 / MatPlotLib
 * 	-----------------------------------------------------------------------------------------
 * 	전체 과정의 약 70% 점유율을 해당 ===> Java
 * 				  20% ==> DataBase
 * 	---------------------------------------- Java / Oracle
 * 	==> 요즘 신입 자격 조건 : Spring(Spring-Boot), Vue / React (React-Query), MyBatis, JPA 
 * 		===> 우대 사항 ===>	리눅스 사용자
 * 							MSA
 * 							정보처리 기사 (산업 기사)
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  예외 처리 : 사전에 에러 발생에 대한 방지 프로그램
 *  		   ----------------
 *  			=> 비정상 종료를 하지 않고 정상 수행이 가능하게 만들어 준다.
 *  			=> 에러가 발생하면 => 에러를 자동으로 수정해주는 것이 아니라 ==> 점프를 해서 에러 부분을 통과하는 방식
 *  								 
 * 				문장 1
 * 				문장 2 => 에러가 발생한다면 ==> 프로그램 종료
 * 				문장 3
 * 
 * 				에러 부분의 문장을 => 컴파일 시 무시(통과) ==> 예외 처리.
 * 	에러 발생
 * 	-------- 1. 조건문으로 처리 => 가 어려운 경우 ==> 예외 처리 이용
 * 		|=> 프로그래머의 실수 (배열 인덱스 초과, 파일 명 오류, ...)
 * 			사용자 입력 값 => 웹(사용자를 유도해나감) ==> 유효성 검사 (JavaScript)
 * 
 * 	에러 종류 :	Error => 수정이 불가능한 에러 (메모리 부족, 이클립스의 오류, ...)
 * 				Exception => 수정이 가능한 에러 => 가벼운 에러
 * 				--------- 프로그램 소스 안에서 수정이 가능하다.
 * 				IP 연결 시 IP 오류, 크롤링 시 사이트 URL 오류, 파일 명 오류, ...
 * 				라이브러리 사용 시 => 라이브러리를 로드 안 한 경우, ...
 * 	
 * 	정상 처리 방법 (예외 처리 방법)
 * 		=> 직접 처리 (프로그래머가 에러를 직접 잡아서 => 복구한다) ==> 예외 복구
 * 										 --------- 대부분 catch 에서 해결
 * 			try ~ catch ~ finally
 * 		=> 간접 처리 (떠맡기기) => 메서드 호출 시에 처리
 * 			=> 예측되는 에러만 선언 가능하다 ==> 라이브러리, 복잡한 소스가 있는 경우
 * 				=> 메서드() throws 예외 종류
 * 				   -------		  ---------
 * 				   메서드를 호출해서 사용하려면 => 뒤에 선언된 예외 처리를 하고 호출한다.
 * 					=> 복구할 수 없기 때문에 ==> 예외를 피해간다 ===> 예외 회피.
 * 
 * 		=> 임의 발생 : 테스트(에러 발생 시 => 견고) ==> 많이 사용하지는 않는다.
 * 					  throw
 * 
 * 		=> 사용자 정의 : 자바에서 전체적인 예외 처리를 진행하지 않는다 => 필요 시에는 직접 만들어서 사용하지만 ==> 사용 빈도는 거의 없다.
 * 	---------------------------------------------------------
 * 		=> catch 는 순서가 존재한다
 * 		=> throws 는 순서가 없다.
 * 		=> 예외 처리의 상속도 (반드시 예외 처리해야 하는 예외 처리, 필요 시 처리하는 예외 처리가 따로 있다.
 * 		   -----------------	컴파일 시 예외 처리 확인 (CheckedException)		/	실행 시 처리 (UnCheckedException)
 * 	---------------------------------------------------------							  |=> 사용자 입력 값을 받아서 ...
 * 	상속도
 * 								Object => java.lang.* ==> 모든 클래스의 최상위 클래스 (모든 클래스는 Object 상속이다.)
 * 		  						   |
 * 	   						   Throwable => 예외 처리의 최상위 클래스 => Error / Exception
 * 		   						   |
 * 					---------------------------------
 * 					|								|
 * 				  Error							Exception => 예외 처리의 기본 클래스
 * 					|								|
 * 			CheckedException				UnChcekedException
 * 			----------------				------------------
 * 			컴파일 시 예외 처리 확인			컴파일 시에 예외 처리 미확인
 * 				=> 반드시 예외 처리 사용			=> 필요 시에만 예외 처리 사용 (생략)
 * 
 * 			=> IOException : 입출력
 * 			   -----------
 * 				=> 파일 / 메모리
 * 
 * 			=> SQLException : 오라클 연결 / 해제
 * 			   ------------
 * 				=> 연결 시 => 오라클 서버 주소
 * 				=> SQL 문장
 * 				=> 입력 값 오류
 * 				=> 자바 (입력 값 전송) => 오라클에서 결과 값 얻기
 * 				=> 오라클 : 전체 프로그램에서 사용되는 데이터를 저장
 * 				   ----- 데이터 저장 : 크롤링
 * 			
 * 			=> MalFormedURLException : IP, URL 주소가 틀린 경우
 * 			   ---------------------
 * 				=> 크롤링 (정적 : Jsoup, 동적 : Selenium)
 * 			
 * 			=> InterruptedException : 쓰레드
 * 			=> ClassNotFoundException : 클래스 이름으로 메모리 할당 ==> new 대신
 * 	----------------------------------------------------------------------------------------------------------------------------------
 * 	UnCheckedException : 컴파일 시 미확인 => 예외 처리 생략. (필요 시에만 사용)		
 * 	------------------
 * 		=> 최상위 클래스
 * 			RuntimeEception
 * 			---------------
 * 					|
 * 			ArrayIndexOfBoundsException : 배열의 인덱스 초과
 * 
 * 			NumberFormatException :  웹, 윈도우
 * 				=> 정수가 필요한데 웹이나 윈도우는 문자열만 전송 => 정수로 변환 후에 사용
 * 
 * 				=> Integer.parseInt() => 문자열을 정수로 변환
 * 				   ------- 기본형 int 사용하기 쉽게 => 클래스 화
 * 					Double, Boolean, Float, Byte
 * 					---------------------------- 기본 데이터형을 클래스화 => Wrapper
 * 				
 * 				=> 라이브러리
 * 					java.lang : 기본 사용 클래스
 * 						=> Object, String, StringBuffer, Math ==> Wrapper
 * 
 * 					java.util : 유용하게 사용하는 클래스
 * 						=> StringTokenizer, Calendar, Date, Scanner
 * 							** List / Set / Map => 컬렉션
 * 
 * 					java.io : 파일 => FileReader, FileWriter
 * 
 * 					java.sql : Connection, Statement, ResultSet, ...
 * 				
 * 					ArithmeticException : 0으로 나누기
 * 					NullPointerException
 * 					ClassCastException
 * 					----------------------------------------------- 자주 에러가 나는 경우에 예외 처리를 한다.
 * 		=> 사용 법
 * 			1) try ~ catch ~ finally
 * 
 * 			try {
 * 				정상적으로 실행되는 소스	=> 생각치도 못한 에러가 발생할 수 있다 ==> 프로그래머의 실수 / 사용자 입력의 문제
 * 					=> 프로그램에서 중요시 되는 것
 * 						=> 에러에 대한 대비 : 에러를 예상해야 함
 * 			} catch (예외 처리 클래스) {	=> 여러 개 사용이 가능하다.
 * 				에러를 잡아서 복구 => 에러 확인
 * 									 --------
 * 									 getMessage() : 에러 메시지만 출력
 * 									 printStackTrace() : 실행하는 과정 => 에러 위치 확인
 * 									 --------------- 초보 프로그래머에게 한동안 권장.
 * 										=> 에러 나는 경우 ==> output 창에서 ===> 에러 확인
 * 			} finally {
 * 				try / catch 상관 없이 무조건 수행하는 문장
 * 					=> 파일 닫기, 오라클 닫기, 서버 닫기, ...
 * 					=> 연결 => 회수 (finally 없다면 연결은 누적되고 메모리는 회수가 되지 않아 문제가 생긴다.)
 * 			}
 * 
 * 			2) throws => 선언, 라이브러리
 * 			   -------------------------
 * 				메서드() throws 예외 처리 등록 => 떠맡기기
 * 			   ------------------------------
 * 				  | 메서드를 호출하려면 등록 예외 처리를 하고 사용해야 한다.
 * 				  | 이미 소스가 만들어진 경우
 *  
 *  			// 1. 떠맡긴다, 2. 직접 처리한다.
 *   			public void disp() throws Exception {}
 *   			public void print() {
 *   				disp(); => 오류 발생
 *   			}
 *   			public void print () {					
 *   				try {
 *   					disp();
 *   				} catch (Exception) {} ==> 예외 처리 후에 사용
 *   			}
 * 			------------------------------------------------------------------------------------------------
 * 			public void disp() throws IOException, SQLException, InterruptedException, ClassNotFoundException {}
 * 			
 * 			=> 예외 처리 전체 통합 ==> Exception 
 * 
 * 			public void print() {
 * 				try {
 * 					disp();
 * 				} catch (Exception e) {}
 * 			}
 * 			=> 라이브러리 => 이미 소스 코딩이 되어있는 상태에서는 => try ~ catch 보다는 throws 가 더 편리하다.
 * 																					------ 유지 보수가 좋음
 * 				
 * 
 * 			
 * 
 */
public class 예외처리_1 {
	// display() 호출 시에 => 이런 에러가 발생할 수 있다 (예상)
	// 사용 시에는 반드시 예외 처리를 하고 사용한다.
	// throws 뒤에는 예외 등록 => 순서가 없다.
	// throws 뒤에 예외 등록은 대부분 => CheckedException
	/*
	 * try ~ catch : 초기화 블럭, 생성자, 메서드에서 사용이 가능하다.
	 * throws : 생성자, 메서드에서만 가능 => 초기화 블럭에서는 사용이 불가능하다.
	 * *** 권장 => 가급적이면 try ~ catch 사용.
	 * *** 라이브러리는 프로그래머에게 처리를 요청한다 => throws 문장으로 되어있다.
	 */
	public void display() throws ArrayIndexOutOfBoundsException, NumberFormatException,
								 NullPointerException, IllegalArgumentException {
		display();
	}
	//	
	public void print() throws Exception {
		display();
	}
	public void print2() throws Exception {
		display();
	}
	public void print3() throws Exception {
		display();	// UnCheckedException 이기 때문에 => 생략이 가능하다.
	}
	public void print4() {
		try {
			display();
		} catch(ArrayIndexOutOfBoundsException e) {}
		catch(NullPointerException e) {}
		catch(NumberFormatException e) {}
		catch(IllegalArgumentException e) {}
	}
	public void print5() {
		try {
			display();
		} catch (Exception e) {}
	}
	public void disp() throws Exception {
		
	}
	public void print6() throws Throwable {	// IOException 은 불가능 ==> 예외 처리가 축소되면 안됨.
		disp();								// 어떤 클래스가 더 큰지 상속도를 잘 기억해야 한다.
	}
	public static void main(String[] args) {

	}

}
