package com.sist.set;

import java.util.*;

public class Set_4 {

	public static void main(String[] args) {
		System.out.println(("심청이" + 20).hashCode());
		System.out.println(("홍길동" + 20).hashCode());
		// 변수값이 같은 경우 =?
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int k = r.nextInt(100) + 1;
			set.add(k);
			System.out.println(k + " ");
			
		}
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.addAll(set);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(set);
		 
		
		
		for(int i : set) {
			if (i >= 50) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for(int i : set) {
			if (i <= 50) {
				System.out.print(i + " ");
			}
		}
	}

}
