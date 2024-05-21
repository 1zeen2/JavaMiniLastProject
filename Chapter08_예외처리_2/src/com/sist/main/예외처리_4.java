package com.sist.main;
/*
 * 멀티 예외 처리
 * --------------
 * 	catch 여러 개 사용 => catch (1로 통합)
 */
public class 예외처리_4 {
	// throws 뒤에 있는 예외가 예상된다 ==> 사용자는 예외 처리 후에 사용한다 -> 에러 발생 시 대채
	// 처리는 개바라에게 맡기는 프로그램 => 떠맡기기
	public void print2() throws Exception {
		print2(); 
	}

	public static void main(String[] args) {

	}

}
