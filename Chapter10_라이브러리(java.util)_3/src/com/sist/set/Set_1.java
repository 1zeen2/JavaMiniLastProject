package com.sist.set;
/*
 * 	Set : 인터페이스
 * 	---
 * 	 |
 * 	 ------------
 * 	 |			|
 * 	HashSet		TreeSet
 * 	   |		   |=> 검색 속도가 빠르다.
 * 	   |=> 접근 속도가 빠르다.
 * 
 * 	특징)
 * 		1. 순서가 없다. (인덱스가 존재하지 않음)
 * 		2. 데이터 중복을 허용하지 않는다.
 * 			=> DISTINCT(오라클)
 * 		3. 주요 메서드
 * 			add()	 => 데이터 추가
 * 			remove() => 데이터 삭제
 * 			clear()	 => 데이터 전체 삭제
 * 			*** 데이터를 한 번에 모아서 관리 : iterator() ***
 * 			*** 주로 사용처
 * 				-------- ArrayList에 존재하는 데이터 중복을 제거할 때 주로 사용한다
 * 										   --------- 객체는 중복 제거가 어렵다 => 같은 메모리 주소를 사용하기 때문에.
 * 													 equals() 재정의..
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class Set_1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// 저장 장소를 선언
		set.add("사과");
		set.add("배");
		set.add("참외");
		set.add("수박");
		set.add("메론");
		set.add("체리");
		set.add("사과");	// 이미 존재하는 데이터는 저장이 불가능하다.
		set.add("배");	// 이미 존재하는 데이터는 저장이 불가능하다.
		set.add("배나나");
		set.add("오렌지");
		
		System.out.println("================ 저장된 과일 출력 ==============");
		// index번호 가 없기 때문에 ==> for-each 사용해야 한다.
		for (String f : set) {
			System.out.println(f);
		}
	}

}
