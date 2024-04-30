// 정수 2개를 메서드로 전송 => MAX
//	  |		--------- 리턴 값
// ----- 매개 변수

import java.util.Scanner;

public class 메서드_2 {

	static int max(int a, int b) {
		int max = a;
		if (a < b)
			max = b;
			return max;
	}
	static int min(int a, int b) {	// 옵션 지정자, 리턴 타입, 메서드명, 파라미터 지정
		int min = b;				// 정수형 변수 min 을 선언, b로 초기화
		if (a < b)					// 만약 b가 더 크면 a 값을 min 변수에 대입
			min = a;				// return은 가장 작은 값
		return min;
	}
	public static void main(String[] args) {
		int a = (int)(Math.random() * 100) + 1;
		int b = (int)(Math.random() * 100) + 1;
		System.out.println(" a = " + a + "b = " + b);
		
		int m = max(a, b);
		System.out.println("max : " + m);
		// 매개 변수가 있고 리턴 값이 있음
		int min2 = min(a , b);	// 리턴 타입, 변수 명 = 메서드 명 (파라미터)	
		System.out.println("min : " + min2);

	}

}
