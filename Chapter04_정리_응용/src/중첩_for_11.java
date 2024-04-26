import java.util.*;

public class 중첩_for_11 {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("[");
		
		for(int i = arr.length -1; i >= 0; i--) {

			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

}
 