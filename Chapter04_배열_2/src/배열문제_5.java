import java.util.*;

public class 배열문제_5 {

	public static void main(String[] args) {
		// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
		
		//	1. 정수형 배열 arr을 선언하고 10개의 인덱스(공간을 만든다)
		int[] arr = new int[10];
		
		// 	2. 초기화
		for (int i = 0; i <arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		// 	3. 요청 처리
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
		}
		double avg = sum / (double)arr.length;	//	(double)arr.length; ===> 10.0으로 형변환
		
		// 	4. 결과 값 출력
		System.out.printf("평균 : %.2f", avg);
	}
}	