/*
 * 	배열 => 5
 * 	---------------------
 * 		| 	|	|	|	
 * 	---------------------
 * 	---	---	---	---	---	간격이 동일해야 인덱스를 이용할 수 있다.
 * 						-------- 단위는 byte. => 4byte끼리, 8byte 끼리.
 * 												int[]	, double[]
 * 	1) 초기값	----> <---- 방향 설정 가능
 * 		0번부터 데이터를 추가할 것 인지
 * 		마지막부터 데이터를 추가할 것 인지
 * 
 * 		--------------------------
 * 		정수 입력을 받아서 => 2진법으로 출력
 * 		8bit
 * 		10 => 00001010 => 뒤에서부터 첨부
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 */

import java.util.Scanner;

public class 배열활용_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean[] b = {true , false , false, true};
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		System.out.println("0 ~ 32767까지 사이의 정수 입력 : ");		// bit => 16bit
		int input = scan.nextInt();
		
		int[] binary = new int[16];
		
		int index = binary.length - 1;	//	맨 마지막칸 
		

		
		
		System.out.println("======== API 활용 ========");
		System.out.println(Integer.toBinaryString(input));	//  2진법 라이브러리
		System.out.println(Integer.toOctalString(input));	//  8진법 라이브러리
		System.out.println(Integer.toHexString(input));		// 16진법 라이브러리
		/*
		 * 	1 100 100 
		 * 		  ---
		 *  - ---  4	=> 100을 2진법으로 하면 1100100 8진법으로 하면 144가 나온다.
		 *  1  4
		 *  
		 *  110 0100
		 *  	----
		 *  ---	 4
		 *   6
		 */
		while (true) {
			binary[index] = input %2;
			input = input /2;
			if (input == 0)	break;
			index--;
		}
		// 출력 
		for (int i = 0; i <= binary.length; i++) {
			// 4개 출력 후에 공백을 하나 넣어주었지만 가장 왼쪽은 공백을 넣지 않기 위해 i != 0을 넣음.
			if (i %4 == 0 && i != 0) {	
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
		scan.close();
	}

}
