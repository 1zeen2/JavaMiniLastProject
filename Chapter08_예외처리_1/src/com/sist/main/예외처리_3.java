package com.sist.main;

import java.util.Scanner;

/*
 * 	예외 : 프로그램에 의도하지 않은 문제가 발생한 경우
 *	
 *		=> 문제가 발생하는 경우
 *	 		= 사용자의 부주의 (입력을 잘못하는 경우)
 * 			= 프로그램의 결함 (프로그래머 실수)
 * 			= 해결책
 * 				1. 조건문 사용 => if => 사전에 예방
 * 				2. 조건문이 안되는 경우 => 예외 처리를 이용한다
 * 										  --------
 * 										  직접 처리 : 프로그래머가 에러 발생시 처리 => 복구
 * 													  try ~ catch
 * 													  ---	-----
 * 													   |	  |=> 에러 발생시 처리 ==> 예상되는 에러를 처리하기 때문에 여러 개 사용이 가능
 * 													   |=> 소스 코딩
 * 										------------------------------------------------------------------------------------------------
 * 										이미 소스 코드가 완료된 상태 => try ~ catch 만들기가 어렵기 때문에...
 * 										
 * 										간접 처리 : 시스템에 의해 처리가 가능 => 회피
 * 													throws
 * 													------
 * 													  |=> 예상되는 에러를 등록 => 호출 시에 처리하고 사용
 * 													  |=> 라이브러리에 많이 존재한다.
 * 														  ------------------------- 라이브러리 메서드 호출 시에는 예외 처리 후에 사용한다.
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번쨰 정수 입력");
		// 문자열로 받는다. (윈도우, 웹 => 정수가 없다 => 문자열로 받는다)
		String num1 = scan.next();
		System.out.println("두 번째 정수 입력");
		String num2 = scan.next();
		
		
		
		// 첫 번째 에러
		int n1 = Integer.parseInt(num1);	// 문자열을 정수로 변환
		int n2 = Integer.parseInt(num2);	// 문자열을 정수로 변환
		int n3 = n1 / n2;	// if 문 처리가 편하다 => 0으로 못나누게 할 때.
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		} catch (RuntimeException e) {	// 정수 변환이 안되는 경우에만 처리.
			System.out.println("정수만 입력할 수 있습니다.");
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
		}
		// NumberFormatException, ArithmeticException .... RuntimeException
		
		// 정상 수행 가능, 사용자가 입력을 잘못 한 경우 => 에러 처리가 안된다. ==> 입력 값을 받아봐야 알 수 있다
		// => 강제로 예외 처리를 하지 않음. ==> 필요 시에만 함 ==> 예외 처리를 생략할 수 있다. (정상 수행이 될 수도 있기 때문에)
		System.out.println("프로그램 종료"); // 정상 종료
		// 프로그램을 정상 종료할 수 있게 만들어준다. => 윈도우, 브라우저 ==> 실행 상태 유지, ...
		
	}

}
