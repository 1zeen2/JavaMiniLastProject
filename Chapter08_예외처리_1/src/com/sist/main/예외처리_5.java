package com.sist.main;

import java.util.Random;

/*
 * catch 1개로 여러 개를 처리할 경우 : Exception (모든 예외 처리 가능을 가지고 있다.
 * 실행 시 예외는 RuntimeException 
 * 
 * 	CheckedException : 컴파일 시에 예외 처리가 있는 지 확인, => 반드시 예외 처리를 해서 사용
 * 	---------------- 파일 입출력, 오라클 연동, 크롤링, 네트워크, 웹
 * 
 *	UnCheckedException : 실행 시에 예외 처리를 하기 때문에 => 생략이 가능하다
 *						 ------------------------------ 분법
 *
 *	예외 처리의 종류
 *	=> ClassNotFoundException : 클래스를 찾을 수 없는 경우
 *	   ---------------------- Class.forName("패키지 명.클래스 명"); => JSP/Spring => CheckedException
 *		IOEception : 입출력 => (메모리 입출력, 파일 입출력, 네트워크 입출력)
 *		SQLException : *** 핵심 (오라클 실행 => SQL)
 *		=> Spring / 데이터 베이스 가능자
 *		   ------ java / jsp / mvc
 *		 -------------------------- Back-End
 *		--------------------------- Front-End (자바 스크립트)
 *									------------------------
 *									변수, 연산자, 제어문, 클래스, 배열, 예외처리, 매서드
 *		--------------------------------------------------------------------------------------------
 *		=> HTML/CSS : 윈도우 화면 UI
 *		InterruptedException : 쓰레드 관련
 *		MalformedURLException : 네트워크 관련
 *		------------------------------------- CheckedException : 반드시 예외 처리
 *
 *		RuntimeException
 *		----------------
 *		= NumberFormatException	: 정수 변환 => Integer.parseInt() => 웹, 네트워크, 윈도우
 *																	------------------- 정수가 없다
 *		= ClassCastException : 클래스 형변환 문제
 *		= ArrayInedexOutOfBoundsException : 배열의 인덱스 초과
 *		= NullPointerException : 클래스에 주소값이 배정이 안된 상태
 *		= ArithmeticException : 0으로 나눈 경우
 *		= IllegalArgumentException : 매개 변수 값이 다른 값이 전송된 경우 : 웹에서 전송을 받는 경우
 *		------------------------------------------------------------------------------------------
 *		catch 1개로 처리 가능 : Exception / Throwable
 *							   ---------------------
 *		예외 처리의 종류 (모든 프로그램 언어에서 존재, 자바스크립트, 오라클)
 *		= try ~ catch => 가장 많이 사용되는 예외 처리
 *		= throws => 라이브러리에 주로 사용된다
 *
 *		try ~ catch 의 형식
 *		try {
 *			// 정상 수행 => Error 의심 되는 소스
 *		} catch (예외 처리 클래스) {
 *			//	에러가 발생 시 처리 => 가벼운 에러(소스에서 수정이 가능한 에러) => 에러(예외 처리에서 처리가 불가능한 에러)
 *
 *				Error : 소스 상에서 수정이 불가능한 에러
 *
 *						브라우저의 문제, 메모리 부족, 이클립스 오류 등, ...
 *
 *				예외 처리 : 소스 상에서 수정이 가능(잡을 수 있는 가벼운 에러)
 *							파일 명 오류, IP오류, 매개 변수 값 전송 오류, ...
 *		}
 *		try => 전체 사용, 부분 사용이 가능하다.
 */	
public class 예외처리_5 {

	public static void main(String[] args) {
/*		try {
			for (int i = 1; i <= 10; i++) {
				int n = (int)(Math.random() * 3);
				System.out.println(i / n);
			}
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e.getMessage());
			
		}
*/
		for (int i = 1; i <= 10; i++) {
			try {
				int n = (int)(Math.random() * 3);
				System.out.println(i / n);
			} catch (Exception ex) {
				System.out.println("오류 발생" + ex.getMessage()); 
			}
		}
	}

}
