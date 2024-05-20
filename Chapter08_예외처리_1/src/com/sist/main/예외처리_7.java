package com.sist.main;
// 에러 메시지 => 출력
/*
 * 에러 확인
 * getMessage() : 에러 내용만 출력
 * printStackTrace() => 권장 사항 => 에러 위치 확인
 * ----------------------------------------------------------------------
 * Exception : 상속을 내린 모든 클래스의 예외 처리 기능을 가지고 있다.
 * ----------------------------------------------------------------------
 * IOException / SQLException / ClassNotFoundException / RuntimeException
 * ...
 * ----------------------------------------------------------------------
 * RuntimeException : 실행 시 예외 처리의 모든 기능을 가지고 있다.
 * ----------------
 * 상속은 내리는 클래스가 크고 받는 클래스가 작다.
 * 
 * Class A
 * Class B extends A ==> A > B
 * 		   --------- 클래스에서 클래스 상속은 '확장' 개념이다.
 * interface A
 * class B implements A ==> A > B	===> 인터페이스도 클래스이다.
 * 		   ------------- 인터페이스에서 클래스 상속은 '구현'개념이다.(인터페이스는 구현이 안 된 메서드를 가지고 있다.)
 * 													------ 구현해서 완전한 클래스를 만들어서 사용한다.
 * ------------------------------------------------------------------------------------------------------------
 * 		ClassCastException < RuntimeException < Exception < Throwable
 * 	-----------------------------------------------------------------
 * 예외 처리 
 * Exception => 예외 처리의 최상위 클래스
 * --------- 모든 예외 처리가 첨부되어 있다.
 * => 어떤 에러가 발생했는지 확인
 * getMessage(), printStackTrace() : 권장
 * 	=> 에러 발생 시 Error 창을 잘 확인해야 한다.
 * 
 * 
 * 
 * 
 */
class AAA {}
class BBB extends AAA {  
	
}
public class 예외처리_7 {
	String msg;	// null 인 경우에는 연결하는 주소가 없어서 메서드를 사용할 수 없다.
				// NullPointException
	public static void main(String[] args) {

		try {
			//int a = Integer.parseInt(" 10"); // 정수로 변환
//			int[] arr = new int[2];
//			arr[0] = 10;
//			arr[2] = 20;
//			예외처리_7 a = new 예외처리_7();
//			String s = a.msg.concat(a.msg, "Java");
//			System.out.println(s);
			AAA a = new AAA();
			BBB b = (BBB) a;	//ClassCastException
			// 형 변환 시 반드시 생성자가 일치해야 한다.
		} catch (Exception e) {
			// Exception => 자바에서 지원하는 모든 오류 처리가 가능 => Throwable : Error 같이 출력 => 웹
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			// error 자주 발생하는 경우 => try ~ catch
		}
	}

}
