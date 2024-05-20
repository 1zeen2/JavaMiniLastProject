package com.sist.main;
/*
 *	문자열 2개 받아서
 * 	정수 배열에 저장	=> 정수 변환(사용자), 배열의 인덱스(프로그래머 실수)
 * 	배열 값을 나누기 위해서 출력 => 사용자가 나누기 값을 0을 입력하는 경우
 * 	------------------------------------------------------------------
 * 	1. 예상 되는 에러 3개.
 * 	2. 기타 발생 => + 1개 = 총 4개. ==> 우리가 예상하지 못 한 에러가 발생할 수 있음
 * ----------------------------------------------------------------------------
 * 	1. 사전에 에러 방지할 수 있는 프로그램 제작
 *     --------------------------------------
 * 		1) 조건문으로 가능한가
 * 			=> 예외 처리를 통해 예상되는 에러 도출.
 */
public class 예외처리_6 {
	public static void main(String[] args) {
		try {
			String s1 = "3";
			String s2 = "1";
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);			// Error
			int[] arr = {n1, n2};
			System.out.println(arr[0] / arr[1]);	// Error
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		} catch (NumberFormatException e) {
			System.out.println("정수 변환 오류");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예상하지 못한 에러 발생.");	// 반드시 큰 예외 처리는 마지막에 ==> 예상치 못한 예외 처리를 가능하게 해준다.
		}
	}
}
