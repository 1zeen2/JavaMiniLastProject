/*
 * 	정렬
 * 	----
 * 		선택 정렬
 * 			30 20 40 10 50 => ASC(올림차순) / DESC(내림차순)
 * 								|			=> 50 40 30 20 10 
 * 						 10 20 30 40 50 
 * 		ASC
 * 		30 20 40 10 50
 * 		-- --
 * 		20 30 
 * 		--    --
 * 		20    40 
 * 		--		 --
 * 		10       20 
 * 		--------------- 가장 작은 수를 맨 앞으로 옮김 => for문 1바퀴
 * 		|  30 40 20 50 
 * 		고정-- --
 * 		   --    --
 * 		   20    30 
 * 		   --       --
 * 		---------------	for문 2바퀴	
 * 		 |  | -- --
 * 		고  정 30 40
 * 			  --    --
 * 		---------------	for문 3바퀴
 * 		|  |  |  -- --  
 * 		고 정  값
 * 		---------------	for문 4바퀴
 * 		|  |  |  |
 * 	     고  정  값		==> .length - 1
 * 	
 * 		버블 정렬
 */
import java.util.*;
public class 중첩_for_8 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 전 : ");
		
		for (int i = 0; i <arr.length-1; i++) {
			for (int j = i + 1; i < arr.length; j++) {
				if(arr[i] > arr[j]) {					// if문의 괄호가 >면 ASC <면 DESC
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
