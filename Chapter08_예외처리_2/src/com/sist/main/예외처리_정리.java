package com.sist.main;
/*
 * 예외 처리가 필요한 곳
 * 		=> 컴파일 시에 예외처리가 되어 있는지 확인	
 * 		   ------------------------------------ 반드시 예외 처리 후에 사용 (메서드) => 예외 처리를 하는 것이 좋다
 * 		java.io / java.sql / java.net / javax.http.servlet
 * 
 * 		=> 예외 처리를 확인하지 않는 곳 = UnCheckedException
 * 		java.lang	=> 예외 처리를 하지 않아도 된다
 * 
 * 
 * 		throws Exception => 모든 예외 처리 클래스가 포함되어 있다.
 * 		try {}
 * 		catch(Exception e){}

 * 		throws Throwable
 * 		=> throws Exception ==> 오류 발생
 * 
 * 		Throwable > Exception > 기타
 * 		--------- Spring AOP
 * 
 * 		** 상속이 있는 경우에는 => 상위 클래스가 하위 클래스보다 크다
 * 			|=> 위로 올라갈 수록 크다
 * 			
 * 			Object
 * 			  |
 * 		  Throwable
 * 			  |
 * 		-------------
 * 		|			|
 * 	  Error		Exception
 * 					|=> 나머지 예외 클래스
 * 						----------------- (예외 처리 필수, 예외 처리 필수가 아니다)
 * 										   -------------  ----------------------
 * 											컴파일 시		실행시 => 입력 값을 받아봐야 알 수 있다.
 * 
 * 		=> 예외 발생이 많은 경우 : NumberFormatException
 * 								  브라우저 =========> 자바
 * 											문자열 (다른 데이터 형이 없다) ==> 정수 / 실수 ===> 변환 과정에서 오류 발생
 * 
 */
public class 예외처리_정리 {

	public static void main(String[] args) {

	}

}
