package com.sist.util;

import java.util.ArrayList;

/*
 *	Collection : 배열을 대체한다 => 가변형이며 (저장 개수를 저장하지 않는다)
 *											  ------------------------- 신축성이 좋다.
 *	1. 컬렉션 프레임워크
 *		= 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 *							 --------------				  -------
 *		= 자료 구조 : 데이터 수정, 삭제, 추가, 읽기가 가능하다.
 *								 ---------- 배열은 불가능하다 (고정적)
 *		= 동적 메모리 할당 (가변형)
 *			=> 필요시마다 데이터를 추가, 삭제가 편리하다
 *				=> 웹, 모바일 => 컬렉션을 이용해서 데이터 전송
 *		= 단점 : 모든 데이터를 저장이 가능하게 => Object로 되어있다 => 객체 형변환
 *			// 메서드 => 리턴형 / 매개변수 => Object => 제네릭스 (프로그램에 맞게)
 *	
 *	2. 컬렉션의 종류
 *				Collection	:	interface
 *							 |
 *			-------------------------
 *			|			 |			|	
 *		  List			Set		   Map		==> interface
 *			|			 |			|	
 *		ArrayList     HashSet	 Hashtable	==> interface를 구현한 클래스
 *		LinkedList	  TreeSet	  HashMap
 *		 Vector
 *
 *			List	=> 데이터 중복 허용
 *					   순서를 가지고 있다. (Index)
 *
 *			Set		=> 데이터 중복을 허용하지 않는다
 *					   순서가 존재하지 않는다.
 *			
 *			Map		=> (key, value)	=> 동시에 저장 가능하다.
 *						key는 중복이 불가능하고 / value는 중복이 가능하다.
 *
 *		-------------------------------------------------- CRUD => 자료 구조	
 *			ArrayList	: 비동기, 데이터베이스 연결	
 *			LinkedList	: C언어와 호환
 *			Vector		: 동기, 네트워크 접속자 정보 저장을 => 보완한 것이 => ArrayList
 *
 *			ArrayList
 *				1) 가장 많이 사용되는 컬렉션
 *				2) 인덱스를 이용해서 데이터를 저장하고 관리한다 => 배열과 유사함
 *-				   -----------
 *				3) 기본형, 클래스를 첨부해서 사용할 수 있다.
 *				4) 접근 속도가 빠르다
 *		  단점 -----------------------------------------------------------------
 *				1) 추가, 삭제 시에 속도가 늦다.
 *		  ----------------------------------------------------------------------
 *
 *
 *
 */
public class 컬렉션_1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 가변형 => 데이터 저장 개수를 지정하지 않는다.
		list.add("이순신");
		list.add("홍길동");
		list.add("박문수");
		list.add("지게차");
		list.add("거북선");
		list.add("야야차");
		list.add("으랏챠");
		
		for (int i = 0; i < list.size(); i ++) {
			System.out.println(list);
		}
		System.out.println(list);
	}

}
