/*
 * 1~100사이의 정수를 10개 저장하고  
 	정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장 
 	정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장

 */
import java.util.*;
public class 문자열배열_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [10];
		int evenTotal = 0;
		int oddTotal = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) +1;
			System.out.println("정수를 출력합니다. " + arr[i]);
			if (arr[i] % 2 == 0) {
				evenTotal += arr[i];
			} else {
				oddTotal += arr[i];
			}
		}
		System.out.println(evenTotal);
		System.out.println(oddTotal);
		System.out.println("=============================================");
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수의 합 : " + evenTotal);
		System.out.println("짝수의 합 : " + oddTotal);
	}

}
