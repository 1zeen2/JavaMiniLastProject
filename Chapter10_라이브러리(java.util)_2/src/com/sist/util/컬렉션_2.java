package com.sist.util;

import java.util.*;

public class 컬렉션_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add("홍길동");
		list.add(10.5);
		list.add(true);
		list.add('A');
		// Object 형식이라 데이터형에 구애받지 않고 자유롭지만
		// 관리가 어렵고 반복문이 어렵다
		int a 		= (int) list.get(0);
		String name = (String) list.get(1);
		double d 	= (double) list.get(2);
		boolean b	= (boolean) list.get(3);
		char c 		= (char) list.get(4);
		
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
	}

}
