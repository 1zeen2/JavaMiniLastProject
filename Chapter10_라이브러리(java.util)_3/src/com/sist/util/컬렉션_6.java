package com.sist.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/*
 * 	정렬
 * 	Collections.sort()
 */
public class 컬렉션_6 {

	public static void main(String[] args) {
		// <> => 제네릭 ==> 반드시 클래스만 첨부할 수 있다.
		// <int> <double> ==> 오류.
		// <Intager> <Double> 로 사용해야 한다.
		ArrayList<Integer> list = new ArrayList<Integer>(); // Wrapper => 제네릭에 첨부, 기능 부여
		// 정수 10개 임의 추출
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			// 오토박싱 => Integer i = 10
			list.add(r.nextInt(100) + 1);
			
		}
		System.out.println("======== list data print ========");
		
		// 언박싱 int a = i
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println("========정렬=========");
		
		Collections.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(0, 5));
		// list => 데이터 5개 복사
		System.out.println("=========== 5개 복사된 데이터 출력 ============");
		
		for (int i : list2) {
			System.out.println(i);
		}
		list2.add(r.nextInt(100) + 1);
		list2.add(r.nextInt(100) + 1);
		list2.add(r.nextInt(100) + 1);
		list2.add(r.nextInt(100) + 1);
		list2.add(r.nextInt(100) + 1);
		
		System.out.println("=============list 2 all data print==========");
		for (int i : list2) {
			System.out.println(i);
		}
		System.out.println("=========list 2 sort ================");
		Collections.sort(list2);
		for (int i : list2) {
			System.out.println(i);
		}
	}

}
