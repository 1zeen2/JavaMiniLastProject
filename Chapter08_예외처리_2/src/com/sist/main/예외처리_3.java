package com.sist.main;
// Exception / RuntimeException
// CheckedException / UnCheckedException

import java.util.*;

class MinusException extends Exception	 {
	
	// 상속 => 예외 처리 전체를 상속받아 처리한다.
	public MinusException(String msg) {
		super(msg);
	}
}

public class 예외처리_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양수만 입력");
		int no = scan.nextInt();
		try {
			if (no < 0) {	// 에러 발생이 아니다 => 일부러 발생 => throw
				throw new MinusException("음수는 사용 불가.");
			}
		} catch (MinusException e){
			System.out.println("에러 메시지 " + e.getMessage());
			System.out.println("============== 에러 발생 위치 ==============");
			e.printStackTrace();
		}
	}

}
