// 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성
// 1. 배열 생성 후 임의의 정수 입력.
// 2. 정렬 처리
// 3. 출력
import java.util.Scanner;
public class 메서드_문제_03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.print("변경 전");
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n변경 후 : ");
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j ++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
