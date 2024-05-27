package com.sist.map;

import java.util.*;
/*
 * 	주요 메서드
 * 		clear() : 등록된 데이터를 전체 삭제
 * 	*** get()	: 저장된 데이터를 찾아서 출력
 * 		pub()	: 데이터를 저장 => put(Object, Object)
 * 									key,   value
 * 		isEmpty(): 데이터 존재 여부 => 자동 로그인
 * 		size()	: 저장 개수
 * *** Value	: 셀제 값만 읽기
 * *** keySet() : key만 읽어온다.
 * 
 * 	=>	관련된 클래스가 여러 개 있는 경우
 * 		한 개로 모아서 클래스를 관리해야 한다. => 인터페이스
 * 		데이터를 모아서 관리 => 배열 / ArrayList
 * 
 * 	=> 묶음 ==> 객체 지향 프로그램
 * 	   ---
 * 		1. 데이터 => 배열 / 클래스
 * 		2. 명령문 => 메서드
 * 		3. 클래스 => 인터페이스
 * 		------------------------- 소스가 간결하고, 가독좋이 좋으며, 관리가 편리하다.
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. 로그인(login), 2.게시판(borad), 3.공지사항(notice), 4.회원가입(join), 5.맛집(food) : ");
		String Menu = scan.next();
		Container c = new Container();
		Model model = c.getBean(Menu);
		model.execute();
		
	}

}
 