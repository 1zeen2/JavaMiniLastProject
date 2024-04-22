/*
 *  1 ~ 100 사이의 정수를 10개 추출, 최대값 / 최소값 구하기
 */

import java.util.Random;

public class 자바제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1;					// 가장 낮은 수 설정
		int min = 100;					// 가장 높은 수 설정
		for (int i = 0; i < 10; i++) {	// 출력과는 상관이 없다
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num + " ");    // 1 ~ 100 사이의 정수 추출
			//최대값 최소값 구하기
			
			if (max < num)
				max = num;				//최대값
			if (min > num)
				min = num;				// 최소값
		}
		/*
		 * int max = 1;
		 * int a = 10;
		 * int b = 20;
		 * int c = 30;
		 * 
		 * if (max < a)
		 * 		max = a => max => 0 => 10
		 * if (max < b)
		 * 		max = b => max => 10 => 20
		 * if (max < c) 
		 * 		max = c => max => 20 => 30
		 */
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
	}

}
