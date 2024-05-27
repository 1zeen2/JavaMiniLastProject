package com.sist.util;

import java.util.*;

public class 라이브러리_4 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("오렌지");
		set.add("메론");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext() ) {
			System.out.println(it.next());
		}
	}

}
