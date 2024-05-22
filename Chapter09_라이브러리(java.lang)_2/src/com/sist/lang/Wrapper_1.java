 package com.sist.lang;
/*
 * 	Wrapper : 모든 기본형 데이터를 클래스화 시켜서 사용이 쉽게 기
 * 	-------
 * 	*** Integer : int
 * 		=> 뭄
 * 		Double 	: double
 * 	*** boolean	: boolean
 * 		Float	: float
 * 		Byte	: byte
 * 		
 */
 class A <T> {
 	T t;
 	
 	public T getT() {
 		return t;
 	}
 	public void setT(T t) {
 		this.t = t;
 	}
 }
public class Wrapper_1 {

	public static void main(String[] args) {
		Integer i = 100;
		System.out.println(i);
		
		int ii = i;
		System.out.println(ii);
		
		String s = "1000";
		System.out.println(Integer.parseInt(s) + i);
	}

}
 