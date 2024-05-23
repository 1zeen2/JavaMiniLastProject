package com.sist.util;
/*
 *	toString() => 배열의 데이터 출력
 *	sort	
 */
import java.util.*;

public class 라이브러리_4 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[7];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			}
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
