/*
 * 	정렬
 * 	---	버블 정령 (인접한 수 끼리 비교) ==> 뒤에 부터 고정
 * 	27	22	17	23	9	2		 ==>	2	9	17	22	23	27	==> ASC(올림차순)
 * 	--	--
 *	22  27
 *		--	--
 *		17	27
 *			--	--
 *			23	27
 *				--	--
 *				9	27
 *					--	--
 *					2	27
 *	-------------------------	
 *	i = 1	j = 5
 *	i = 2	j = 4	
 *	i = 3	j = 3	
 *	i = 4	j = 2	
 *	i = 5	j = 1	==> i + j = 6 ==> j = 6 - i;
 *			
 */

import java.util.Arrays;

public class 중첩_for_12 {

	public static void main(String[] args) {
		int[] arr = {27, 22, 17, 23, 9, 2};
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후 : ");
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp= arr[j];
					arr[j]	= arr[j+1];
					arr[j+1]=temp; 
				}
				
			}
			System.out.println((i+1) + "Round" + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===================================DESC===============================");
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j+1]) {
					int temp= arr[j];
					arr[j]	= arr[j+1];
					arr[j+1]=temp; 
				}
				
			}
			System.out.println((i+1) + "Round" + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
