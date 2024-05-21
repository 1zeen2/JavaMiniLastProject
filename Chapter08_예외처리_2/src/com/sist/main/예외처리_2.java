package com.sist.main;
/*
 * throw :	임의로 에러 발생
 * 			형식)
 * 				throw new 예외 클래스() => catch 로 이동하기 때문에
 * 				=> 코딩이 불가능
 * 			catch 는 예외 처리 크기에 따라 순서가 존재한다. => 상속도
 * 			throws 문장은 예외 처리 순서가 없다 => , 사용
 */

import java.util.*;

public class 예외처리_2 {
	public void disp() throws Exception {
		
	}
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("양수만 입력하시오.");
		int no = scan.nextInt();
		try {	
			if (no < 0) {	// 예외 처리 발생한 것 뿐만 아니라 => 임의로 발생시킴.
				// 견고한 프로그램 => 에러 발생 시에 처리가 되고 있는지 => 테스트
				// 개발자 => 단위 테스트 (메서드가 잘 동작이 되고 있는지) ==> JUnit
				throw new IllegalArgumentException("음수는 사용할 수 없습니다.");
				// 예외를 던진다 => 직접 예외의 catch 호출이 가능.

			}
			System.out.println("no = " + no);
		} catch (IllegalArgumentException e) {	// 입력 값이 잘못 된 경우
			// 음수는 사용할 수 없습니다. ==> getMessage()
			System.out.println(e.getMessage());
		} 
		// 반드시 실행 되어야 하는 문제가 있는 경우
		System.out.println("프로그램 종료.");
		
	}
}
