
import java.util.Scanner;

import java.util.*;

public class 배열문제_4 {

	public static void main(String[] args) {
		// 4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라 
		
		// 정수 10개를 저장하는 공간 => 배열
		int[] arr = new int[10];
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
			System.out.println(Arrays.toString(arr));	// 저장된 값 먼저 확인
			
			for(int i : arr) {
				if (i %3 == 0)
					System.out.println(i + "");
			}
			
	}
}	
/*		int[] s = new int [10];
		
		for (int i = 0; i < 10; i++) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		s[i] = scan.nextInt();		
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i] % 3 == 0 && s[i] != 0 ) {
				System.out.print(s[i] + " ");
			}
		}
		System.out.println("ㅇㅇ");
*/

