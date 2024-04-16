/*
 * 	단일 조건문
 * 	형식)
 * 		if(조건문)	=====> 반드시  true / false가 나오게끔 해야 함 ==> 부정연산자, 비교연산자, 논리연산자
 * 		{
 * 			실행 문장	==?	조건 true일 때문 수행
 * 		}
 * 	1) 정수를 입력받아 짝수 / 홀수 처리
 * 
 */

import java.util.Scanner;

public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 값을 입력받아 짝수인지 홀수인지 출력.
		 * 	1. 값을 입력받는 문장
		 * 	2. 입력 받은 값을 정수로 저장하는 문장
		 * 	3. 짝수인지 홀수인지 판단 후 출력하는 문장
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = scan.nextInt();					// 입력을 요청받아 정수로 저장.
		
		if(num %2 == 0) {						// 짝수 조건
			System.out.println(num + "는(은) 짝수 입니다.");
		}
		if(num %2 != 0) {						// 홀수 조건
			System.out.println(num + "는(은) 홀수 입니다.");
		}
	}

}
