
public class 배열문제_9 {

	public static void main(String[] args) {
		/*
		 *  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
 		 *	int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
		 */
		
		// 정수형 배열 arr 선언과 동시에 {}안의 값으로 인덱스 개수와 값 초기화.
		int arr[] = {10, 20, 30, 50, 30, 60, -3};	
		
		// 배열 안에 있는 정수 중 값이 일치하는 인덱스를 만날 때 까지 카운트하기 위한 정수형 변수 index 선언.
		int index = 0;
		
		// for문을 통하여 0부터 정수형 변수 arr의 인덱스 값 만큼 반복문을 돌리기 위해 조건식 i < arr.length; 사용.
		// 정수형 배열 arr 안에 있는 인덱스0부터 정수 60을 만날 때 까지 0부터 정수형 변수 index의 값을 +1 반복, 
		// 값이 정수형 60인 인덱스를 만나면 break를 통해 반복문 종료.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 60) {
				index = i;
				break;
			}													
		}
		// 값이 증가한 정수형 변수 index를 통해 반복이 몇 번 되었고, 몇 번째 인덱스에 60의 값이 들어있었는지 확인하는 출력.
		System.out.println("index = " + index);	
		
/*		for (int i : arr) {
			if (i == 60)
				break;
				index++;							===> 해당 방법으로도 확인이 가능.
		}
		System.out.println("index = " + index);
*/
	}

}
