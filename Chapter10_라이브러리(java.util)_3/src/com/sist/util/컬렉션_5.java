package com.sist.util;
/*
 * 	ArrayList
 * 		=>	add(), remove(), set(), size(), get(), isEmpty(), clear()
 * 		   	-----					------	-----			  -------
 * 		=> 	ArrayList에는 한 개만 저장
 * 			ArrayList 두 개 이상인 경우 => JOIN
 * 			retainAll()	=>	두 개의 List에서 같은 값을 읽어오는 경우
 * 							--------------------------------
 * 							장바구니 => 중복 구매
 * 			addAll()	=> 전체를 데이터 복사
 * 			removeAll()	=> 한 쪽에 없는 데이터만 출력
 * 			subList()	=> 부분 복사
 * 			asList()	=> 배열 => ArrayList로 변경
 * 	------------------------------------------------------------------ 교재에 없는 내용
 */
import java.util.*;

public class 컬렉션_5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		// addAll()	=> Set => 복사가 가능하다.
		for (String s : list) {
			System.out.print(s);
		}
		System.out.println();
		//	asList는 클래스는 첨부가 불가능하다. => 기본형 / String만 가능.
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		for (String s : list2) {
			System.out.print(s);
		}
		
		
		
	}

}
