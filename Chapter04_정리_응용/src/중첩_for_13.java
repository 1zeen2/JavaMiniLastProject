//	알파벳 10개 난수 => 버블 정렬(DESC)
//  중복 없는 알파벳
import java.util.*;
public class 중첩_for_13 {

	public static void main(String[] args) {
		char[] arr = new char[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char)((Math.random() * 26 )+ 65);			
		}			
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j+1]) {
					char temp= arr[j];
					arr[j]	= arr[j+1];
					arr[j+1]=temp; 
				}
				
			}
			System.out.println((i+1) + "Round" + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
